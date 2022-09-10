package GeneralStore;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import commonUtility.PropertyFileUtility;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class EndToEndTest 
{
	AndroidDriver driver;
	@Test
	public void launchapp() throws MalformedURLException
	{
	DesiredCapabilities dc=new DesiredCapabilities();
	PropertyFileUtility ppt=new PropertyFileUtility();
	String platformName = ppt.getDataFromProperties("PlatformName");
	String version = ppt.getDataFromProperties("platformVersion");
	String id = ppt.getDataFromProperties("deviceId");
	String packageName = ppt.getDataFromProperties("packageName");
	String activity = ppt.getDataFromProperties("appActivity");
	String appurl = ppt.getDataFromProperties("url");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
	dc.setCapability(MobileCapabilityType.UDID, id);
	dc.setCapability("appPackage",packageName );
	dc.setCapability("appActivity", activity);
	URL url =new URL(appurl);
	driver=new AndroidDriver(url,dc);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"19:92c87fe4-250a-4fb4-827d-cb13561e726a\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup")).click();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")).click();
    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.TextView")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"text_brand\"][1]")).click();

	}
	public static void scrollTillElement(AndroidDriver driver,String an,String av) {
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	    
	}	
}