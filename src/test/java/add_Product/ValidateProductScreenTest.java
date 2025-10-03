package add_Product;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;


public class ValidateProductScreenTest extends Base_UtilitiesTest{
	@Test
	public void validate() {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Product\"]")).click();
		WebElement productScreen = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add product\"]"));
		if(productScreen.isDisplayed()) {
			assertTrue(true);
		}
		
	    
	}

}
