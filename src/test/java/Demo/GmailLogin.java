package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GmailLogin {
		@Test
		public void login() {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://mail.google.com/");
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sdfghjkl@gmail.com");
			driver.quit();
		}
}
