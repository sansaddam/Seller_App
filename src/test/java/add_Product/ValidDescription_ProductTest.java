package add_Product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class ValidDescription_ProductTest extends Base_UtilitiesTest{
	@Test
	public void valid() throws InterruptedException {
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
		+".scrollIntoView(new UiSelector().text(\"Product Details\"))"
				)
				);
		scroll.click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter product description\"]")).sendKeys("The HP Pavilion Laptop delivers reliable performance in a sleek, stylish design. Powered by the latest Intel® Core™/AMD Ryzen™ processors and fast SSD storage, it ensures smooth multitasking and responsive computing. Featuring a vibrant Full HD display, immersive audio, and long-lasting battery life, it’s perfect for students, professionals, and families who need performance on the go.");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Create\"]")).click();
		WebElement toast = wd.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Toast[contains(@text,'Your product created successfully')]")));
		Assert.assertNotNull(toast, "Toast not found");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"₹ 700\"])")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"The HP Pavilion Laptop delivers reliable performance in a sleek, stylish design. Powered by the latest Intel® Core™/AMD Ryzen™ processors and fast SSD storage, it ensures smooth multitasking and responsive computing. Featuring a vibrant Full HD display, immersive audio, and long-lasting battery life, it’s perfect for students, professionals, and families who need performance on the go.\"]")).isDisplayed();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\" Yes,Delete Product\"]")).click();
		WebElement msg = wd.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Toast[contains(@text,'Product deleted')]")));
		Assert.assertNotNull(msg, "Toast not found");
	}

}
