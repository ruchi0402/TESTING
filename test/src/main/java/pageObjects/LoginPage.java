package pageObjects;

import org.openqa.selenium.By;
import util.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {
	
	
			

	private static WebElement element;
	
	
	



	
	public LoginPage() {

		
		PageFactory.initElements(driver, this);
	}
		
	
	public static WebElement txtbox_emaild() throws Exception{
    	try{
    		element=driver.findElement(By.id("emailId"));
            Log.info("Email text box is found on the Login Page");
    	}catch (Exception e){
       		Log.error("Email text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
	}
	
	
       	public static WebElement txtbox_password() throws Exception{
        	try{
        		element=driver.findElement(By.id("password"));
                Log.info("Password text box is found on the Login Page");
        	}catch (Exception e){
           		Log.error("Password text box is not found on the Login Page");
           		throw(e);
           		}
           	return element;
       	}
           	
           	public static WebElement button_signIn() throws Exception{
            	try{
            		element=driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
                    Log.info("Sign in button is found on the Login Page");
            	}catch (Exception e){
               		Log.error("Sign in button is not found on the Login Page");
               		throw(e);
               		}
               	return element;
           	}
           	
        	public static WebElement button_createAccount() throws Exception{
            	try{
            		element=driver.findElement(By.xpath("//button[@class='btn btn-primary btn-md']"));
                    Log.info("Create Account Button is found on the Login Page");
            	}catch (Exception e){
               		Log.error("Create Account Button is not found on the Login Page");
               		throw(e);
               		}
               	return element;
           	}
	
	

}
