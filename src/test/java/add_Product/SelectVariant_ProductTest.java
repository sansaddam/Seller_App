package add_Product;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class SelectVariant_ProductTest extends Base_UtilitiesTest{
	@Test
	public void selectVariante() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Product\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"󰅂\"])[1]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter product Name\"]")).sendKeys("LapTop");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"\"])[2]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\" Done\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter price\"]")).sendKeys("700");
		WebElement stock = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter stock quantity\"]"));
		stock.sendKeys("50");
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
		+".scrollIntoView(new UiSelector().text(\"Variant Products\"))"
				)
				);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Variant Products\"]/following-sibling::android.widget.Switch")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+".scrollIntoView(new UiSelector().text(\"Images\"))"
						)
						);
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"\"])[3]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"\"])[2]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\" Done\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Select Values\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\" Done\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Ultrabooks\"])[1]")).isDisplayed();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Slim, lightweight, long battery life (portable work).\"]")).isDisplayed();
	}

}
