package Create_Store;

import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Generic_Base.BaseCapabilitiesTest;
import io.appium.java_client.AppiumBy;

public class MoreThanTen_NumberTest extends BaseCapabilitiesTest {
		@Test
		public void moreThanTen() {
			
			driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"Skip\"]")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"Get Started\"]")).click();
			driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter mobile number\"]")).sendKeys("8074117625812");
			String trimNumber = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"8074117625\"]")).getText();
			assertNotEquals(trimNumber, "8074117625812");
		}
}
