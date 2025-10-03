package add_Product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class MaxLength_ProductNameTest extends Base_UtilitiesTest{
	@Test
	public void maxLength() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Product\"]")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"󰅂\"])[1]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter product Name\"]")).sendKeys("Mens Tshirt Limited Editiongsdggggggggggggggggggsan");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Create\"]")).click();
		WebElement toast = wd.until(
			    ExpectedConditions.presenceOfElementLocated(
			        By.xpath("//android.widget.Toast[contains(@text,'Product name should be 50 characters only')]")
			    )
			);
			Assert.assertNotNull(toast, "Toast not found");  
	}

}
