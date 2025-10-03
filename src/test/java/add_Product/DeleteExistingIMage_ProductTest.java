package add_Product;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class DeleteExistingIMage_ProductTest extends Base_UtilitiesTest{
	@Test
	public void delete() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		try {
			driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Laptop, ₹ 500, In stock, Active\"]/android.view.ViewGroup[1]/android.widget.ImageView")).click();
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Edit Product\"]")).click();
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" + ".scrollIntoView(new UiSelector().text(\"Update\"))"));
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\" Yes,Delete Image\"]")).click();
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
			driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
			driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_foreground_only_button\"]")).click();
			driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
			driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_all_button\"]")).click();
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Choose from gallery\"]")).click();
			driver.findElement(AppiumBy.xpath("(//android.view.View[@content-desc=\"Photo taken on Sep 25, 2025 11:59 AM\"])[1]")).click();
			Thread.sleep(1500);
			driver.findElement(AppiumBy.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[6]/android.view.View[3]/android.widget.Button")).click();
			driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Crop\"]")).click();
			driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Update\"]")).click();
		} catch (Exception e) {
			System.out.println("Image not found");
		}

	}

}
