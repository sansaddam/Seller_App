package add_Product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class NumericsLoyaltyPoints_ProductTest extends Base_UtilitiesTest{
	@Test
	public void numericsLoyaltyPoints() throws InterruptedException {
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
		WebElement scroll = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
		+".scrollIntoView(new UiSelector().text(\"Select product unit\"))"
				)
				);
		scroll.click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"piece\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Select product brand\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"HP\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter loyality points\"]")).sendKeys("10");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Create\"]")).click();
		WebElement toast = wd.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Toast[contains(@text,'Your product created successfully')]")));
		Assert.assertNotNull(toast, "Toast not found");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"₹ 700\"])")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\" Yes,Delete Product\"]")).click();
		WebElement msg = wd.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Toast[contains(@text,'Product deleted')]")));
		Assert.assertNotNull(msg, "Toast not found");
	}

}
