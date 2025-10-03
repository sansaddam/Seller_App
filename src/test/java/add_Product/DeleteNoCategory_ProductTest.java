package add_Product;

import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class DeleteNoCategory_ProductTest extends Base_UtilitiesTest{
	
	@Test
	public void deleteNo() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text,'Categories')]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Gaming Laptops\"])[1]/parent::android.view.ViewGroup//android.view.ViewGroup//android.widget.TextView")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Delete\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\" No\"]")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Gaming Laptops\"])[1]")).isDisplayed();
	}

}
