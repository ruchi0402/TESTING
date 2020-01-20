package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import util.Log;

import base.TestBase;

public class ItemSelectPage extends TestBase  {
	

	private static WebElement element;
	
	
	
public ItemSelectPage() {

		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public WebElement image_item(String  name) {
		
		try{
	
		
		element=driver.findElement(By.xpath("//b[contains(text(),'"+name+"')]"));	
		 Log.info("Item Present");
    	}catch (Exception e){
       		Log.error("Item Not present");
       		throw(e);
       		}
       	return element;
	}
	
	

	
	

}
