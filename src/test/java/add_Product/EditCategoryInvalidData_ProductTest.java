package add_Product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class EditCategoryInvalidData_ProductTest extends Base_UtilitiesTest{
	@Test
	public void editInvalidData() {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text,'Categories')]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Gaming Laptops\"])[1]/parent::android.view.ViewGroup//android.view.ViewGroup//android.widget.TextView")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Edit\"]")).click();
		WebElement name = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Gaming Laptops\"]"));
		name.clear();
		name.sendKeys("Gaming Laptops");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Update\"]")).click();
		WebElement toast = wd.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Toast[contains(@text,'Category updated')]")));
		Assert.assertNotNull(toast, "Toast Not Found");
	}


}
