package add_Product;

import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class InvalidHSN_ProductTest extends Base_UtilitiesTest{
	@Test
	public void invalidHSN() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Product\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"󰅂\"])[1]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter product Name\"]")).sendKeys("LapTop");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"\"])[2]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\" Done\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter price\"]")).sendKeys("250");
		driver.findElement(
				    AppiumBy.androidUIAutomator(
				        "new UiScrollable(new UiSelector().scrollable(true))" +
				        ".scrollIntoView(new UiSelector().text(\"HSN/SAC Code\"))"
				    )
				);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter hsn/sac code\"]")).sendKeys("@#SAD123");
	}

}
