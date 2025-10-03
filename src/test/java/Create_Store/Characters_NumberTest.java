package Create_Store;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Generic_Base.BaseCapabilitiesTest;

public class Characters_NumberTest extends BaseCapabilitiesTest{
		@Test
		public void characters() {
			
			driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"Skip\"]")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"Get Started\"]")).click();
			driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter mobile number\"]")).sendKeys("Saddamsani");
			WebElement toast = wd.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Toast[1]")));
			String msg = toast.getText();
			assertEquals(msg,"Mobile number is not valid");
		}
}
