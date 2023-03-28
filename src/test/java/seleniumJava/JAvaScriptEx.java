package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;


public class JAvaScriptEx extends BasePage {
	By txtFirstName=By.xpath("//input[@placeholder='First Name']");
	@Test
	public void TestAlert1() throws InterruptedException {
		goToTheURL("https://demo.automationtesting.in/Register.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].click();", txtFirstName);
		clickJS(txtFirstName);
		js.executeScript("arguments[0].value = arguments[1]", convertBYToWebElement(txtFirstName), "abhishek");
		 js.executeScript("return document.title");
		enterValueJS(txtFirstName,"abhishek");
		System.out.println("");
	}

}
