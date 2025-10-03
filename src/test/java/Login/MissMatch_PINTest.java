package Login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.BaseCapabilities56Test;

public class MissMatch_PINTest extends BaseCapabilities56Test {
	@Test
	public void missMatch() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Skip\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Get Started\"]")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter mobile number\"]")).sendKeys("8074117625");
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Forgot PIN?\"]")).click();
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
		Thread.sleep(2000);
		 List<WebElement> pin= driver.findElements(By.xpath("(//android.widget.EditText[@resource-id='textInput'])"));
		 int count=0;
		 for (WebElement we : pin) {
			 count++;
			 if(count<=4) {
				 we.sendKeys("1"); 
			 }
			 else {
				we.sendKeys("2");
			}
			
		}
		driver.findElement(By.xpath("//android.widget.TextView[@text=\"Submit\"]")).click();
		WebElement toast = wd.until(
			    ExpectedConditions.presenceOfElementLocated(
			        By.xpath("//android.widget.Toast[contains(@text,'Pin and confirm PIN should match')]")
			    )
			);
			Assert.assertNotNull(toast, "Toast not found");
	}
}
