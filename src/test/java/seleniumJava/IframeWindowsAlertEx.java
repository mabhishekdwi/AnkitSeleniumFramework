package seleniumJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class IframeWindowsAlertEx extends BasePage{
	
	By text1=By.xpath("//input[@type=\"text\"]");
	By btnMultiIframe=By.xpath("//a[text()='Iframe with in an Iframe']");
	By btnSingleIframe=By.xpath("//a[text()='Single Iframe ']");
	@Test
	public void IframeTest1() throws InterruptedException {
		driver.get("https://demo.automationtesting.in/Frames.html");
		
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("singleframe")
//		driver.switchTo().frame(we)
//		driver.switchTo().parentFrame();
//		enterValue(text1, "abhishek");
		
//		Thread.sleep(2000);
//		driver.switchTo().parentFrame();
//		driver.switchTo().defaultContent();
		click(btnMultiIframe);
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/section/div/div/iframe")));
		Thread.sleep(1000);
		enterValue(text1, "abhishek");
		driver.switchTo().defaultContent();
//		driver.switchTo().parentFrame();
		click(btnSingleIframe);
		Thread.sleep(1000);
	}
	@Test
	public void guruTest() {
		driver.get("https://demo.guru99.com/test/guru99home/");  
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	    int size = driver.findElements(By.tagName("iframe")).size();
	    System.out.println("Total Frames --" + size);
               
		// prints the total number of frames 
		driver.switchTo().frame(0); // Switching the Outer Frame    		
	    System.out.println (driver.findElement(By.xpath("xpath of the outer element ")).getText());

		//Printing the text in outer frame
		size = driver.findElements(By.tagName("iframe")).size();
	    // prints the total number of frames inside outer frame           
                                                                                                          
	    System.out.println("Total Frames --" + size);
	    driver.switchTo().frame(0); // Switching to innerframe
	    System.out.println(driver.findElement(By.xpath("xpath of the inner element ")).getText());
		
		//Printing the text in inner frame
		driver.switchTo().defaultContent();
	
	}

}
