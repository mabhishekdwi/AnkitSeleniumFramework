package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamMeterisationEx extends BasePage{
	By txtUsername=By.id("email");
	By lnkFOrgetPassword=By.linkText("Forgotten password?");
	By txtPassword=By.xpath("//input[@id='pass']");
	By btnLogin=By.name("login");
	
	@Test
	@Parameters({"user","pass"})
	public void LoginWithData(String user,String pass) {
		System.out.println(user+" "+pass);
//		enterValue(txtUsername, user);
//		enterValue(txtPassword, pass);
	}
	@Test
	@Parameters({"Browser"})
	public void LoginWithData(String Browser) {
		launchBrowser(Browser);
//		System.out.println(user+" "+pass);
//		enterValue(txtUsername, user);
//		enterValue(txtPassword, pass);
	}
	
	void launchBrowser(String Browser){
		if(Browser.equals("Chome")) {
			driver=new ChromeDriver();
		}
		else if(Browser.equals("FF")) {
			driver=new FirefoxDriver();
		}
	}
}
