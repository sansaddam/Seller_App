package dashBoard;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.Base_Utilities54ProSerTest;
import io.appium.java_client.AppiumBy;

public class InvalidCustomeDate_DbTest extends Base_Utilities54ProSerTest{
	@Test
	public void invalidDateStatistics() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"This Week\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"Custom Date\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Start date\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"End date\"]")).click();
		WebElement back = driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Previous month\"]"));
		String targetDate = "24 September 2025";
		    boolean dateFound = false;
		    for (int i = 1; i <= 12; i++) {
		        List<WebElement> dateList = driver.findElements(AppiumBy.xpath("//android.view.View[@content-desc='" + targetDate + "']"));
		        if(!dateList.isEmpty()) {
		            dateList.get(0).click();
		            dateFound = true;
		            System.out.println("Date found and clicked: " + targetDate);
		            break;
		        } else {
		            System.out.println("Date not found in current month — clicking back...");
		            back.click();
		            Thread.sleep(1000);
		        }
		    }
		if (!dateFound) {
            Assert.fail("Could not find the date after navigating 10 months backward.");
        }
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Confirm\"]")).click();
		WebElement toast = wd.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Toast[contains(@text,'Start date must be')]")));
		Assert.assertNotNull(toast, "Toast Not Found");
	}
}
