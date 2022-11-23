package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashbordPage {

	@FindBy(xpath = "//*[text()='Admin']")
	private WebElement admintab;
	
	@FindBy(xpath = "//*[contains(@class,'oxd-icon bi-check oxd-checkbox-input-icon')]")
	private List<WebElement> checkboxes;
	
	@FindBy(xpath = "(//*[@class='oxd-topbar-body-nav-tab-item'])[2]")
	private WebElement jobtab;
	
	@FindBy(xpath = "(//*[text()='Job Titles'])[1]")
	private WebElement jobtitle;
	
	@FindBy(xpath = "(//*[text()='Pay Grades'])[1]")
	private WebElement paygrades;
	
	@FindBy(xpath = "//*[text()='Employment Status']")
	private WebElement employmentstatus;
	
	@FindBy(xpath = "//*[text()='Job Categories']")
	private WebElement jobcategories;
	
	@FindBy(xpath = "//*[text()='Work Shifts']")
	private WebElement workshifts;
	
	@FindBy(xpath = "(//*[@class='oxd-topbar-body-nav-tab-item'])[3]")
	private WebElement organisationtab;
	
	@FindBy(xpath = "//*[@class='oxd-main-menu-item active']")
	private WebElement pimtab;
	
	WebDriver driver;
	
	public DashbordPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void openAdminTab()
	{
		admintab.click();
	
		for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
		}
		
		jobtab.click();
		jobtitle.click();
		jobtab.click();
		paygrades.click();
		jobtab.click();
		employmentstatus.click();
		jobtab.click();
		jobcategories.click();
		jobtab.click();
		workshifts.click();
		organisationtab.click();
	}
	
	public void openPimTab()
	{
		pimtab.click();
	}
}
