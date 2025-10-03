package add_Product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class EditInvalidData_ProductTest extends Base_UtilitiesTest{
	@Test
	public void editInvalidData() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Laptop, ₹ 500, In stock, Active\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Edit Product\"]")).click();
		WebElement minPurchase = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"1\"]"));
		minPurchase.clear();
		minPurchase.sendKeys("0");
		WebElement price = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"500\"]"));
		price.clear();
		price.sendKeys("500.256");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Update\"]")).click();
		WebElement toast = wd.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Toast[contains(@text,'Minimum purchase quantity')]")));
		Assert.assertNotNull(toast, "Toast not found");
	}

}
