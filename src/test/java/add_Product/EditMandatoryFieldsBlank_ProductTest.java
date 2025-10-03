package add_Product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class EditMandatoryFieldsBlank_ProductTest extends Base_UtilitiesTest{
	@Test
	public void editMandatoryFieldsBlank() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Laptop, ₹ 500, In stock, Active\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Edit Product\"]")).click();
		WebElement name = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Laptop\"]"));
		name.clear();
		WebElement minPurchase = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"1\"]"));
		minPurchase.clear();
		WebElement price = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"500\"]"));
		price.clear();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Update\"]")).click();
		WebElement toast = wd.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Toast[contains(@text,'Please enter product name')]")));
		Assert.assertNotNull(toast, "Toast not found");
	}

}
