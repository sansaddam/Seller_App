package Generic_Base;

import java.net.MalformedURLException;
import java.net.URI;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;

public class Base_Utilities54Test extends BaseTest{
	@BeforeClass
	public void capabilities() throws MalformedURLException {
		ds=new DesiredCapabilities();
		ds.setCapability("platformName", "Android");
		ds.setCapability("appium:platformVersion", "16.0");
		ds.setCapability("appium:automationName", "UiAutomator2");
		ds.setCapability("appium:appActivity", "com.nextshopz.MainActivity");
		ds.setCapability("appium:appPackage", "com.nextshopz");
		ds.setCapability("appium:deviceName", "emulator-5554");
		ds.setCapability("appium:udid", "emulator-5554");
		driver=new AndroidDriver(URI.create("http://127.0.0.1:4723").toURL(),ds);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wd= new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	@BeforeMethod
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Skip\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Get Started\"]")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter mobile number\"]")).sendKeys("9155555555");
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter PIN\"]")).sendKeys("1111");
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
	@AfterClass
	public void close() {
		driver.quit();
	}

}
