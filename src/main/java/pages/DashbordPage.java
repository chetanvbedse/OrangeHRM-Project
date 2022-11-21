package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashbordPage {

	@FindBy(xpath = "//*[text()='Admin']")
	private WebElement admintab;
	
	WebDriver driver;
	
	public DashbordPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void openAdminTab()
	{
		admintab.click();
	}
}
