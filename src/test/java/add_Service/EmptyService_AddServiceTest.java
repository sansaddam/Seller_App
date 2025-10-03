package add_Service;

import org.testng.annotations.Test;

import Generic_Base.Base_Utilities54Test;
import io.appium.java_client.AppiumBy;

public class EmptyService_AddServiceTest extends Base_Utilities54Test{
	@Test
	public void empty() {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Service\"]")).click();
		try {
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Services not found\"]")).isDisplayed();
		} catch (Exception e) {
			System.out.println("Service is Present");
		}
	}

}
