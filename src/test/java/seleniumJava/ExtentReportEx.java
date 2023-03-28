package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportEx extends BasePage {
	// create the htmlReporter object
	ExtentSparkReporter htmlReporter = new ExtentSparkReporter("AutomationReport.html");

	@Test(description = "")
	public void FirstExtentReportTest() throws InterruptedException {

		ExtentTest test1 = extent.createTest("ebay Search Test", "test to validate search box ");
		test1.log(Status.INFO, "User go to the URL");
		goToTheURL("https://www.ebay.com");
		 String expectedTitleebay ="Electronics, Cars, Fashion, Collectibles & More | eBay";
		 
		 test1.log(Status.INFO, "User get title of the page");
		 
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitleebay);
		test1.pass("title is correct");

		enterValue(By.xpath("//*[@id=\"gh-ac\"]"),"Mobile");
		test1.info("Entered the text in the text box");

		// hit enter
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).sendKeys(Keys.RETURN);
		test1.info("Press keybopard enter key");

		driver.close();

		test1.pass("closed the browser");
		test1.info("test completed");

		extent.flush();
	}

}
