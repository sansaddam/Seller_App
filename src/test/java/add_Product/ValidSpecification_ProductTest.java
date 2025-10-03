package add_Product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic_Base.Base_UtilitiesTest;
import io.appium.java_client.AppiumBy;

public class ValidSpecification_ProductTest extends Base_UtilitiesTest{
	@Test
	public void valid() throws InterruptedException {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Add Product\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"󰅂\"])[1]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter product Name\"]")).sendKeys("LapTop");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"\"])[2]")).click();
		driver.findElement(AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\" Done\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter price\"]")).sendKeys("700");
		WebElement stock = driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter stock quantity\"]"));
		stock.sendKeys("50");
		WebElement scroll = driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
		+".scrollIntoView(new UiSelector().text(\"Product Details\"))"
				)
				);
		scroll.click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter product description\"]")).sendKeys("The HP Pavilion Laptop delivers reliable performance in a sleek, stylish design. Powered by the latest Intel® Core™/AMD Ryzen™ processors and fast SSD storage, it ensures smooth multitasking and responsive computing. Featuring a vibrant Full HD display, immersive audio, and long-lasting battery life, it’s perfect for students, professionals, and families who need performance on the go.");
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+".scrollIntoView(new UiSelector().text(\"Images\"))"
						)
						);
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text=\"Enter product specification\"]")).sendKeys("💻 Processor: Latest Intel® Core™ i5/i7 (12th–13th Gen) or AMD Ryzen™ 5/7 (5000–7000 Series)\r\n"
				+ "🖥️ Display: 15.6” / 14” Full HD (1920 × 1080) IPS, Micro-Edge, Anti-Glare | Optional Touchscreen\r\n"
				+ "🎮 Graphics: Intel® Iris® Xe / AMD Radeon™ | Optional NVIDIA® GeForce® MX/GTX\r\n"
				+ "⚡ Memory (RAM): 8GB / 16GB DDR4 (expandable up to 32GB)\r\n"
				+ "💾 Storage: 512GB PCIe NVMe SSD | Optional 1TB SSD\r\n"
				+ "🔊 Audio: Dual speakers tuned by B&O | HP Audio Boost | Dual-array microphones\r\n"
				+ "📷 Camera: HP True Vision 720p HD Webcam with integrated microphone\r\n"
				+ "🔋 Battery: Up to 8–10 hours | 3-cell 41Wh/43Wh | HP Fast Charge (50% in 45 mins)\r\n"
				+ "📡 Connectivity: Wi-Fi 6, Bluetooth 5.2 | USB Type-C (10Gbps, PD, DisplayPort), 2× USB 3.1 Type-A, HDMI 2.0, SD Card Reader, Audio Combo Jack\r\n"
				+ "🎨 Design: Slim & lightweight (~1.5–1.7kg) | Stylish finish with multiple color options\r\n"
				+ "📏 Dimensions: Approx. 14.24 × 9.67 × 0.71 in (15.6” model)\r\n"
				+ "💼 Best For: Students, professionals, and families who need performance on the go");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Create\"]")).click();
		WebElement toast = wd.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Toast[contains(@text,'Your product created successfully')]")));
		Assert.assertNotNull(toast, "Toast not found");
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"+ New Product\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"₹ 700\"])")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"The HP Pavilion Laptop delivers reliable performance in a sleek, stylish design. Powered by the latest Intel® Core™/AMD Ryzen™ processors and fast SSD storage, it ensures smooth multitasking and responsive computing. Featuring a vibrant Full HD display, immersive audio, and long-lasting battery life, it’s perfect for students, professionals, and families who need performance on the go.\"]")).isDisplayed();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[contains(@text,'💻 Processor: Latest Intel')]")).isDisplayed();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\" Yes,Delete Product\"]")).click();
		WebElement msg = wd.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.xpath("//android.widget.Toast[contains(@text,'Product deleted')]")));
		Assert.assertNotNull(msg, "Toast not found");
	}

}
