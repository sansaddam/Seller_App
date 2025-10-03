package add_Product;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class AddVariantData_ProductTest extends Base_UtilitiesTest{
	@Test
	public void selectVarianteValue() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Product\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"󰅂\"])[1]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter product Name\"]")).sendKeys("LapTop");
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
		+".scrollIntoView(new UiSelector().text(\"Variant Products\"))"
				)
				);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Variant Products\"]/following-sibling::android.widget.Switch")).click();
		swipeUp(500);
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"\"])[3]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"\"])[1]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\" Done\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"\"])[4]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\" Done\"]")).click();
		Thread.sleep(2000);
		swipeUp(500);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Price\"]")).sendKeys("250");
		PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger2");
		Sequence horizontalSwipe = new Sequence(finger2, 1);
		horizontalSwipe.addAction(finger2.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 896, 1940));
		horizontalSwipe.addAction(finger2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		horizontalSwipe.addAction(finger2.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), 122,1940));
		horizontalSwipe.addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(horizontalSwipe));
		
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Discount\"]")).sendKeys("25");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Stock\"]")).sendKeys("20");	
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"20\"]")).isDisplayed();
	}
	
	public void swipeUp(int durationMillis) {
	    Dimension size = driver.manage().window().getSize();
	    int width = size.getWidth();
	    int height = size.getHeight();

	    // Start at 80% of screen height, end at 20%
	    int startX = width / 2;
	    int startY = (int) (height * 0.8);
	    int endY   = (int) (height * 0.2);
	    
	    PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger-" + System.currentTimeMillis());
	    Sequence swipe = new Sequence(finger, 1);

	    swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
	    swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
	    swipe.addAction(finger.createPointerMove(Duration.ofMillis(durationMillis), PointerInput.Origin.viewport(), startX, endY));
	    swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

	    driver.perform(Arrays.asList(swipe));
	}
	
	

}
