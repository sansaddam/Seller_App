package add_Product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class SpecialChracterCategory_ProductTest extends Base_UtilitiesTest{
	@Test
	public void specialCharacter() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text,'Categories')]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add New Category\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter category name\"]")).sendKeys("@#$%$%^");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Create\"]")).click();
		WebElement toast = wd.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Toast[contains(@text,'Please enter category')]")));
		Assert.assertNotNull(toast, "Toast not found");
	}
}
