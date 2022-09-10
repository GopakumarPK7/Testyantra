import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator {
@Test
public void calculator() throws MalformedURLException
{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	dc.setCapability(MobileCapabilityType.UDID, "C4ATAS000000");
	dc.setCapability("appPackage", "com.asus.calculator");
	dc.setCapability("appActivity", ".Calculator");
	URL url = new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(url,dc);
	driver.findElement(By.id("com.asus.calculator:id/digit2")).click();
	driver.findElement(By.id("com.asus.calculator:id/plus")).click();
	driver.findElement(By.id("com.asus.calculator:id/digit5")).click();
	driver.findElement(By.id("com.asus.calculator:id/equal")).click();
	String value = driver.findElement(By.id("com.asus.calculator:id/resultEditTextID")).getText();
	System.out.println(value);
}
}
