package Create_Store;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Generic_Base.BaseCapabilitiesTest;

public class Valid_NumberTest extends BaseCapabilitiesTest{
			@Test
			public void valid() {
				
				driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@text=\"Skip\"]")).click();
				driver.findElement(By.xpath("//android.widget.TextView[@text=\"Get Started\"]")).click();
				driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter mobile number\"]")).sendKeys("9701407421");
				driver.findElement(By.xpath("//android.widget.TextView[@text=\"OTP Verification\"]")).isDisplayed();
			}
}
