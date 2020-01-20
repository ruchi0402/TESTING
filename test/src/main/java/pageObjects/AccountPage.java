package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import util.Log;

public class AccountPage extends TestBase {
	
	
	
	@FindBy(id="name")
	private WebElement custname;
	
	@FindBy(id="mobileNo")
	private WebElement mobileNo;
		
	@FindBy(xpath ="/html[1]/body[1]/app-root[1]/bmf-layout[1]/div[2]/app-login[1]/div[1]/p-sidebar[1]/div[1]/app-signup[1]/div[1]/div[1]/form[1]/div[3]/input[1]")
	private WebElement email;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/bmf-layout[1]/div[2]/app-login[1]/div[1]/p-sidebar[1]/div[1]/app-signup[1]/div[1]/div[1]/form[1]/div[4]/div[1]/input[1]")
	private WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Register')]")
	private WebElement registerButton;

	
	public AccountPage() {
		
		PageFactory.initElements(driver, this);
		
			
		}
	
	public  WebElement txtbx_Custname() throws Exception{
    	try{
    		if (custname.isDisplayed())
            Log.info("Customer name text box is found on the Login Page");
    	}catch (Exception e){
       		Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return custname;
        }
	
	public  WebElement txtbx_mobileno() throws Exception{
    	try{
    		if (mobileNo.isDisplayed())
            Log.info("Customer name text box is found on the Login Page");
    	}catch (Exception e){
       		Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return mobileNo;
        }
	
	public  WebElement txtbx_email() throws Exception{
    	try{
    		if (email.isDisplayed())
            Log.info("Customer name text box is found on the Login Page");
    	}catch (Exception e){
       		Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return email;
        }
	
	public  WebElement txtbx_password() throws Exception{
    	try{
    		if (password.isDisplayed())
    		
            Log.info("Customer name text box is found on the Login Page");
    	}catch (Exception e){
       		Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return password;
        }
	
	public  WebElement button_register() throws Exception{
    	try{
    		if (registerButton.isDisplayed())
            Log.info("Customer name text box is found on the Login Page");
    	}catch (Exception e){
       		Log.error("UserName text box is not found on the Login Page");
       		throw(e);
       		}
       	return registerButton;
        }
	
	
}