import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class ZoomPinch 
{
	@Test
public void scaleView() throws MalformedURLException, InterruptedException
{
	AppiumDriverLocalService service=AppiumDriverLocalService.buildDefaultService();
	service.start();
	DesiredCapabilities dc =new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	dc.setCapability(MobileCapabilityType.UDID, "C4ATAS000000");
	dc.setCapability("noReset", true);
	dc.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
	dc.setCapability("appActvity", ".MainActivity");
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,dc);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("android:id/button1")).click();
	driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")).click();
	WebElement img = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.view.View"));
	driver.zoom(img);
	Thread.sleep(3000);
	driver.pinch(img);
}
}
