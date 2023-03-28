package seleniumJava;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//https://www.guru99.com/implicit-explicit-waits-selenium.html
public class WaitEx extends BasePage{
	//Thread.sleep()-stop your script for X sec
	
	
	//Implicit wait-Use once
//	2-It use to wait for each line -use at the top of the Test case/Class
//	3-If time is expire, TimeOutException
	//Explicit wait-NoSuchElementexception/particular condition
	//
	//FluentWait
	By btnLogin=By.xpath("");
	@Test
	public void TestImplicitWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println();
		System.out.println();
		System.out.println();
		//3---15--20
		System.out.println();
//		{15--30--60-90-150}
		
		WebDriverWait wait=new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.presenceOfElementLocated(btnLogin));
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println();
		
		System.out.println();
//		16
		System.out.println();
//		19
		System.out.println();
//		1-5-10-20-21
		System.out.println();
		
		Wait wt=new FluentWait(driver)
				.withTimeout(120,TimeUnit.SECONDS)
				.pollingEvery(10,TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
	}
	
	public void checkWait(int max, int poll) {
		for(int i=0;i<=max;i=i+20) {
			WebDriverWait wt=new WebDriverWait(driver, i);
			wt.until(ExpectedConditions.presenceOfAllElementsLocatedBy(btnLogin));
		}
		
	}
	
	

}
