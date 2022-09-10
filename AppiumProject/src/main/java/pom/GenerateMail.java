package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GenerateMail
{
@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.EditText")
private WebElement mailIDTf;
@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]")
private WebElement selectID;
@FindBy(id="com.google.android.gm:id/subject")
private WebElement subjectTf;
@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.widget.EditText")
private WebElement mailbodyTf;
@FindBy(xpath="//android.widget.Button[@content-desc=\"Send\"]")
private WebElement sendBtn;
public WebElement getSendBtn() {
	return sendBtn;
}
public WebElement getMailIDTf() {
	return mailIDTf;
}
public WebElement getSelectID() {
	return selectID;
}
public WebElement getSubjectTf() {
	return subjectTf;
}
public WebElement getMailbodyTf() {
	return mailbodyTf;
}
public void generateAndSendMail(String mailId,String subject,String mailbody) throws InterruptedException
{
mailIDTf.sendKeys(mailId);
Thread.sleep(2000);
selectID.click();
subjectTf.sendKeys(subject);
mailbodyTf.sendKeys(mailbody);
sendBtn.click();
}
public GenerateMail(WebDriver appiumdriver)
{
	PageFactory.initElements(appiumdriver, this);
}
}
