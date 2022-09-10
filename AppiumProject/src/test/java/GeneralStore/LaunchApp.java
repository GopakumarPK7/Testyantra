package GeneralStore;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.graphbuilder.curve.LagrangeCurve;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pom.LoginGeneral;

public class LaunchApp 
{
@Test
public void launchapp() throws MalformedURLException
{
DesiredCapabilities dc=new DesiredCapabilities();
dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
dc.setCapability(MobileCapabilityType.UDID, "C4ATAS000000");
dc.setCapability("appPackage", "com.androidsample.generalstore");
dc.setCapability("appActivity", ".SplashActivity");
URL url =new URL("http://localhost:4723/wd/hub");
AndroidDriver driver=new AndroidDriver(url,dc);
LoginGeneral lg=new LoginGeneral();
lg.login("gk");


}
}