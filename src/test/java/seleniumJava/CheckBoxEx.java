package seleniumJava;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxEx extends BasePage{
	
	By rdoMale=By.xpath("//input[@value=\"Male\"]");
	By rdoFeMale=By.xpath("//input[@value=\"FeMale\"]");
	By chkCricket=By.xpath("//input[@value=\"Cricket\"]");
	By ddlSkills=By.id("Skills");
	By ddlyearbox=By.id("yearbox");
	By ddlmonth=By.xpath("//select[@placeholder=\"Month\"]");
	By ddldaybox=By.id("daybox");

	@Test(description = "Check box/RadioButton/DropDown")
	public void LoginWithValidData() throws InterruptedException {
		driver.get("https://demo.automationtesting.in/Register.html");
		//radio button selection
//		click(rdoFeMale);
		//check box
//		click(chkCricket);
		List<WebElement>lst=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
//		 for (WebElement webElement : lst) {
//			 if(!webElement.isSelected()) {
//				 click(webElement);
//			 }
//		}
		
		//dropdown
		//select skills
		selectDropDownIndex(ddlSkills, 0);
		selectDropDownValue(ddlSkills, "APIs");
		selectDropDownVisibleText(ddlSkills, "HTML");
		//if select is the TAG- the use select class
		//if any other Tag is visible for dropdown, use click event
		//selet year
		
		selectDropDownVisibleText(ddlyearbox, "2012");
		selectDropDownVisibleText(ddlmonth, "July");
		selectDropDownVisibleText(ddldaybox, "10");
		System.out.println("done");
		List<WebElement>lst1=driver.findElements(By.tagName("a"));
		
		for (WebElement webElement : lst1) {
			webElement.click();
			String url=webElement.getAttribute("href");
			if(url.contains("html")) {
				System.out.println(url);
			}
		}
		int noOfStocks=driver.findElements(By.xpath("//table[@id=\"myTableSort\"]//tbody/tr")).size();
		Assert.assertEquals(noOfStocks, 50);
	}

}
