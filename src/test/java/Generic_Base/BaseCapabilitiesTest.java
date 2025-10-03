package Generic_Base;

import java.net.MalformedURLException;
import java.net.URI;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;

public class BaseCapabilitiesTest extends BaseTest{
		@BeforeClass
		public void capabilities() throws MalformedURLException {
			ds=new DesiredCapabilities();
			ds.setCapability("platformName", "Android");
			ds.setCapability("appium:platformVersion", "16");
			ds.setCapability("appium:automationName", "UiAutomator2");
			ds.setCapability("appium:appActivity", "com.nextshopz.MainActivity");
			ds.setCapability("appium:appPackage", "com.nextshopz");
			ds.setCapability("appium:deviceName", "emulator-5554");
			ds.setCapability("appium:udid", "emulator-5554");
			driver=new AndroidDriver(URI.create("http://127.0.0.1:4723").toURL(),ds);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd=new WebDriverWait(driver, Duration.ofSeconds(15));
		}
		@AfterClass
		public void close() {
			driver.quit();
		}
}
