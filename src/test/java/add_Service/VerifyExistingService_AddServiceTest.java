package add_Service;

import org.testng.annotations.Test;

import Generic_Base.Base_Utilities54Test;
import io.appium.java_client.AppiumBy;

public class VerifyExistingService_AddServiceTest extends Base_Utilities54Test{
	@Test
	public void verify() {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Service\"]")).click();
		try {
			driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"AC, Sep 26,2025 12:59 Pm, WINDOW ACS,  ₹1500.00\"]")).isDisplayed();
		} catch (Exception e) {
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Services not found\"]")).isDisplayed();
		}
	}

}
