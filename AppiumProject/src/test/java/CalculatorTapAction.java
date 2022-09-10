import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorTapAction 
{
	AndroidDriver driver;
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
		driver=new AndroidDriver(url,dc);
		WebElement two = driver.findElement(By.id("com.asus.calculator:id/digit2"));
		tapAction(1, two, 500);
		WebElement plus = driver.findElement(By.id("com.asus.calculator:id/plus"));
		tapAction(1, 953, 1868, 500);
		WebElement five = driver.findElement(By.id("com.asus.calculator:id/digit5"));
		tapAction(1, five, 500);
		WebElement equal = driver.findElement(By.id("com.asus.calculator:id/equal"));
		tapAction(1, equal, 500);
		String value = driver.findElement(By.id("com.asus.calculator:id/resultEditTextID")).getText();
		System.out.println(value);
}
	public void tapAction(int fingers, WebElement element,int duration) {
		driver.tap(fingers, element, duration);
	}
	public void tapAction(int finger,int x,int y,int duration)
	{
		driver.tap(finger, x, y, duration);
	}
	{
		
	}
}
