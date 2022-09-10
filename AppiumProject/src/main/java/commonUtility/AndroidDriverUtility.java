package commonUtility;

import io.appium.java_client.android.AndroidDriver;

public class AndroidDriverUtility 
{
	//this method is used to scroll 
	public static void scrollTillElement(AndroidDriver driver,String an,String av) {
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))").click();;
	}
	
}
