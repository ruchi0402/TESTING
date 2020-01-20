package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import util.Log;

public class HomePage extends TestBase{
	
	@FindBy(xpath = "//div[@id='navbarSupportedContent']/form/button[@type='button']/span[@class='mat-button-wrapper']")
	private WebElement signInLink;
	
	

	

	
	//Object Repository or OR or Page Factory Elements

	

	
		

	//Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	//Actions:
	
		
		
	public WebElement link_signInLink() throws Exception{
    	try{
    		if (signInLink.isDisplayed())
            Log.info("Login Link is Displayed");
    	}catch (Exception e){
       		Log.error("Login Link not Displayed");
       		throw(e);
       		}
       	return signInLink;
        }
	
}