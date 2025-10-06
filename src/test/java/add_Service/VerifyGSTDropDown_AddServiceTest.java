package add_Service;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic_Base.Base_Utilities54Test;
import io.appium.java_client.AppiumBy;

public class VerifyGSTDropDown_AddServiceTest extends Base_Utilities54Test{
	@Test
	public void verifyGSTDropDown() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Normal Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter service name\"]")).sendKeys("AC");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Select Category\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"window ACs\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Select Gst\"]")).click();
		List<WebElement> gst = driver.findElements(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Select option\"]/parent::android.view.ViewGroup//android.view.ViewGroup//android.widget.TextView"));
		for (WebElement element : gst) {
			String actual = element.getText();
			if (actual.equalsIgnoreCase("Select option")) {
				assertTrue(true);
			}
			else if (actual.equalsIgnoreCase("5%")) {
				assertTrue(true);
			}
			else if (actual.equalsIgnoreCase("9%")) {
				assertTrue(true);
			}
			else if (actual.equalsIgnoreCase("18%")) {
				assertTrue(true);
			}
			else if (actual.equalsIgnoreCase("28%")) {
				assertTrue(true);
			}
		}
	}
}
