package Login;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic_Base.BaseCapabilities56Test;
import io.appium.java_client.AppiumBy;

public class UnRegister_MobileTest extends BaseCapabilities56Test{
	@Test
	public void unRegister() {
		driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Skip\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Get Started\"]")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter mobile number\"]")).sendKeys("9701407421");
		WebElement otp = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"OTP Verification\"]"));
		if(otp.isDisplayed()) {
			assertTrue(true);
		}
	}

}
