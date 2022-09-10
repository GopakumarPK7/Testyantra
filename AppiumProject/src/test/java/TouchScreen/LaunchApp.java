package TouchScreen;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchApp 
{
@Test
public void launchapp() throws MalformedURLException
{
DesiredCapabilities dc=new DesiredCapabilities();
dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
dc.setCapability(MobileCapabilityType.UDID, "C4ATAS000000");
dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
dc.setCapability("appActivity", ".TouchScreenTestActivity");
URL url =new URL("http://localhost:4723/wd/hub");
AndroidDriver driver=new AndroidDriver(url,dc);
driver.launchApp();
boolean value=driver.isAppInstalled("jp.rallwell.siriuth.touchscreentest");
System.out.println(value);
}
}