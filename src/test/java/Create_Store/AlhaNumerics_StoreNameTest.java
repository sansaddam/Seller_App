package Create_Store;

import static org.testng.Assert.assertNotEquals;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Generic_Base.BaseCapabilitiesTest;

public class AlhaNumerics_StoreNameTest extends BaseCapabilitiesTest {
	@Test
	public void alphaNumerics() throws InterruptedException {
		driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.android.permissioncontroller:id/permission_allow_button']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Skip']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Get Started']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Enter mobile number']")).sendKeys("9701407421");
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
		 for (WebElement we : pin) {
			we.sendKeys("1");
		}
		 driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Submit']/android.view.ViewGroup")).click();
		 driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Owner Name']")).sendKeys("Saddam");
		 WebElement store = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Store Name']"));
		 store.sendKeys("S1254san15");
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();
		 String trimNumbers = store.getText();
		 System.out.println(trimNumbers);
		 assertNotEquals(trimNumbers, "S1254san15");
		 
	}
}
