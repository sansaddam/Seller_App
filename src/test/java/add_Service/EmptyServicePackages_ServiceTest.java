package add_Service;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Arrays;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import Generic_Base.Base_Utilities54Test;
import io.appium.java_client.AppiumBy;

public class EmptyServicePackages_ServiceTest  extends Base_Utilities54Test{
	@Test
	public void emptyServicePackages() throws InterruptedException {
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
	    WebElement packages = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Noraml\"]"));
	    if (packages.isDisplayed()) {
			System.out.println("Packages are present in Screen");
		}
	    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Noraml\"]")).isDisplayed();
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
