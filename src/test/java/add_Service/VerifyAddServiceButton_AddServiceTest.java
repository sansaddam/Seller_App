package add_Service;

import org.testng.annotations.Test;

import Generic_Base.Base_Utilities54Test;
import io.appium.java_client.AppiumBy;

public class VerifyAddServiceButton_AddServiceTest extends Base_Utilities54Test{
	@Test
	public void verify() {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Service\"]")).isDisplayed();
	}
}
