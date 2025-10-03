package add_Product;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;


@Listeners(Generic_Base.BaseListenerTest.class)
public class MaxPurchaseQuantityRange_ProductTest extends Base_UtilitiesTest{
	@Test
	public void maxPurchaseQuantity() {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Product\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"󰅂\"])[1]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter product Name\"]")).sendKeys("LapTop");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"\"])[2]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\" Done\"]")).click();
		WebElement min = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"1\"]"));
		min.clear();
		min.sendKeys("21");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter price\"]")).sendKeys("750");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter stock quantity\"]")).sendKeys("15");
		
	}
}
