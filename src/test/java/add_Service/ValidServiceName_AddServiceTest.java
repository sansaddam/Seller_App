package add_Service;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.Base_Utilities54Test;
import io.appium.java_client.AppiumBy;

public class ValidServiceName_AddServiceTest extends Base_Utilities54Test {
	@Test
	public void validServiceName() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Normal Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter service name\"]")).sendKeys("AC");
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Add Service\"])[2]")).click();
		WebElement toast = wd.until(
			    ExpectedConditions.presenceOfElementLocated(
			        AppiumBy.xpath("//android.widget.Toast[contains(@text,'Please select service category')]")
			    )
			);
			Assert.assertNotNull(toast, "Toast not found");
	}
}
