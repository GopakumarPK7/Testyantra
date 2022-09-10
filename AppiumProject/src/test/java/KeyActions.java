import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class KeyActions 
{
	@Test
	public void launchapp() throws MalformedURLException, InterruptedException
	{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	dc.setCapability(MobileCapabilityType.UDID, "C4ATAS000000");
	dc.setCapability("appPackage", "com.androidsample.generalstore");
	dc.setCapability("appActivity", ".SplashActivity");
	URL url =new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,dc);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println(AndroidKeyCode.KEYCODE_VOLUME_UP);
	System.out.println(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
	System.out.println(AndroidKeyCode.KEYCODE_BACK);
	System.out.println(AndroidKeyCode.KEYCODE_ENTER);
	System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
	System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
	driver.pressKeyCode(AndroidKeyCode.KEYCODE_BACK);
	Thread.sleep(2000);
	driver.closeApp();
}
}