package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignUp {
	
	
	public SignUp(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath="//android.widget.TextView[@text = 'email']")
	public WebElement email;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text = 'password']")
	public WebElement password;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text = 'Sign IN']")
	public WebElement sign;
	
	
	public void emailEnter(String emailname)
	{
		this.email.sendKeys(emailname);
	}
	
	public void enterpassword(String pass)
	{
		this.password.sendKeys(pass);
	}
	
	public void clickSigup()
	{
		this.sign.click();
	}
	
	
	
	
	

}
