package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class chooseDates 
{
	public chooseDates(AndroidDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text = '2']")
	public WebElement pickdate;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text = '3']")
	public WebElement dropDate;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text = 'apply']")
	public WebElement apply;
	
	
	public void pick()
	{
		this.pickdate.click();
	}
	
	public void drop()
	{
		this.dropDate.click();
	}
	
	public void applyChanges()
	{
		this.apply.click();
	}
	
	
}
