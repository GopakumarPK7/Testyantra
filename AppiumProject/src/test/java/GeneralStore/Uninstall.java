package GeneralStore;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Uninstall {
	@Test
	public void uninstallapp() throws MalformedURLException
	{
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		dc.setCapability(MobileCapabilityType.UDID, "C4ATAS000000");
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".AllProductsActivity");
		//dc.setCapability(MobileCapabilityType.FULL_RESET, "true");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url,dc);
		driver.removeApp("com.androidsample.generalstore");
		boolean value=driver.isAppInstalled("com.androidsample.generalstore");
		System.out.println(value);
	}
	

}
