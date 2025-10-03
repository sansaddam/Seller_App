package Create_Store;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Base.BaseCapabilitiesTest;
import io.appium.java_client.AppiumBy;



public class Service_CreateStoreTest extends BaseCapabilitiesTest{
	@Test
	public void service() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Skip']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Get Started']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter mobile number']")).sendKeys("7799111529");
		Thread.sleep(2000);
		List<WebElement> box = driver.findElements(By.xpath("(//android.widget.EditText[@resource-id='textInput'])"));
		int  num[]= {1,2,3,4,5,6};
		int i = 0;
		for (WebElement input : box) {
		    if (i < num.length) {
		        input.sendKeys(String.valueOf(num[i]));
		        i++;
		    }
		}
		wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Set Your PIN']")));
		 List<WebElement> pin= driver.findElements(By.xpath("(//android.widget.EditText[@resource-id='textInput'])"));
		 for (WebElement we : pin) {
			we.sendKeys("1");
		}
		 driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Submit']/android.view.ViewGroup")).click();
		 driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Owner Name']")).sendKeys("Kiran");
		 driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Store Name']")).sendKeys("SHSF");
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Select business category Type']")).click();
		 driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Service']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//android.widget.TextView[@text=\"\"])[2]")).click();
		 driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Men's Saloon\"]")).click();
		 String url = driver.findElement(By.xpath("//android.widget.EditText[@text=\"shsf-menssaloon.nextshopz.biz\"]")).getText();
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Verify']")).click();
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Confirm Selection']")).click();
		 driver.findElement(By.xpath("//android.widget.TextView[@text='󰄱']")).click();
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();
		 WebElement dashboard = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=' Go to Dashboard']"));
		 wait.until(ExpectedConditions.visibilityOf(dashboard));
		 dashboard.click();
		 try {
		        WebElement skip = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Skip\"]"));
		        if (skip.isDisplayed()) {
		            skip.click();
		        }
		    } catch (Exception e) {
		        System.out.println("Skip not found, moving on...");
		    }
		 assertEquals(url, "shsf-menssaloon.nextshopz.biz");
		 System.out.println("Service " + url);
	}

	@Test(dependsOnMethods = {"service"})
	public void delete() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(5000);
		 try {
		        WebElement skip = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Skip\"]"));
		        if (skip.isDisplayed()) {
		            skip.click();
		        }
		    } catch (Exception e) {
		        System.out.println("Skip not found, moving on...");
		    }
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Settings']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=' Store profile']")).click();
		 WebElement deleteStore = driver.findElement(
				    AppiumBy.androidUIAutomator(
				        "new UiScrollable(new UiSelector().scrollable(true))" +
				        ".scrollIntoView(new UiSelector().text(\"Delete Store\"))"
				    )
				);
		 Thread.sleep(2000);
		 deleteStore.click();
		 driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='']")).click();
		 driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Continue to deletion']")).click();
		 driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Select Reason, Choose reason for deletion, \"]")).click();
		 driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"I want to test Nextshopz\"]")).click();
		 driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"Verify\"]")).click();
		 driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter otp\"]")).sendKeys("123456");
		 Thread.sleep(2000);
		 driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Delete Store\"])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\" Yes,Delete Store\"]")).click();
	}
	
}
