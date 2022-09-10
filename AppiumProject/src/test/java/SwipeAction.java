
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwipeAction {
	@Test
	public void launchapp() throws MalformedURLException
	{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	dc.setCapability(MobileCapabilityType.UDID, "C4ATAS000000");
	dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
	dc.setCapability("appActvity", ".TouchScreenTestActivity");
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,dc);
	//vertical swipe
	driver.swipe(206, 382, 209, 1646,500);
	//Horizontal swipe
	driver.swipe(88,1021, 947, 1010, 500);
	Dimension value = driver.manage().window().getSize();
	int height = value.getHeight();
	int width = value.getWidth();
	//vertical swipe equal
	driver.swipe(width/2, height, width/2, height, 500);
	//vertical swipe
	driver.swipe(width/2, (int)(height*0.25), width/2, (int)(height*0.80), 1000);
	driver.swipe((int)(width*0.1), (int)(height*0.2), (int)(width*0.1), (int)(height*0.8), 500);
	driver.swipe((int)(width*0.5), (int)(height*0.2), (int)(width*0.5), (int)(height*0.8), 500);
	driver.swipe((int)(width*0.9), (int)(height*0.2), (int)(width*0.9), (int)(height*0.8), 500);
	
	//Horizontal swipe
	driver.swipe((int)(width*0.25), height/2, (int)(width*0.80), height/2, 1000);
	driver.swipe((int)(width*0.1), (int)(height*0.8), (int)(width*0.9), (int)(height*0.8), 500);
	driver.swipe((int)(width*0.1), (int)(height*0.2), (int)(width*0.9), (int)(height*0.2), 500);
	driver.swipe((int)(width*0.1), (int)(height*0.5), (int)(width*0.9), (int)(height*0.5), 500);
	
	
}
	
}