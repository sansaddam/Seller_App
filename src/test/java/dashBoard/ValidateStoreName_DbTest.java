package dashBoard;

import org.testng.annotations.Test;

import Generic_Base.Base_Utilities54Test;
import io.appium.java_client.AppiumBy;

public class ValidateStoreName_DbTest extends Base_Utilities54Test{
	@Test
	public void validateStoreName() {
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"SDSF\"]")).isDisplayed();
	}

}
