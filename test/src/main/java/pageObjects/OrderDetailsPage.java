package pageObjects;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

import util.Log;

import base.TestBase;

public class OrderDetailsPage extends TestBase  {
	
	
	private static WebElement element;
	private static Boolean a;
	
public OrderDetailsPage() {

		
		PageFactory.initElements(driver, this);
	}






public static WebElement image_SelectProduct(String  itemdetail) {
	
	try{

	
	element=driver.findElement(By.xpath("//h2[contains(text(),'"+itemdetail+"')]"));
	 Log.info("Select Product Information Displayed");
	}catch (Exception e){
   		Log.error("Select Product Information is not Displayed");
   		throw(e);
   		}
   	return element;
}

public static WebElement button_placeorder() {

	try{

		
		element=driver.findElement(By.xpath("//button[contains(text(),'Place Order')]"));
		 Log.info("Place order button displayed");
		}catch (Exception e){
	   		Log.error("Place order button displayed");
	   		throw(e);
	   		}
	   	return element;
}




}

