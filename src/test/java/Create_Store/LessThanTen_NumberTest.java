package Create_Store;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.BaseCapabilitiesTest;

public class LessThanTen_NumberTest extends BaseCapabilitiesTest{
		@Test
		public void lessThanTen() throws MalformedURLException {
			
			driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"Skip\"]")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"Get Started\"]")).click();
			WebElement mobile = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter mobile number\"]"));
			mobile.sendKeys("741176258");
			String actual = mobile.getText();
			Assert.assertEquals(actual, "741176258");
			
		}
}
