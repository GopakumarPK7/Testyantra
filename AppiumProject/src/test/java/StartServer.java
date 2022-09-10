import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class StartServer 
{
	@Test
public void startServer() throws MalformedURLException
{
	//default service
	//AppiumDriverLocalService is a final class(only overloading is allowed)object creation and overriding is not allowed
	AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
	service.start();// it just starts the server
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	dc.setCapability(MobileCapabilityType.UDID, "C4ATAS000000");
	dc.setCapability("noReset", true);
	dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
	dc.setCapability("appActvity", ".TouchScreenTestActivity");
	
	//A
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,dc);
}
}
