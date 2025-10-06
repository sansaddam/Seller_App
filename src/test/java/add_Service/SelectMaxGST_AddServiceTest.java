package add_Service;

import org.testng.annotations.Test;

import Generic_Base.Base_Utilities54Test;
import io.appium.java_client.AppiumBy;

public class SelectMaxGST_AddServiceTest extends Base_Utilities54Test{
	@Test
	public void selectMax() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Normal Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter service name\"]")).sendKeys("LapTop");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Select Category\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"window ACs\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Select Gst\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"28%\"]")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"28%\"]")).isDisplayed();
		
	}

}
