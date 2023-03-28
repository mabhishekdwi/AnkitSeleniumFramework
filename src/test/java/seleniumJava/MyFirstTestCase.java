package seleniumJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstTestCase {
	//
//junit
	//TestNg
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
//		 	System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");  
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.close();

	}

}
