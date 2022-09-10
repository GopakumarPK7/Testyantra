import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppMethods
{
@Test
public void apiDemos() throws MalformedURLException
{
DesiredCapabilities dc=new DesiredCapabilities();
dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
dc.setCapability(MobileCapabilityType.UDID, "C4ATAS000000");
dc.setCapability("appPackage", "io.appium.android.apis");
dc.setCapability("appActivity", ".ApiDemos");
URL url =new URL("http://localhost:4723/wd/hub");
AndroidDriver driver=new AndroidDriver(url,dc);
//Activates the given app if it installed,but not runnuing or if it is running in the background
driver.activateApp("io.appium.android.apis");

//terminate the particular application if it is running
driver.terminateApp("io.appium.android.apis");

//Queries th e state of an application
//not installed,Not runing ,Running in background_suspended,Running in background,Running_in_Forground

Applicationstate be =driver.queryAppState("io.appium.android.apis");
System.out.println(be);

//Resets the currently running app together with the session.
driver.resetApp();
driver.closeApp();
driver.launchApp();

//checks if an app is installed in the device

boolean stat=driver.isAppInstalled("io.appium.android.apis");
System.out.println(stat);
//
}
}
