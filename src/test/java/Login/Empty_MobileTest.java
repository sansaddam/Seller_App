package Login;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.BaseCapabilities56Test;
import io.appium.java_client.AppiumBy;

public class Empty_MobileTest extends BaseCapabilities56Test {
	@Test
	public void alphabets() {
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Skip\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Get Started\"]")).click();
		WebElement mobile = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter mobile number\"]"));
		mobile.sendKeys("");
		String num = mobile.getText();
		int length=num.length();
		if (num.equalsIgnoreCase("Enter Mobile Number") || length == 0) {
		    Assert.assertTrue(true);
		} else {
			 Assert.fail("❌ Field accepted alphabets! Value found: " + num);
		}
	}

}
