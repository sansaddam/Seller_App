package Generic_Base;

import java.net.MalformedURLException;
import java.net.URI;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class BaseCapabilities56Test {
	public static DesiredCapabilities ds;
	public static AppiumDriver driver;
	public static WebDriverWait wd;
		@BeforeClass
		public void capabilities() throws MalformedURLException {
			ds=new DesiredCapabilities();
			ds.setCapability("platformName", "Android");
			ds.setCapability("appium:platformVersion", "13.0");
			ds.setCapability("appium:automationName", "UiAutomator2");
			ds.setCapability("appium:appActivity", "com.nextshopz.MainActivity");
			ds.setCapability("appium:appPackage", "com.nextshopz");
			ds.setCapability("appium:deviceName", "emulator-5556");
			ds.setCapability("appium:udid", "emulator-5556");
			driver=new AndroidDriver(URI.create("http://127.0.0.1:4723").toURL(),ds);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			wd= new WebDriverWait(driver, Duration.ofSeconds(15));
		}
		@AfterClass
		public void close() {
			driver.quit();
		}
}
