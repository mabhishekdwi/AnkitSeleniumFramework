package seleniumJava;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public String path="C:\\MyAutomationWithJava\\MySeleniumJavaProject\\configuration.properties";
	Properties p=new Properties();
	
	public String ReadConfigdata(String key) throws IOException {
		FileReader reader=new FileReader(path);  
	    p.load(reader);  
	      
	   return p.getProperty(key);
		  
	}

}
