package base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.Properties;
import org.openqa.selenium.WebDriver;



//import util.WebEventListener;


public class TestBase  {
	public static WebDriver driver;
	public static Properties prop;
	
	
	

	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Admin\\git\\repository\\test\\src\\main\\java\\config\\config.properties");
			prop.load(ip);
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

	
	
	
	
	
	
	

}






	
	

	

	