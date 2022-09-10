import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calender {
	@Test
	public void swipeapp() throws MalformedURLException
	{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	dc.setCapability(MobileCapabilityType.UDID, "C4ATAS000000");
	dc.setCapability("appPackage", "com.whereismytrain.view.activities");
	dc.setCapability("appActvity", ".MainPagerActivity");
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,dc);
	driver.swipe(70,83, 79, 845, 500);
}
}