package dashBoard;

import org.testng.annotations.Test;

import Generic_Base.Base_Utilities54ProSerTest;
import io.appium.java_client.AppiumBy;

public class CustomDateStatistics_DbTest extends Base_Utilities54ProSerTest{
	@Test
	public void customDateStatistics() {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"This Week\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"Custom Date\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Start date\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Previous month\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"01 September 2025\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"End date\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Confirm\"]")).click();
		try {
			driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.GroupView/com.horcrux.svg.GroupView[5]"))
			.isDisplayed();
		} catch (Exception e) {
			System.out.println("No Orders in Custom Date");
		}
	}
}
