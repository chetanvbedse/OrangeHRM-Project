package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy(xpath = "//*[@name='username']")
	private WebElement uname;
	
	@FindBy(xpath = "//*[@name='password']")
	private WebElement pword;
	
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginbutton;
	
	@FindBy(xpath = "//*[text()='Logout']")
	private WebElement logoutbutton;
	
	@FindBy(xpath = "//*[@class='oxd-userdropdown-name']")
	private WebElement profiledropdown;
	
	@FindBy(xpath = "//*[@class='oxd-text oxd-text--p oxd-alert-content-text']")
	private WebElement errormsg;
	
	WebDriver driver;
	public static String ActualMsg;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginToWeb(String validusername, String validpassword)
	{
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		uname.sendKeys(validusername);
		pword.sendKeys(validpassword);
		loginbutton.click();
	}
	
	
	
	public String titleOfPage()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public void logoutToWeb() throws InterruptedException
	{
		Thread.sleep(2000);
		profiledropdown.click();
		logoutbutton.click();
	}
	
	public void invalidUsernameLogin(String invalidusername, String validpassword) 
	{
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		uname.sendKeys(invalidusername);
		pword.sendKeys(validpassword);
		loginbutton.click();
		ActualMsg = errormsg.getText();
		 
	
	}
	
	public void invalidPasswordLogin(String validusername, String invalidpassword) 
	{
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		uname.sendKeys(validusername);
		pword.sendKeys(invalidpassword);
		loginbutton.click();
		ActualMsg = errormsg.getText();
		
		
	}
	
	public void invalidUnameAndPwordLogin(String validusername, String validpassword)
	{
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		uname.sendKeys(validusername);
		pword.sendKeys(validpassword);
		loginbutton.click();
		ActualMsg = errormsg.getText();
		
	}
}
