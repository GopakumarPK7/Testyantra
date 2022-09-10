import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemos 
{
	

	@Test
	public void launchapp() throws MalformedURLException
	{
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	dc.setCapability(MobileCapabilityType.UDID, "C4ATAS000000");
	dc.setCapability("appPackage", "io.appium.android.apis");
	dc.setCapability("appActivity", ".ApiDemos");
	URL url =new URL("http://localhost:4723/wd/hub");
    AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, dc);
    driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
    driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]")).click();
    driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Light Theme\"]")).click();
    driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("Planet");
    driver.findElement(By.id("io.appium.android.apis:id/check1")).click();
    driver.findElement(By.id("io.appium.android.apis:id/check2")).click();
    driver.findElement(By.id("io.appium.android.apis:id/radio1")).click();
    driver.findElement(By.id("io.appium.android.apis:id/radio2")).click();
    driver.findElement(By.id("io.appium.android.apis:id/star")).click();
    driver.findElement(By.id("io.appium.android.apis:id/toggle1")).click();
    driver.hideKeyboard();
    driver.findElement(By.id("io.appium.android.apis:id/toggle2")).click();
    driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
   
    List<WebElement> options = driver.findElements(By.className("android.widget.CheckedTextView"));
    for(WebElement a:options)
    {
    	System.out.println(a.getText());
    }
    driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[3]")).click();
    driver.findElement(By.id("io.appium.android.apis:id/button")).click();
}
}