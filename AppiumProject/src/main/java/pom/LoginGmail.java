package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginGmail 
{
	
	@FindBy(id="com.google.android.gm:id/welcome_tour_got_it")
	private WebElement gotitbtn;
	@FindBy(id="com.google.android.gm:id/action_done")
	private WebElement takemetogmailbtn;

	
	public WebElement getGotitbtn() {
		return gotitbtn;
	}
	public WebElement getTakemetogmailbtn() {
		return takemetogmailbtn;
	}
	public void login() throws InterruptedException
	{
		gotitbtn.click();	
		Thread.sleep(2000);
		takemetogmailbtn.click();
	}
public LoginGmail(WebDriver appiumdriver)
{
PageFactory.initElements(appiumdriver,this);
}
	}

