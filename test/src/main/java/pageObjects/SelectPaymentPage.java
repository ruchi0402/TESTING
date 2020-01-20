package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import util.Log;

import base.TestBase;



public class SelectPaymentPage extends TestBase {

	
	private static WebElement element;
	private static Boolean a;
	
	
	
    public SelectPaymentPage() {

		
		PageFactory.initElements(driver, this);
	}





public static WebElement radiobutoon_creditdebitatm() {

	try{

		
		element=driver.findElement(By.xpath("//div[@class='ui-g']//div[1]//p-radiobutton[1]//div[1]//div[2]//span[1]"));
		 Log.info("creditdebitatm radio button displayed");
		}catch (Exception e){
	   		Log.error("creditdebitatm radio button is not displayed");
	   		throw(e);
	   		}
	   	return element;
}

public static WebElement radiobutoon_cash() {

	try{

		
		element=driver.findElement(By.xpath("//div[3]//p-radiobutton[1]//div[1]//div[2]"));
		 Log.info("cash radio button displayed");
		}catch (Exception e){
	   		Log.error("cash radio button not displayed");
	   		throw(e);
	   		}
	   	return element;
}


public static WebElement radiobutoon_netbanking() {

	try{

		
		element=driver.findElement(By.xpath("//div//div[2]//p-radiobutton[1]//div[1]//div[2]//span[1]"));
		 Log.info("netbankingradio button displayed");
		}catch (Exception e){
	   		Log.error("netbankingradio button not displayed");
	   		throw(e);
	   		}
	   	return element;
}



public static WebElement button_placeorder() {

	try{

		
		element=driver.findElement(By.xpath("//button[@class='btn btn-success ng-star-inserted']"));
		 Log.info("Place Order Displayed");
		}catch (Exception e){
	   		Log.error("Place Order Displayed");
	   		throw(e);
	   		}
	   	return element;
}

public static Boolean OrderSuccessful() {
	try{
	a=  driver.findElement(By.xpath("//h2[contains(text(),'Your order is successfully placed')]")).isDisplayed();
	Log.info("Order successfully placed");
	}
	catch (Exception e){
   		Log.error("Order creeation failed");
   		throw(e);
   		}
   	return a;

}

public static void  SelectPayment(String Payment)

{

if (Payment.equals("card"))
	{
		SelectPaymentPage. radiobutoon_creditdebitatm().click();
	}
	
	else if (Payment.equals("cash"))
	{
		
	   SelectPaymentPage.radiobutoon_cash().click(); 

		
	}
	
	else if (Payment.equals("netbanking"))
	{
		
	   		SelectPaymentPage. radiobutoon_netbanking().click();
	   	
		
	}

}
}
