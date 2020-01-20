package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import util.Log;

public class AccountPage extends TestBase {
	
	private static WebElement element;

	
	public AccountPage() {
		
		PageFactory.initElements(driver, this);
		
			
		}
	
	public static WebElement txtbx_Custname() throws Exception{
    	try{
    		element=driver.findElement(By.id("name"));
            Log.info("Customer name text box is found on the Login Page");
    	}catch (Exception e){
       		Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        }
	
	public static WebElement txtbx_mobileno() throws Exception{
    	try{
    		element=driver.findElement(By.id("mobileNo"));
            Log.info("Customer name text box is found on the Login Page");
    	}catch (Exception e){
       		Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        }
	
	public static WebElement txtbx_email() throws Exception{
    	try{
    		element=driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/bmf-layout[1]/div[2]/app-login[1]/div[1]/p-sidebar[1]/div[1]/app-signup[1]/div[1]/div[1]/form[1]/div[3]/input[1]"));
            Log.info("Customer name text box is found on the Login Page");
    	}catch (Exception e){
       		Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        }
	
	public static WebElement txtbx_password() throws Exception{
    	try{
    		element=driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/bmf-layout[1]/div[2]/app-login[1]/div[1]/p-sidebar[1]/div[1]/app-signup[1]/div[1]/div[1]/form[1]/div[4]/div[1]/input[1]"));
            Log.info("Customer name text box is found on the Login Page");
    	}catch (Exception e){
       		Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        }
	
	public static WebElement button_register() throws Exception{
    	try{
    		element=driver.findElement(By.xpath("//button[contains(text(),'Register')]"));
            Log.info("Customer name text box is found on the Login Page");
    	}catch (Exception e){
       		Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return element;
        }
	
	
}