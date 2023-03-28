package seleniumJava;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertEx extends BasePage {
//===============Alert===================================
	By btnAlert = By.xpath("//button[@class='btn btn-danger']");
	By btnOKAndCancel = By.xpath("//a[normalize-space()='Alert with OK & Cancel']");
	By btnDisplayAConfirmBox = By.xpath("//button[@class='btn btn-primary']");
	By lblYouPressed = By.xpath("//p[@id='demo']");
	By btnAlertWithTextbox = By.xpath("//a[normalize-space()='Alert with Textbox']");
	By btnpPromptBox = By.xpath("//button[@class='btn btn-info']");
	By lblForTextBoxmsg = By.xpath("//p[@id='demo1']");
//===============Windows============================
	By btnNewTab=By.xpath("//a[@href='http://www.selenium.dev']//button[@class='btn btn-info'][normalize-space()='click']");
	By secWindow=By.xpath("//a[normalize-space()='Open New Seperate Windows']");
	
	@Test
	public void TestAlert1() throws InterruptedException {
		goToTheURL("https://demo.automationtesting.in/Alerts.html");
		click(btnAlert);
		acceptAlert();
		click(btnOKAndCancel);
		Thread.sleep(1000);
		click(btnDisplayAConfirmBox);
		dismissAlert();
		Assert.assertTrue(isElementDisplayed(lblYouPressed));
		String input = "abhsihek";
		Thread.sleep(1000);
		click(btnAlertWithTextbox);
		click(btnpPromptBox);
		InputInAlert(input);
		acceptAlert();
		Assert.assertTrue(getText(lblForTextBoxmsg).contains(input));
	}

	@Test
	public void TestWindows() throws InterruptedException {
		goToTheURL("https://demo.automationtesting.in/Windows.html");
		String parentwindow=driver.getWindowHandle();
		click(btnNewTab);
//		Set<String>noOfWindows= driver.getWindowHandles();
//		Iterator<String>it=noOfWindows.iterator();
//		while (it.hasNext()) {
//			String win=it.next();
//			driver.switchTo().window(win);
//			Thread.sleep(3000);
//			String url=driver.getCurrentUrl();
//			Assert.assertTrue(url.contains("https://www.selenium.dev/"));
//		}
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
//		Assert.assertTrue(url.contains("https://www.selenium.dev/"));
		Thread.sleep(2000);
		driver.switchTo().window(parentwindow);
		click(secWindow);
		
	}
}
