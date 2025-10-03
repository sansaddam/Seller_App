package add_Product;

import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class SpecialCharactersPrice_ProductTest extends Base_UtilitiesTest{
	@Test
	public void specialCharactersPrice() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Product\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"󰅂\"])[1]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter product Name\"]")).sendKeys("LapTop");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"\"])[2]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\" Done\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter price\"]")).sendKeys("@#$%^^&");
		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Price must be a valid number with up to 2 decimal places\"]")).isDisplayed();
	}

}
