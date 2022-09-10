package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailHomePage 
{
@FindBy(id="com.google.android.gm:id/next_button")
private WebElement nextBtn;
@FindBy(id="com.google.android.gm:id/compose_button")
private WebElement composeBtn;
public WebElement getNextBtn() {
	return nextBtn;
}
public WebElement getComposeBtn() {
	return composeBtn;
}
public void composeMail()
{
	nextBtn.click();
	composeBtn.click();
}
public GmailHomePage(WebDriver appiumdriver)
{
	PageFactory.initElements(appiumdriver, this);
}
}
