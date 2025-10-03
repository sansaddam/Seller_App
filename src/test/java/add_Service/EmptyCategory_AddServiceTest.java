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

public class EmptyCategory_AddServiceTest extends Base_Utilities54Test{
	@Test
	public void emptyCategory() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Normal Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter service name\"]")).sendKeys("LapTop");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Select Gst\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"9%\"]")).click();
		driver.findElement(AppiumBy.androidUIAutomator(
			    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").instance(0))" +
			    ".scrollIntoView(new UiSelector().textContains(\"Service Pricing\"))"
			));
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Show Availability Service Packages\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Select Package\"]")).click();
		
		PointerInput finger= new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence swipe=new Sequence(finger, 1);
		swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 471, 1746));
		swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		swipe.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), 568,602));
		swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(swipe));
	
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Pricing Details\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Duration of Service(in hours)\"]")).sendKeys("2");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Unit Price(e.g 500 rs)\"]")).sendKeys("1500");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Discount\"]")).sendKeys("150");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"e.g 1 per booking(up to 5 only)\"]")).sendKeys("2");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Submit\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Add Service\"])[2]")).click();
		WebElement toast = wd.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Toast[@text=\"Please select service category\"]")));
		Assert.assertNotNull(toast, "Toast not Found");
	}

}
