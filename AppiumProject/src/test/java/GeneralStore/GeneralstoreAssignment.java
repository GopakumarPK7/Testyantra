package GeneralStore;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class GeneralstoreAssignment {
	AndroidDriver driver;
	@Test
	public void launchapp() throws MalformedURLException
	{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	dc.setCapability(MobileCapabilityType.UDID, "C4ATAS000000");
	dc.setCapability("appPackage", "com.androidsample.generalstore");
	dc.setCapability("appActivity", ".SplashActivity");
	URL url =new URL("http://localhost:4723/wd/hub");
	driver=new AndroidDriver(url,dc);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
	scrollTillElement(driver, "text", "India");
	driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("GK");
	driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]")).click();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]")).click();
	driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	String Expectedprice = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
	String ActualPrice="$ 280.97";
	SoftAssert soft = new SoftAssert();
	soft.assertEquals(ActualPrice, Expectedprice);
	soft.assertAll();
	driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
	driver.closeApp();
		
}
	public static void scrollTillElement(AndroidDriver driver,String an,String av) {
	
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))").click();;
	}
}