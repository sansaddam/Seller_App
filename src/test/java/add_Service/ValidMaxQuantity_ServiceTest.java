package add_Service;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;

import Generic_Base.Base_Utilities54Test;
import io.appium.java_client.AppiumBy;

public class ValidMaxQuantity_ServiceTest extends Base_Utilities54Test{
	@Test
	public void validMaxQuantity() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Normal Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter service name\"]")).sendKeys("Laptop");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Select Category\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"window ACs\"]")).click();
		swipeUp();
	    driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter description\"]")).sendKeys("4gb ram,256gb rom");
	    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Show Availability Service Packages\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Select Package\"]")).click();
		Thread.sleep(2000);
		swipeUp();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Hourly Basis\"]")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Minutes Basis\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Pricing Details\"]")).click();
	    driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Duration of Service(in hours)\"]")).sendKeys("45");
	    driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Unit Price(e.g 500 rs)\"]")).sendKeys("256");
	    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"%\"]")).click();
	    driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Discount\"]")).sendKeys("10");
	    driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"e.g 1 per booking(up to 5 only)\"]")).sendKeys("2");
	    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Submit\"]")).click();
	    driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
	    Thread.sleep(2000);
	    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Pricing Details\"]")).click();
	    driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"2\"]")).isDisplayed();
	}
	public void swipeUp() {
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
	    Sequence swipe = new Sequence(finger, 1);
	    swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 450, 1980));
	    swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
	    swipe.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), 450, 1300));
	    swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
	    driver.perform(Arrays.asList(swipe));
	}

}
