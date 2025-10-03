package Create_Store;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.BaseCapabilitiesTest;
import io.appium.java_client.AppiumBy;

public class Empty_NumberTest extends BaseCapabilitiesTest {
		@Test
		public void empty() {
			
			driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"Skip\"]")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"Get Started\"]")).click();
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
