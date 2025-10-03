package add_Service;

import org.testng.annotations.Test;
import Generic_Base.Base_Utilities54Test;
import io.appium.java_client.AppiumBy;

public class VerifyNormal_AddServiceTest extends Base_Utilities54Test{
	@Test
	public void verifyNormal() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Normal Service\"]")).click();
		driver.findElement(AppiumBy.androidUIAutomator(
			    "new UiScrollable(new UiSelector().className(\"android.widget.ScrollView\").instance(0))" +
			    ".scrollIntoView(new UiSelector().textContains(\"Service Pricing\"))"
			));
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Show Availability Service Packages\"]")).isDisplayed();
	}
	
}
