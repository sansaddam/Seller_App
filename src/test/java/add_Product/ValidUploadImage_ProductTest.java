package add_Product;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class ValidUploadImage_ProductTest extends Base_UtilitiesTest{
	@Test
	public void valid() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Product\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"󰅂\"])[1]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter product Name\"]")).sendKeys("LapTop");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"\"])[2]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\" Done\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter price\"]")).sendKeys("700");
		WebElement stock = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter stock quantity\"]"));
		stock.sendKeys("50");
		WebElement scroll = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
		+".scrollIntoView(new UiSelector().text(\"Images\"))"
				)
				);
		scroll.click();
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
	    Sequence swipe = new Sequence(finger, 1);
	    // Start point 
	    swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 459, 1860));
	    swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
	    // Move to 
	    swipe.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), 522, 804));
	    swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
	    driver.perform(Arrays.asList(swipe));
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"\"]")).click();
		try {
			driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
			driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")).click();
			driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
			driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_all_button\"]")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Choose from gallery\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.view.View[@content-desc=\"Photo taken on Sep 25, 2025 11:59 AM\"])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Done\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Crop\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.ImageView")).isDisplayed();
	}

}
