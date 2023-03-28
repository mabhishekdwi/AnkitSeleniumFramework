package seleniumJava;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.github.dockerjava.transport.DockerHttpClient.Request.Method;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	WebDriver driver ;
	WebElement we;
	Select select;
	ExtentSparkReporter htmlReporter = new ExtentSparkReporter("AutomationReport.html");
	ExtentReports extent;
	ExtentTest test1;
	@BeforeMethod
	public void startTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus()) {
			captureScreenShot();
		}
		driver.close();
		driver.quit();
		extent.flush();
	}
	public void beforeInvoke(Method method) {
		
		test1=extent.createTest(method.name());
	}
	/**
	 * This method is use to enter value in text box
	 * @author Abhishek.Dwivedi
	 * @param locator
	 * @param value
	 */
	public void enterValue(By locator,String value) {
		test1.log(Status.INFO, "user enter value  "+value);
		driver.findElement(locator).sendKeys(value);
	}
	public void click(By locator) {
		test1.log(Status.INFO, "user click on the element  ");
		driver.findElement(locator).click();
	}
	public void click(WebElement we) {
		test1.log(Status.INFO, "user click on the element  ");
		we.click();
	}
	public String getText(By locator) {
		test1.log(Status.INFO, "user get Text of the element  ");
		return driver.findElement(locator).getText();
	}
	public boolean isElementDisplayed(By locator) {
		test1.log(Status.INFO, "user verify the element is displayed  ");
		return driver.findElement(locator).isDisplayed();
	}
	public WebElement convertBYToWebElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void selectDropDownIndex(By locator, int value) {
		we=convertBYToWebElement(locator);
		select=new Select(we);
		select.selectByIndex(value);
		
	}
	public void selectDropDownValue(By locator,String value) {
		 we=convertBYToWebElement(locator);
		 select=new Select(we);
		 select.selectByValue(value);
	}
	public void selectDropDownVisibleText(By locator,String value) {
		 we=convertBYToWebElement(locator);
		 select=new Select(we);
		 select.selectByVisibleText(value);
	}
	public void scrollToElement(By locator) {
		Actions act=new Actions(driver);
		act.moveToElement(convertBYToWebElement(locator)).build().perform();
		
	}
	public void goToTheURL(String url) {
		test1.log(Status.INFO, "Go to the URL ");
		driver.get(url);
	}
	
	public void acceptAlert() {
		test1.log(Status.INFO, "accept Alert ");
		driver.switchTo().alert().accept();
	}
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}
	public void InputInAlert(String value) {
		driver.switchTo().alert().sendKeys(value);
	}
	public void enterValueJS(By locator,String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].value = arguments[1]", convertBYToWebElement(locator), value);
	}
	public void clickJS(By locator) {
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].click();", convertBYToWebElement(locator));
	}
	public void captureScreenShot() throws IOException {
		TakesScreenshot takesc= (TakesScreenshot)driver;
		File src=takesc.getScreenshotAs(OutputType.FILE);
		
		String dateTime = new SimpleDateFormat("yyyyMMddHHmm'.png'").format(new Date());
		String screenName="screenshot"+dateTime;
		
		File des=new File("C:\\MyAutomationWithJava\\MySeleniumJavaProject\\ScreenShot\\"+screenName);
		FileUtils.copyFile(src, des);
	}
	
}
