package add_Product;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class NumericPrice_ProductTest extends Base_UtilitiesTest{
	@Test
	public void numericPrice() {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Product\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"󰅂\"])[1]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter product Name\"]")).sendKeys("LapTop");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"\"])[2]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\" Done\"]")).click();
		WebElement price = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter price\"]"));
		price.sendKeys("500");
		String actual = price.getText();
		assertEquals(actual, "500");
	}

}
