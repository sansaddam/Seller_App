package add_Service;

import org.testng.annotations.Test;

import Generic_Base.Base_Utilities54Test;
import io.appium.java_client.AppiumBy;

public class DeleteConfirmation_ServiceTest extends Base_Utilities54Test{
	@Test
	public void deleteConfirmation() throws InterruptedException {
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Service\"]")).click();
	driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"AC, Sep 26,2025 12:59 Pm, WINDOW ACS,  ₹1500.00\"]")).click();
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Are You Sure You Want To Delete This Service?\"]")).isDisplayed();
	}
}
