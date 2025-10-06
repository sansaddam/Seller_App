package add_Service;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.Base_Utilities54Test;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ValidInstaURL_AddServiceTest extends Base_Utilities54Test{
	@Test
	public void validInstaURL() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/text1\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Normal Service\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter service name\"]")).sendKeys("Laptop");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Select Category\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"window ACs\"]")).click();
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
	    Sequence swipe = new Sequence(finger, 1);
	    swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 450, 1980));
	    swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
	    swipe.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), 450, 1300));
	    swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
	    driver.perform(Arrays.asList(swipe));
	    driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Instagram\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter video url\"]")).sendKeys("https://www.instagram.com/reel/DPMAoZDCckH/?igsh=MW9hMHJyMm81b2wxdg==");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"https://www.instagram.com/reel/DPMAoZDCckH/?igsh=MW9hMHJyMm81b2wxdg==\"]")).isDisplayed();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Show Availability Service Packages\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Select Package\"]")).click();
		Thread.sleep(2000);
		PointerInput finger1= new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		Sequence swipe1=new Sequence(finger1, 2);
		swipe1.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 450, 1980));
		swipe1.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		swipe1.addAction(finger1.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), 450,1300));
		swipe1.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		driver.perform(Arrays.asList(swipe1));
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Pricing Details\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Duration of Service(in hours)\"]")).sendKeys("2");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Unit Price(e.g 500 rs)\"]")).sendKeys("752");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Discount\"]")).sendKeys("150");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"e.g 1 per booking(up to 5 only)\"]")).sendKeys("2");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Submit\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Add Service\"])[2]")).click();
		
		// Preserve Appium driver reference
        AndroidDriver mobileDriver = (AndroidDriver) driver;

        // Run web validation in separate thread
        Thread webThread = new Thread(() -> {
            WebDriver driver2 = new FirefoxDriver();
            driver2.manage().window().maximize();
            driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
            driver2.get("https://beautyparlour-sdsf.nextshopz.biz/");
            driver2.findElement(By.xpath("(//div/h3[contains(text(),'Laptop')]/parent::div//small[contains(text(),'window ACs')])[2]")).click();

            driver2.quit();
        });

        // Start web validation (in parallel)
        webThread.start();
        webThread.join(); // Wait until web part completes

        //Continue with Appium after web part finishes
        if (mobileDriver.getSessionId() != null) {
            System.out.println("✅ Appium session still active, continuing mobile flow...");
        } else {
            throw new RuntimeException("❌ Appium session lost after web validation!");
        }
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Laptop\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\" Yes,Delete Service\"]")).click();
		WebElement toast = wd.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Toast[@text=\"Service deleted\"]")));
		Assert.assertNotNull(toast, "Toast not Found");
	}
}
