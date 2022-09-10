import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DragAndDrop {

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
    driver.findElementByAccessibilityId("Drag and Drop").click();
    MobileElement src = (MobileElement)driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
    MobileElement trg = (MobileElement)driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));
    TouchAction touch=new TouchAction(driver);
    touch.longPress(src).moveTo(trg).release().perform();
	}
}