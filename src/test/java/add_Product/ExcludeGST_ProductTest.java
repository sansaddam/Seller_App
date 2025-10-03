package add_Product;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class ExcludeGST_ProductTest extends Base_UtilitiesTest{
	@Test
	public void excludeGST() throws InterruptedException {
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
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter loyality points\"]")).sendKeys("10.50");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter hsn/sac code\"]")).sendKeys("9999");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Include GST\"]/following-sibling::android.widget.Switch")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Select Gst\"])[2]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"12%\"]")).click();
		WebElement gst = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"12\"]"));
		if (gst.isDisplayed()) {
			assertTrue(true);
		} else {
			Assert.fail("GST not Found");
		}
	}
	

}
