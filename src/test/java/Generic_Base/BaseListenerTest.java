package Generic_Base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import org.openqa.selenium.io.FileHandler;

public class BaseListenerTest extends BaseCapabilitiesTest implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		String timestamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot)BaseTest.driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dis=new File("./ScreenShots/" + result.getTestClass().getRealClass().getSimpleName() + "_" + timestamp + ".png");
		try {
			FileHandler.copy(source, dis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
