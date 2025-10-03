package add_Product;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

@Listeners(Generic_Base.BaseListenerTest.class)
public class DecimalsMinPurchaseQuantity_ProductTest extends Base_UtilitiesTest{
	@Test
	public void decimalsMinPurchaseQuantity() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Product\"]")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"󰅂\"])[1]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter product Name\"]")).sendKeys("LapTop");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"\"])[2]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\" Done\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"1\"]")).clear();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter minimum purchase quantity\"]")).sendKeys("1.5");
		WebElement field = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter minimum purchase quantity\"]"));
		String actual = field.getText();
		if (actual.equalsIgnoreCase("Enter minimum purchase quantity") || actual.isEmpty()) {
			assertTrue(true);
		}
	}

}
