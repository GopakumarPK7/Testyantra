package Practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org	.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import commonUtility.AndroidDriverUtility;
import commonUtility.BaseClass;
import commonUtility.ExcelUtility;
import commonUtility.Iconstants;
import commonUtility.PropertyFileUtility;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Gmail extends BaseClass
{

	@Test
	public void Gmailapp() throws MalformedURLException, InterruptedException
	{
		login.login();
		home.composeMail();
		generateMail.generateAndSendMail(email, subject, actualText);
	    String expectedText = sendAndValidate.getDataFromSenditems();
		soft.assertEquals(actualText, expectedText);
	}	
}
