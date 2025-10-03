package add_Product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class CreateValidVariante_ProductTest extends Base_UtilitiesTest{
	@Test
	public void createVariante() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Product\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"󰅂\"])[1]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter product Name\"]")).sendKeys("LapTop");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"\"])[2]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\" Done\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter price\"]")).sendKeys("700");
		WebElement stock = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter stock quantity\"]"));
		stock.sendKeys("50");
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
		+".scrollIntoView(new UiSelector().text(\"Variant Products\"))"
				)
				);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Variant Products\"]/following-sibling::android.widget.Switch")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ Add Variant\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter variant name\"]")).sendKeys("Ultrabooks");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter variant value\"]")).sendKeys("Slim, lightweight, long battery life (portable work).");
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Save\"]")).click();
		try {
			WebElement toast = wd.until(
				    ExpectedConditions.presenceOfElementLocated(
				        AppiumBy.xpath("//android.widget.Toast[contains(@text,'Attribute name exists')]")
				    )
				);
				Assert.assertNotNull(toast, "Toast not found");
		} 
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
