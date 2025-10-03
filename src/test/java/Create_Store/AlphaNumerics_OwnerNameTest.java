package Create_Store;

import static org.testng.Assert.assertNotEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Base.BaseCapabilitiesTest;

public class AlphaNumerics_OwnerNameTest extends BaseCapabilitiesTest {
	@Test
	public void alphaNumeric() throws InterruptedException {
		WebDriverWait wd=new WebDriverWait(driver, Duration.ofSeconds(15));
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
		wd.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Set Your PIN']")));
		 List<WebElement> pin= driver.findElements(By.xpath("(//android.widget.EditText[@resource-id='textInput'])"));
		 for (WebElement we : pin) {
			we.sendKeys("1");
		}
		 driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Submit']/android.view.ViewGroup")).click();
		 WebElement name = driver.findElement(By.xpath("//android.widget.EditText[@text='Enter Owner Name']"));
		 name.sendKeys("Saddam1529");
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();
		 String removeNum = name.getText();
		 assertNotEquals(removeNum,"Saddam1529");
	}

}
