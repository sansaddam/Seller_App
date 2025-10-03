package add_Product;

import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class EditValidData_ProductTest extends Base_UtilitiesTest{
	@Test
	public void editValidData() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Laptop, ₹ 500, In stock, Active\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Edit Product\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.view.ViewGroup)[25]//android.widget.EditText")).sendKeys("35");
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"+".scrollIntoView(new UiSelector().text(\"Product Description\"))"));
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Product Description\"]/parent::android.view.ViewGroup//android.view.ViewGroup//android.widget.EditText)[1]")).sendKeys("Working Fine");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Update\"]")).click();
		Thread.sleep(2000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Laptop, ₹ 500, In stock, Active\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Working Fine\"]")).isDisplayed();
	}

}
