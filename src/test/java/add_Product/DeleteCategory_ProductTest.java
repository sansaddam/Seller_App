package add_Product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class DeleteCategory_ProductTest extends Base_UtilitiesTest{
	@Test
	public void deleteCategory() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text,'Categories')]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Gaming Laptops\"])[1]/parent::android.view.ViewGroup//android.view.ViewGroup//android.widget.TextView")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Delete\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\" Yes,Delete category\"]")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add New Category\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter category name\"]")).sendKeys("Gaming Laptops");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Create\"]")).click();
		WebElement toast = wd.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Toast[contains(@text,'Category added')]")));
		Assert.assertNotNull(toast, "Toast not found");
	}
}
