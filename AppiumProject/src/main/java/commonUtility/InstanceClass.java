package commonUtility;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import pom.GenerateMail;
import pom.GmailHomePage;
import pom.LoginGmail;
import pom.SendItemsPage;

public class InstanceClass
{
	public AppiumDriverLocalService service;
	protected AndroidDriver driver;
	protected WebDriver driver1;
	public SoftAssert soft;
	protected LoginGmail login;
	protected GmailHomePage home;
	protected GenerateMail generateMail;
	protected SendItemsPage sendAndValidate;
	public ExcelUtility excel;
	public PropertyFileUtility ppt;
	public AndroidDriverUtility driverUtility;
	protected String platformName;
	protected String version;
	protected String deviceID;
	protected String appPackage;
	protected String appAcitvity;
	protected String appurl;
	protected String timeout;
	protected String subject;
	protected String actualText;
	protected String email;
	protected DesiredCapabilities dc;
	protected URL url ;
	
}
