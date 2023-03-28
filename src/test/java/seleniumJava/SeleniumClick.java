package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//TestNg
//Assertion-

//@BeforeClass
//BeforeMethod
//@test1
//@AfterMethod
//BeforeMethod
//@test2
//@AfterMethod
//@AfterClass
public class SeleniumClick extends BasePage{
	
	
	//selectorhub
//	https://chrome.google.com/webstore/detail/selectorshub/ndgimibanhlabgdgjcpbbndiehljcpfh?hl=en

//	Click(Kha?--locator)
//	normal click
//	mouse hover
//	dropdown
//Enter-(Kha?--locator,Kya?)
//
//Verify(Kha?--locator)
//	Assert.assert...
	
	
	@Test(description = "This is my first test", enabled = false)
	public void myFirstTestCase() {
		
		String mytitle=driver.getTitle();
		String expectedTitle="Facebook –log in or sign up";
		Assert.assertEquals(mytitle, expectedTitle);
//		if(mytitle.equals(expectedTitle)) {
//			System.out.println(true);
//		}
//		else {
//			System.out.println(false);
//		}
		
	}

	By email=By.xpath("//input[@id='email']");
	By password=By.xpath("//input[@id='pass']");
	By firstName=By.xpath("//input[@id='pass']");
	
	@Test(description = "Verify that user able to navigate to watchlist from portofolio on Mc home page")
	public void LoginToFB() throws InterruptedException {
		enterValue(email, "abhsiehk");
		enterValue(password, "pass");
	}
	
	@Test(description = "Verify that forget password link in visible on the page",enabled = false)
	public void verifyForgetPasswordLInk() {
		enterValue(firstName, "akjsdhkjas");
	}
	

}
