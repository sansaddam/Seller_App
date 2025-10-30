package dashBoard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.Base_Utilities54ProSerTest;
import io.appium.java_client.AppiumBy;

public class SameCustomDate_DbTest extends Base_Utilities54ProSerTest{
	@Test
	public void sameCustomDateStatistics() {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"This Week\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"Custom Date\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Start date\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"End date\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Confirm\"]")).click();
		WebElement toast = wd.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Toast[contains(@text,'Start date must be')]")));
		Assert.assertNotNull(toast, "Toast Not Found");
	}
}
