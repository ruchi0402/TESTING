
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import util.Log;

import base.TestBase;

public class ProductDetailPage extends TestBase {
	
	private static WebElement element;
	
	
	
public ProductDetailPage() {

		
		PageFactory.initElements(driver, this);
	}
	

public static WebElement button_buyNow() {

	try{

		
		element=driver.findElement(By.xpath("//div[@class='float-right']//button[@class='btn btn-danger space'][contains(text(),'Buy Now')]"));
		 Log.info("Buy Now button displayed");
		}catch (Exception e){
	   		Log.error("Buy Now button not displayed");
	   		throw(e);
	   		}
	   	return element;
}

}
