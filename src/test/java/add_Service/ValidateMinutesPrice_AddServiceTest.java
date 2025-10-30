package add_Service;

import java.time.Duration;
import java.util.Arrays;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;
import Generic_Base.Base_Utilities54Test;
import io.appium.java_client.AppiumBy;

public class ValidateMinutesPrice_AddServiceTest extends Base_Utilities54Test{
	@Test
	public void validateHourlyPrice() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Normal Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter service name\"]")).sendKeys("Laptop");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Select Category\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"window ACs\"]")).click();
		swipUp();
	    driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter description\"]")).sendKeys("4gb ram,256gb rom");
	    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Show Availability Service Packages\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Select Package\"]")).click();
		Thread.sleep(2000);
		swipUp();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Hourly Basis\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Minutes Basis\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Pricing Details\"]")).click();
	    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Note : Max limit upto 180 minutes only \"]")).isDisplayed();
	}
	public void swipUp() {
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
	    Sequence swipe = new Sequence(finger, 1);
	    swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 450, 1980));
	    swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
	    swipe.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), 450, 1300));
	    swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
	    driver.perform(Arrays.asList(swipe));
	}
}
