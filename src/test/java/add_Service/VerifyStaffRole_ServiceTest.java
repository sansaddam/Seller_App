package add_Service;

import java.time.Duration;
import java.util.Arrays;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import Generic_Base.Base_Utilities54Test;
import io.appium.java_client.AppiumBy;

public class VerifyStaffRole_ServiceTest extends Base_Utilities54Test{
	@Test
	public void verifyStaffRole() throws InterruptedException {
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
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Normal\"]/parent::android.view.ViewGroup//(//android.view.ViewGroup[@content-desc=\"\"])[2]")).click();
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Staff Availability\"]")).click();
	Thread.sleep(1000);
	swipeUp1();
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"ROSE\"]")).isDisplayed();
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Update\"]")).click();
    WebElement toast = wd.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Toast[contains(@text,'Service package')]")));
    Assert.assertNotNull(toast, "Toast not Found");
    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Normal\"]/parent::android.view.ViewGroup//(//android.view.ViewGroup[@content-desc=\"\"])[2]")).click();
    swipeUp1();
    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"ROSE\"]")).isDisplayed();    
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
public void swipeUp1() {
	PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger");
    Sequence swipe1 = new Sequence(finger1, 1);
    swipe1.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 900, 2000));
    swipe1.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
    swipe1.addAction(finger1.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), 900, 1300));
    swipe1.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
    driver.perform(Arrays.asList(swipe1));
	}

}
