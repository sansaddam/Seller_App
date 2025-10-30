package dashBoard;

import org.testng.annotations.Test;

import Generic_Base.Base_Utilities54Test;
import io.appium.java_client.AppiumBy;

public class ValidateBookingButton_DB extends Base_Utilities54Test{
	@Test
	public void validateBookingButton() {
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Bookings\"])[2]")).isDisplayed();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Bookings\"])[2]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Service Bookings\"]")).isDisplayed();
	}
}
