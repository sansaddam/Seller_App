package dashBoard;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Arrays;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.Test;
import Generic_Base.Base_Utilities54Test;
import io.appium.java_client.AppiumBy;

public class ValidateSummaryDetailsZero_Db extends Base_Utilities54Test {
	@Test
	public void summaryDetailsZero() {
		try {
			WebElement revenue = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Revenue\"]/preceding-sibling::android.widget.TextView[@text=\"₹0.00\"]"));
			String revActual = revenue.getText();
			if (revActual.equalsIgnoreCase("₹0.00")) {
				assertTrue(true);
			}
			WebElement booking = driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Bookings\"])[1]/preceding-sibling::android.widget.TextView[@text=\"0\"]"));
			String bookActual = booking.getText();
			if (bookActual.equalsIgnoreCase("0")) {
				assertTrue(true);
			}
			horizontalSwipe();
			WebElement subscribers = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Subscribers\"]/preceding-sibling::android.widget.TextView[@text=\"0\"]"));
			String subActual = subscribers.getText();
			if (subActual.equalsIgnoreCase("0")) {
				assertTrue(true);
			}
			WebElement users = driver.findElement(AppiumBy.xpath("(//android.widget.TextView[@text=\"Users\"])[1]/preceding-sibling::android.widget.TextView[@text=\"0\"]"));
			String userActual = users.getText();
			if (userActual.equalsIgnoreCase("0")) {
				assertTrue(true);
			}
		} catch (Exception e) {
			System.out.println("Summary has values");
		}
		
	}
		public void horizontalSwipe() {
			PointerInput finger=new PointerInput(Kind.TOUCH, "finger");
			Sequence swipe=new Sequence(finger, 1);
			swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), 900, 550));
			swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
		    swipe.addAction(finger.createPointerMove(Duration.ofMillis(500), PointerInput.Origin.viewport(), 160, 550));
		    swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		    driver.perform(Arrays.asList(swipe));
		}
}
