package pageObjects;

import org.openqa.selenium.By;
import util.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {
	
	
			

	
	@FindBy(id="emailId")
	private WebElement email ;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//form[@class='ng-pristine ng-invalid ng-touched']//button[@class='btn btn-warning btn-lg btn-block'][contains(text(),'Clear')]")
	private WebElement clearButton;
	
	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	private WebElement signInButton;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-md']")
	private WebElement createAccount;
	




	
	public LoginPage() {

		
		PageFactory.initElements(driver, this);
	}
		
	
	public  WebElement txtbox_emaild() throws Exception{
    	try{
    		if (email.isDisplayed())
            Log.info("Email text box is found on the Login Page");
    	}catch (Exception e){
       		Log.error("Email text box is not found on the Login Page");
       		throw(e);
       		}
       	return email;
	}
	
	
       	public  WebElement txtbox_password() throws Exception{
        	try{
        		if (password.isDisplayed())
                Log.info("Password text box is found on the Login Page");
        	}catch (Exception e){
           		Log.error("Password text box is not found on the Login Page");
           		throw(e);
           		}
           	return password;
       	}
           	
           	public  WebElement button_signIn() throws Exception{
            	try{
            		if (signInButton.isDisplayed())
                    Log.info("Sign in button is found on the Login Page");
            	}catch (Exception e){
               		Log.error("Sign in button is not found on the Login Page");
               		throw(e);
               		}
               	return signInButton;
           	}
           	
        	public  WebElement button_createAccount() throws Exception{
            	try{
            		if (createAccount.isDisplayed())
                    Log.info("Create Account Button is found on the Login Page");
            	}catch (Exception e){
               		Log.error("Create Account Button is not found on the Login Page");
               		throw(e);
               		}
               	return createAccount;
           	}
	
	

}
