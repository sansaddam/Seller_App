package add_Service;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Generic_Base.Base_Utilities54Test;
import io.appium.java_client.AppiumBy;

public class ChangeTumbnailImage_AddServiceTest extends Base_Utilities54Test{
	@Test
	public void change() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"\"]")).click();
		try {
			driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
			driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")).click();
			driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
			driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_all_button\"]")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Choose from gallery\"]")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("(//android.view.View[@content-desc=\"Photo taken on Sep 9, 2025 3:30 PM\"])[1]")).click();
		driver.findElement(AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[6]/android.view.View[3]/android.widget.Button")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Crop\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.ImageView")).isDisplayed();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"\"]")).click();
		try {
			driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
			driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")).click();
			driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
			driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_all_button\"]")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Choose from gallery\"]")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("(//android.view.View[@content-desc=\"Photo taken on Sep 9, 2025 3:30 PM\"])[2]")).click();
		driver.findElement(AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[6]/android.view.View[3]/android.widget.Button")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Crop\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Change Thumbnail\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Change Thumbnail\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).isDisplayed();
		
	}

}
