package add_Service;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic_Base.Base_Utilities54Test;
import io.appium.java_client.AppiumBy;

public class VerifyServiceDropDown_AddServiceTest extends Base_Utilities54Test{
	@Test
	public void verify() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]")).click();
		List<WebElement> values = driver.findElements(AppiumBy.xpath("//android.widget.ListView//android.widget.CheckedTextView "));
		for (WebElement we : values) {
			String actual = we.getText();
			if(actual.equalsIgnoreCase("Home Service")) {
				assertTrue(true);
			}
			else if(actual.equalsIgnoreCase("Normal Service")) {
				assertTrue(true);
			}
			else if(actual.equalsIgnoreCase("Appointment")) {
				assertTrue(true);
			}
		}
	}

}
