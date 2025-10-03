package add_Product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class OptionalFields_ProductTest extends Base_UtilitiesTest{
	@Test
	public void optionalField() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Product\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text='󰅂'])[1]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter discount\"]")).sendKeys("50");
		driver.findElement(
			    AppiumBy.androidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true))" +
			        ".scrollIntoView(new UiSelector().text(\"HSN/SAC Code\"))"
			    )
			);
		
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter stock quantity\"]")).sendKeys("50");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter loyality points\"]")).sendKeys("10");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter hsn/sac code\"]")).sendKeys("SAD29");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Create\"]")).click();	
		WebElement toast = wd.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Toast[contains(@text,'Please enter product name')]")));
		Assert.assertNotNull(toast,"Toast not found");
	}

}
