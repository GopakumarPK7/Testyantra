package commonUtility;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClassOriginal 
{
	AppiumDriverLocalService service;
	AndroidDriver driver;
@BeforeSuite
public void database()
{
	System.out.println("open database");
}
@BeforeClass
public void startserver()
{
	service = AppiumDriverLocalService.buildDefaultService();
	service.start();

}
@BeforeMethod
public void openApp() throws MalformedURLException
{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	dc.setCapability(MobileCapabilityType.UDID, "C4ATAS000000");
	dc.setCapability("appPackage", "io.appium.android.apis");
	dc.setCapability("appActivity", ".ApiDemos");
	URL url =new URL("http://localhost:4723/wd/hub");
	driver=new AndroidDriver(url,dc);
}
@AfterMethod
public void closeApp()
{
	driver.closeApp();
}
@AfterClass
public void stopserver()
{
	service.stop();
}
@AfterSuite
public void closedatabase()
{
	System.out.println("close database");
}
}
