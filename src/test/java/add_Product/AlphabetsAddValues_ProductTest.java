package add_Product;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class AlphabetsAddValues_ProductTest extends Base_UtilitiesTest{
	@Test
	public void alphabetsAddValue() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Product\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"󰅂\"])[1]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter product Name\"]")).sendKeys("LapTop");
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
		+".scrollIntoView(new UiSelector().text(\"Variant Products\"))"
				)
				);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Variant Products\"]/following-sibling::android.widget.Switch")).click();
		PointerInput finger= new PointerInput(PointerInput.Kind.TOUCH, "finger");
		Sequence swipe=new Sequence(finger, 1);
		swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 518, 1721));
		swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		swipe.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), 512,602));
		swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(swipe));
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"\"])[3]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"\"])[1]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\" Done\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ Add Value\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter attribute value\"]")).sendKeys("gbs");
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Save\"]")).click();
		try {
			driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Save\"]")).click();
			WebElement toast = wd.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Toast[contains(@text,'Attribute value exists')]")));
			Assert.assertNotNull(toast, "Toast not Found");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
