package add_Product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class CreateCategoryImage_ProductTest extends Base_UtilitiesTest{
	@Test
	public void image() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text,'Categories')]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add New Category\"]")).click();
		try {
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
			driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
			driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")).click();
			driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
			driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_all_button\"]")).click();
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Choose from gallery\"]")).click();
			Thread.sleep(2000);
			driver.findElement(AppiumBy.xpath("(//android.view.View[@content-desc=\"Photo taken on Sep 25, 2025 11:59 AM\"])[1]")).click();
			driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Crop\"]")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter category name\"]")).sendKeys("PlaneCake");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Create\"]")).click();
		WebElement toast = wd.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Toast[contains(@text,'Category added')]")));
		Assert.assertNotNull(toast, "Toast not found");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text,'Categories')]")).click();
		try {
			driver.findElement(AppiumBy.androidUIAutomator(
				    "new UiScrollable(new UiSelector().scrollable(true))" +
				    ".scrollIntoView(new UiSelector().text(\"PlaneCake\"))"
				));
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"PlaneCake\"]/parent::android.view.ViewGroup//android.view.ViewGroup//android.widget.TextView")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Delete\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\" Yes,Delete category\"]")).click();
	}

}
