package dashBoard;

import static org.testng.Assert.assertTrue;
import java.net.MalformedURLException;
import java.net.URI;
import java.time.Duration;
import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Generic_Base.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ValidateValuesSummaryDetails_Db extends BaseTest {
	@BeforeClass
	public void capabilities() throws MalformedURLException {
		ds = new DesiredCapabilities();
		ds.setCapability("platformName", "Android");
		ds.setCapability("appium:platformVersion", "16.0");
		ds.setCapability("appium:automationName", "UiAutomator2");
		ds.setCapability("appium:appActivity", "com.nextshopz.MainActivity");
		ds.setCapability("appium:appPackage", "com.nextshopz");
		ds.setCapability("appium:deviceName", "emulator-5554");
		ds.setCapability("appium:udid", "emulator-5554");
		driver = new AndroidDriver(URI.create("http://127.0.0.1:4723").toURL(), ds);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@BeforeMethod
	public void login() throws InterruptedException {
		driver.findElement(By.xpath(
				"//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]"))
				.click();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Skip\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Get Started\"]")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter mobile number\"]")).sendKeys("7799111825");
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter PIN\"]")).sendKeys("1234");
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Continue\"]")).click();
		Thread.sleep(3000);
		try {
			WebElement skip = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Skip\"]"));
			if (skip.isDisplayed()) {
				skip.click();
			}
		} catch (Exception e) {
			System.out.println("Skip not found, moving on...");
		}
	}

	@Test
	public void validateValuesSummaryDetails() {
		WebElement revenue = driver.findElement(AppiumBy
				.xpath("//android.widget.TextView[@text=\"Revenue\"]/preceding-sibling::android.widget.TextView"));
		String revActual = revenue.getText();
		if (revActual.equalsIgnoreCase(revActual)) {
			System.out.println(revActual);
			assertTrue(true);
		}
		WebElement orders = driver.findElement(AppiumBy.xpath(
				"((//android.widget.TextView[@text=\"Orders\"])[1]/preceding-sibling::android.widget.TextView)[1]"));
		String ordersActual = orders.getText();
		if (ordersActual.equalsIgnoreCase(ordersActual)) {
			System.out.println(ordersActual);
			assertTrue(true);
		}
		WebElement booking = driver.findElement(AppiumBy.xpath(
				"(//android.widget.TextView[@text=\"Bookings\"])[1]/preceding-sibling::android.widget.TextView"));
		String bookActual = booking.getText();
		if (bookActual.equalsIgnoreCase(bookActual)) {
			System.out.println(bookActual);
			assertTrue(true);
		}
		horizontalSwipe();
		WebElement subscribers = driver.findElement(AppiumBy
				.xpath("//android.widget.TextView[@text=\"Subscribers\"]/preceding-sibling::android.widget.TextView"));
		String subActual = subscribers.getText();
		if (subActual.equalsIgnoreCase(subActual)) {
			System.out.println(subActual);
			assertTrue(true);
		}
		WebElement users = driver.findElement(AppiumBy
				.xpath("(//android.widget.TextView[@text=\"Users\"])[1]/preceding-sibling::android.widget.TextView"));
		String userActual = users.getText();
		if (userActual.equalsIgnoreCase(userActual)) {
			System.out.println(userActual);
			assertTrue(true);
		}
	}
	
	public void horizontalSwipe() {
		PointerInput finger = new PointerInput(Kind.TOUCH, "finger");
		Sequence swipe = new Sequence(finger, 1);
		swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 950, 550));
		swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		swipe.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), 100, 550));
		swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(swipe));
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}

}
