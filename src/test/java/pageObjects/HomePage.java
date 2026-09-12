package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
		
@FindBy(xpath="//span[normalize-space()='My Account']")
WebElement lnkMyaccount;

@FindBy(xpath="//a[normalize-space()='Register']")
WebElement lnkRegister;

@FindBy(linkText = "Login")
WebElement linkLogin;         //Login link added in step5

public void clickMyAccount()
{   
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	lnkMyaccount.click();
}
	public void clickRegister()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lnkRegister.click();
	}
	
	public void clickLogin()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		linkLogin.click();
	}

}
