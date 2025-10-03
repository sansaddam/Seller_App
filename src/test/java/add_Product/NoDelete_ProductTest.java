package add_Product;

import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class NoDelete_ProductTest extends Base_UtilitiesTest{
	@Test
	public void noDelete() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Cake, ₹ 375, In stock, Active\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\" No\"]")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Cake\"]")).isDisplayed();
	}
}
