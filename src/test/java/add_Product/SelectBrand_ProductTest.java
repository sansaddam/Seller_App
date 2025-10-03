package add_Product;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class SelectBrand_ProductTest extends Base_UtilitiesTest{
	@Test
	public void selectBrand() throws InterruptedException {
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
		WebElement brandName = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"HP\"]"));
			if (brandName.isDisplayed()) {
				assertTrue(true);
			}
		
	}

}
