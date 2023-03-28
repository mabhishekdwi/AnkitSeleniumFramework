package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverEx extends BasePage{
	By eleSwitchTo=By.xpath("//a[text()='SwitchTo']");
	By eleIntraction=By.xpath("//a[text()='Interactions ']");
	By eleDragAndDrop=By.xpath("//a[text()='Drag and Drop ']");
	By eleStatic=By.xpath("//a[text()='Static ']");
	By eleAlert=By.xpath("//a[text()='Alerts']");
	By eleSource=By.id("angular");
	By eleDestination=By.id("droparea");
	
	@Test
	public void MouseHover() throws InterruptedException {
	driver.get("https://demo.automationtesting.in/Register.html");
	Actions act=new Actions(driver);
//	act.moveToElement(convertBYToWebElement(eleSwitchTo)).build().perform();
//	Thread.sleep(3000);
//	click(eleAlert);
//	act.contextClick(convertBYToWebElement(eleSwitchTo)).build().perform();
//	Thread.sleep(1000);
	
	act.moveToElement(convertBYToWebElement(eleIntraction)).build().perform();
	click(eleDragAndDrop);
	click(eleStatic);
	Thread.sleep(1000);
	System.out.println(driver.getCurrentUrl());
	act.dragAndDrop(convertBYToWebElement(eleSource),convertBYToWebElement(eleDestination))
	.build().perform();
	Thread.sleep(3000);
	act.doubleClick().build().perform();
	
	
	act.sendKeys(Keys.BACK_SPACE).build().perform();
	act.sendKeys(Keys.CONTROL).sendKeys(Keys.ALT).sendKeys(Keys.DELETE).build().perform();
	
	act.sendKeys(Keys.ENTER).build().perform();
	act.moveByOffset(30,10).build().perform();
	driver.manage().window().getPosition();
	}
	
}
