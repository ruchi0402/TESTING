package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import util.TestUtil;
public class BrowserInstatiate extends TestBase {
	
	
	public static void instatiateBrowser(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\SDET\\TEST1\\Resources\\chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Admin\\Desktop\\SDET\\TEST1\\Resources\\geckodriver.exe");
			driver = new FirefoxDriver(); 
		}
		
		

				
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	

}
