package seleniumJava;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
//https://mvnrepository.com/artifact/com.relevantcodes/extentreports/2.41.2
public class LoginTest extends BasePage{
	
//	By txtUsername=By.xpath("//input[@id='email']");
	By txtUsername=By.id("email");
	By lnkFOrgetPassword=By.linkText("Forgotten password?");
	By txtPassword=By.xpath("//input[@id='pass']");
	By btnLogin=By.name("login");
	By eleErrorMsg=By.xpath("//div[normalize-space()='Invalid username or password']");
	By lblHomePage=By.xpath("//div[normalize-space()='Invalid username or password']");
	@Test(description = "Login With Valid Data")
	public void LoginWithValidData() throws InterruptedException {
		test1=extent.createTest("Login With Valid Data","Login kro");
		goToTheURL("https://www.facebook.com/");
		
		enterValue(txtUsername, "abhishek");
		enterValue(txtPassword, "abhishek");
		Thread.sleep(2000);
		click(btnLogin);
		
		
//		String errMsg=getText(eleErrorMsg);
//		Assert.assertEquals(errMsg, "Invalid username or password");
		boolean flag=isElementDisplayed(lblHomePage);
		test1.log(Status.PASS, "TUser should able to move to next page."+ flag);
		Assert.assertTrue(flag);
		
		
	
		
	}
	@Test(description = "Login With Valid Data")
	public void LoginWithValidData1() throws InterruptedException {
		test1=extent.createTest("Login With Valid Data","Login kro");
		goToTheURL("https://www.facebook.com/");
		
		enterValue(txtUsername, "abhishek");
		enterValue(txtPassword, "abhishek");
		Thread.sleep(2000);
		click(btnLogin);
		
		
//		String errMsg=getText(eleErrorMsg);
//		Assert.assertEquals(errMsg, "Invalid username or password");
		boolean flag=isElementDisplayed(lblHomePage);
		test1.log(Status.PASS, "TUser should able to move to next page."+ flag);
		Assert.assertTrue(flag);
		
		
	
		
	}
	
}
