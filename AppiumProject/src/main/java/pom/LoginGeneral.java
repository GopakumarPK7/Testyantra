package pom;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginGeneral 
{
@FindBy(id="com.androidsample.generalstore:id/spinnerCountry")
private MobileElement countryDD;
@FindBy(id="com.androidsample.generalstore:id/nameField")
private MobileElement nameTF;
@FindBy(id="com.androidsample.generalstore:id/radioMale")
private MobileElement malebtn;
@FindBy(id="com.androidsample.generalstore:id/btnLetsShop")
private MobileElement login;

public MobileElement getCountryDD() {
	return countryDD;
}

public MobileElement getNameTF() {
	return nameTF;
}

public MobileElement getMalebtn() {
	return malebtn;
}

public MobileElement getLogin() {
	return login;
}

//business library
public void login(String name)
{
	nameTF.sendKeys(name);
	login.click();
}
public LoginGeneral(AndroidDriver driver)
{
	//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	PageFactory.initElements(driver, this);
}
}