package Login;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic_Base.BaseCapabilities56Test;
import io.appium.java_client.AppiumBy;

public class Empty_PINTest extends BaseCapabilities56Test {
	@Test
	public void empty() {
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Skip\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Get Started\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter mobile number\"]")).sendKeys("8074117625");
		WebElement pin=driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter PIN\"]"));
		pin.click();
	}
}
