package add_Product;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class CreateBrand_ProductTest extends Base_UtilitiesTest{
	@Test
	public void createBrand() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Product\"]")).click();
		Thread.sleep(2000);
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
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\" + Add Brand\"]")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=' Save']/preceding-sibling::android.view.ViewGroup/android.widget.EditText")).sendKeys("Dell");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\" Save\"]")).click();
		
		try {
			WebElement toast = wd.until(
				    ExpectedConditions.presenceOfElementLocated(
				        By.xpath("//android.widget.Toast[contains(@text,'Brand name exists')]")
				    )
				);
				Assert.assertNotNull(toast, "Toast not found");
		} catch (Exception e) {
			WebElement brandName = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Dell\"]"));
			if (brandName.isDisplayed()) {
				assertTrue(true);
			}
		}
		
	}

}
