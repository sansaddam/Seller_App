package Create_Store;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generic_Base.BaseCapabilitiesTest;
import Generic_Base.BaseListenerTest;


@Listeners(BaseListenerTest.class)
public class Invalid_SubDomainTest extends BaseCapabilitiesTest{
	@Test
	public void invalid() throws InterruptedException, MalformedURLException {
		driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Skip']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Get Started']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter mobile number']")).sendKeys("7458963214");
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
		wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Set Your PIN']")));
		 List<WebElement> pin= driver.findElements(By.xpath("(//android.widget.EditText[@resource-id='textInput'])"));
		 for (WebElement we : pin) {
			we.sendKeys("1");
		}
		 driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Submit']/android.view.ViewGroup")).click();
		 driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Owner Name']")).sendKeys("Kiran");
		 driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Store Name']")).sendKeys("SHSF");
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Select business category Type']")).click();
		 driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Product Sales']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//android.widget.TextView[@text=\"\"])[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Bakery']")).click();
		 driver.findElement(By.xpath("//android.widget.EditText[@text=\"shsf-bakery.nextshopz.biz\"]")).clear();
		 String[] items = {"admin", "wwwww", "mailmail", "ftpftp", "apiapi", "support", "dashboard", "google", "apple", "facebook", 
				    "amazon", "microsoft", "paypal", "twitter", "appapp", "static", "cdndn", "nextshopz", "localhost", 
				    "nextshopz.com", "nextshopz.biz", "smtpsmtp", "imapimap", "poppop", "dnsdns", "ns1ns1", "ns2ns2", "xnxn--"};
		 for (String string : items) {
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//android.widget.EditText")).sendKeys(string);
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//android.widget.TextView[@text='Verify']")).click();
			 Thread.sleep(2000);
			 WebElement toast = wd.until(
					    ExpectedConditions.presenceOfElementLocated(
					        By.xpath("//android.widget.Toast[contains(@text,'reserved word') or contains(@text,'Invalid subdomain format')]")
					    )
					);
					Assert.assertNotNull(toast, "Toast not found");
		}
		 	 
	}

}
