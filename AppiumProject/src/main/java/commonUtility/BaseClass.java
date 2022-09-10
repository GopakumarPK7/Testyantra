package commonUtility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pom.GenerateMail;
import pom.GmailHomePage;
import pom.LoginGmail;
import pom.SendItemsPage;

public class BaseClass extends InstanceClass
{
		
	

@BeforeClass
public void startserver()
{
	//service = AppiumDriverLocalService.buildDefaultService();
	//service.start();
	


}
@BeforeMethod
public void openApp() throws MalformedURLException
{
	excel =new ExcelUtility ();
	ppt=new PropertyFileUtility();
	driverUtility=new AndroidDriverUtility();
	excel.initializeExcel(Iconstants.ONLINESHOPPINGEXCELFILEPATH);
	ppt.initializePropertyFile(Iconstants.ONLINESHOPPINGPROPERTYFILEPATH);
	platformName=ppt.getDataFromProperties("PlatformName");
	version=ppt.getDataFromProperties("platformVersion");
	deviceID=ppt.getDataFromProperties("deviceId");
	appPackage=ppt.getDataFromProperties("packageName");
	appAcitvity=ppt.getDataFromProperties("appActivity");
	appurl=ppt.getDataFromProperties("url");
	timeout=ppt.getDataFromProperties("timeout");
	long time=Long.parseLong(timeout);
	subject = excel.getTheDataFromExcel("online", 0, 0);
	actualText = excel.getTheDataFromExcel("online", 1, 0);
	email=excel.getTheDataFromExcel("online", 2, 0);
    soft = new SoftAssert();
  //  driver1=new WebDriver();
	dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, version);
	dc.setCapability(MobileCapabilityType.UDID,deviceID );
	dc.setCapability("appPackage",appPackage );
	dc.setCapability("appActivity",appAcitvity );
	url =new URL(appurl);
	driver=new AndroidDriver(url,dc);
	driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
	login=new LoginGmail(driver);
	home=new GmailHomePage(driver);
	generateMail=new GenerateMail(driver);
	sendAndValidate=new SendItemsPage(driver);
}
@AfterMethod
public void closeApp()
{	
	soft.assertAll();
	driver.closeApp();
}
@AfterClass
public void stopserver()
{
	//service.stop();
}

}
