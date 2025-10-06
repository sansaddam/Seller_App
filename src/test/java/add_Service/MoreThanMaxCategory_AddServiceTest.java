package add_Service;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.Base_Utilities54Test;
import io.appium.java_client.AppiumBy;

public class MoreThanMaxCategory_AddServiceTest extends Base_Utilities54Test{
	@Test
	public void moreThanMaxCategory() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Normal Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter service name\"]")).sendKeys("AC");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Select Category\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\" + Add new category\"]")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter category name\"]")).sendKeys("portable ACsdfghjkjhgggggggggggggggggggggggggggggggggggggg");
		WebElement toast = wd.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Toast[@text=\"Category name should be 50 Characters\"]")));
		Assert.assertNotNull(toast, "Toast not Found");
	}

}
