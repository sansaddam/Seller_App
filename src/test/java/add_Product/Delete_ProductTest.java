package add_Product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class Delete_ProductTest extends Base_UtilitiesTest{
	@Test
	public void delete() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Cake, ₹ 375, In stock, Active\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\" Yes,Delete Product\"]")).click();
		WebElement toast = wd.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Toast[contains(@text,'Product deleted')]")));
		Assert.assertNotNull(toast, "Toast not Found");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Product\"]")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"󰅂\"])[1]")).click();
		WebElement name = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter product Name\"]"));
		name.sendKeys("Cake");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Normal\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\" Done\"]")).click();
		WebElement price = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter price\"]"));
		price.sendKeys("375");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter stock quantity\"]")).sendKeys("25");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Create\"]")).click();
		
	}

}
