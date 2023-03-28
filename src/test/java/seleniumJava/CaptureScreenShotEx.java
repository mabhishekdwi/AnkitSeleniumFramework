package seleniumJava;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CaptureScreenShotEx extends BasePage{
	ConfigReader obj=new ConfigReader();
	
	
	@Test
	public void TestScreenShot1() throws InterruptedException, IOException {
		goToTheURL(obj.ReadConfigdata("baseurl"));
		Assert.assertEquals(2, 5);
		driver.findElement(By.xpath("")).getCssValue("color");
		driver.findElement(By.xpath("")).getCssValue("background-color");
	}
	@Test
	public void TestLogin2() throws IOException
	{
//		enterValue(null, obj.ReadConfigdata("username"));
//		enterValue(null, url);
		obj.ReadConfigdata("baseurl");
		System.out.println(obj.ReadConfigdata("baseurl"));
		goToTheURL(obj.ReadConfigdata("baseurl"));
		getText(null).equals("Market");
		
	}

}
