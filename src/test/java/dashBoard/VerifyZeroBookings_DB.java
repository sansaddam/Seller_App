package dashBoard;

import org.testng.annotations.Test;

import Generic_Base.Base_Utilities54Test;
import io.appium.java_client.AppiumBy;

public class VerifyZeroBookings_DB extends Base_Utilities54Test{
	@Test
	public void verifyZeroBookings() {
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Bookings\"])[2]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"You Don't Have Any  Bookings\"]")).isDisplayed();
	}
}
