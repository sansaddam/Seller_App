package Login;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.BaseCapabilities56Test;
import io.appium.java_client.AppiumBy;

public class SpecialCharacters_PINTest extends BaseCapabilities56Test {
	@Test
	public void alphabets() {
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Skip\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Get Started\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter mobile number\"]")).sendKeys("8074117625");
		WebElement pin=driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter PIN\"]"));
		pin.sendKeys("@#$%");
		String pin1 = pin.getText();
		int length=pin1.length();
		if (pin1.equalsIgnoreCase("Enter PIN") || length == 0) {
		    Assert.assertTrue(true);
		} else {
			 Assert.fail("❌ Field accepted alphabets! Value found: " + pin1);
		}
	}
										
}
