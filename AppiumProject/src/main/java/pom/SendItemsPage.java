package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;

public class SendItemsPage 
{
@FindBy(xpath="//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")
private WebElement navBtn;
@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[9]/android.widget.LinearLayout/android.widget.TextView[1]")
private WebElement sendItemsBtn;
@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[3]")
private WebElement clickOnMail;
@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.widget.TextView")
private WebElement getMail;
public WebElement getNavBtn() {
	return navBtn;
}
public WebElement getSendItemsBtn() {
	return sendItemsBtn;
}
public WebElement getClickOnMail() {
	return clickOnMail;
}
public WebElement getGetMail() {
	return getMail;
}
public String getDataFromSenditems()
{
	navBtn.click();
	sendItemsBtn.click();
	clickOnMail.click();
	return getMail.getText();
}
public SendItemsPage(WebDriver appiumdriver)
{
	PageFactory.initElements(appiumdriver,this);
}
}
