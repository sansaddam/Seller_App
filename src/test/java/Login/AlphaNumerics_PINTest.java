package Login;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import Generic_Base.BaseCapabilities56Test;
import io.appium.java_client.AppiumBy;

public class AlphaNumerics_PINTest extends BaseCapabilities56Test {
	@Test
	public void alphabets() {
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Skip\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Get Started\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter mobile number\"]")).sendKeys("8074117625");
		WebElement pin=driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter PIN\"]"));
		pin.sendKeys("Da11");
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Continue\"]")).click();
		WebElement toast = wd.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Toast[1]")));
		String msg = toast.getText();
		assertEquals(msg,"Please enter 4 digit PIN");
	}

}
