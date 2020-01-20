package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import util.Log;

import base.TestBase;

public class LoggedUserPage extends TestBase {
	
	private static Boolean a;
	private static WebElement element;
	public LoggedUserPage() {
		PageFactory.initElements(driver, this);
	}
	

	


		public  WebElement circle_category(String category) throws Exception{
	    	try{
	    		element=driver.findElement(By.xpath("//div[@class='circle-text-"+category+"']"));
	            Log.info("Category label present");
	    	}catch (Exception e){
	       		Log.error("Category label not present");
	       		throw(e);
	       		}
	       	return element;
		}
			
		public  Boolean loginSuccessful() {
			try{
			a= driver.findElement(By.xpath("//div[@id='toast-container']")).isDisplayed();
			Log.info("Login Sucessful");
			}
			catch (Exception e){
	       		Log.error("Login Failed");
	       		throw(e);
	       		}
	       	return a;
		
	}
}
