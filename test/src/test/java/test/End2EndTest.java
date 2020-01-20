package test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BrowserInstatiate;
import base.TestBase;
import pageObjects.HomePage;
import pageObjects.ItemSelectPage;
import pageObjects.LoggedUserPage;
import pageObjects.LoginPage;
import pageObjects.OrderDetailsPage;
import pageObjects.ProductDetailPage;
import pageObjects.SelectPaymentPage;
import util.TestUtil;
import util.Log;



public class End2EndTest extends TestBase {
	
	String sheetName="ProductData";
		
	
	public End2EndTest() {
		super();
	}
	
	@BeforeMethod	
	public void setup() {
		
		BrowserInstatiate.instatiateBrowser();
		
						
		}
	
	@DataProvider
	public Object[][] getProductData()throws Exception 
	{
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	@Test(priority=1, dataProvider="getProductData")
	public void VerifyPurchaseProductTest(String username, String password, String Category, String Item, String Payment) throws Exception {	
	
		
			try{
				HomePage homepage=new HomePage();
				homepage.link_signInLink().click();
		    	Log.info("Click action is performed on SignIn link" );
		    	LoginPage loginpage=new LoginPage(); 		    	
		    	loginpage.txtbox_emaild().sendKeys(username);		       
		        // Printing the logs for what we have just performed
		        Log.info(username +" is entered in UserName text box" );		             
		        loginpage.txtbox_password().sendKeys(password);
		        Log.info(password +" is entered in Password text box" );		        
		        loginpage.button_signIn().click();	
		        LoggedUserPage loggeduserpage=new LoggedUserPage();
		        Log.info("Click action is performed on Submit button");
		        Assert.assertTrue(loggeduserpage.loginSuccessful());
		        Log.info("Logged in Sucessfully");
		        loggeduserpage.circle_category(Category).click();
		        Log.info("Clicked on category");
		        ItemSelectPage itemselectpage=new ItemSelectPage();
		        itemselectpage.image_item(Item).click();
		        Log.info("Clicked on item");
		        
		        ProductDetailPage.button_buyNow().click();
		        Log.info("Clicked on Buy Now");
		       if( OrderDetailsPage.image_SelectProduct(Item).isDisplayed())
		       {
		    	   Log.info("Product Detail Displayed");
		    	   OrderDetailsPage.button_placeorder().click();
		    	   driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
		       }
		       else
		       {
		    	   Log.error("Not Displayed"); 
		    	   Log.error("Quitting the test");
		    	   driver.quit();
		       }
		       
		     SelectPaymentPage.SelectPayment(Payment);
		      Log.info("Payment Selected");
		       
		    SelectPaymentPage.button_placeorder().click();
		       
		       Assert.assertTrue(SelectPaymentPage.OrderSuccessful());
		       Log.info("Logged in Sucessfully");
		       
		       Reporter.log("SignIn Action is successfully perfomred");
		       
		   
				  }catch (Exception e){
				
				  Log.error(e.getMessage());
				  throw(e);
				  
				  }
				
		  }
    
	
	

	@AfterMethod
		public void tearDown(ITestResult result){
		if(ITestResult.FAILURE==result.getStatus())
		{
			try {
				TestUtil.takeScreenshotAtEndOfTest();
			} catch (IOException e) {
				e.printStackTrace();
				
			}
		}
		
		else if (ITestResult.SUCCESS==result.getStatus())
		{
			try {
				TestUtil.takeScreenshotAtEndOfTest();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			driver.quit();
		}
	
}

