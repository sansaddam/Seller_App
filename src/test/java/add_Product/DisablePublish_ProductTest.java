package add_Product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class DisablePublish_ProductTest extends Base_UtilitiesTest{
	@Test
	public void disable() {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text,'Products')]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"LapTop\"])[1]/parent::android.view.ViewGroup//android.view.ViewGroup//android.widget.TextView")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.Switch")).click();
		WebElement toast = wd.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Toast[contains(@text,'Product')]")));
		Assert.assertNotNull(toast, "Toast Not Found");
	}

}
