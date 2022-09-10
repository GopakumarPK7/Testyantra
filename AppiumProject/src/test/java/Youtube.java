import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Youtube {
	@Test
	public void launchapp() throws MalformedURLException
	{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	dc.setCapability(MobileCapabilityType.UDID, "C4ATAS000000");
	dc.setCapability("appPackage", "com.google.android.youtube");
	dc.setCapability("appActivity", ".HomeActivity");
	URL url =new URL("http://localhost:4723/wd/hub");
    AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, dc);
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    org.openqa.selenium.ScreenOrientation orientation =driver.getOrientation();
    System.out.println(orientation);
    driver.rotate(orientation.LANDSCAPE);
    driver.rotate(orientation.PORTRAIT);
	}
}
