package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic_Base.BaseCapabilities56Test;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;

public class Valid_CredentialsTest extends BaseCapabilities56Test{
		@Test
		public void valid() throws MalformedURLException, InterruptedException {
			driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"Skip\"]")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"Get Started\"]")).click();
			driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter mobile number\"]")).sendKeys("8074117625");
			driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter PIN\"]")).sendKeys("1111");
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"Continue\"]")).click();
			Thread.sleep(3000);
			WebElement skip = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Skip\"]"));
			if(skip.isDisplayed()) {
				skip.click();
			}
			String store = driver.findElement(By.xpath("//android.widget.TextView[@text=\"https://prasadstore-commerce.nextshopz.biz/\"]")).getText();
			assertEquals(store, "https://prasadstore-commerce.nextshopz.biz/");
			System.out.println("Store_Url :" + store);
		}
}
