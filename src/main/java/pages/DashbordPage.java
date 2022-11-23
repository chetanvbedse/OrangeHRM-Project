package pages;

import java.util.List;

import org.bouncycastle.pqc.jcajce.provider.rainbow.SignatureSpi.withSha224;
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
	
	@FindBy(xpath = "//*[text()='General Information']")
	private WebElement generalinformation;
	
	@FindBy(xpath = "//*[text()='Locations']")
	private WebElement locations;
	
	@FindBy(xpath = "//*[text()='Structure']")
	private WebElement structure;
	
	@FindBy(xpath = "(//*[@class='oxd-topbar-body-nav-tab-item'])[4]")
	private WebElement qulifications;
	
	@FindBy(xpath = "(//*[@class='oxd-topbar-body-nav-tab-item'])[5]")
	private WebElement nationalities;
	
	@FindBy(xpath = "(//*[@class='oxd-topbar-body-nav-tab-item'])[6]")
	private WebElement corporatebranding;
	
	@FindBy(xpath = "(//*[@class='oxd-topbar-body-nav-tab-item'])[6]")
	private WebElement confrigration;
	
	@FindBy(xpath = "(//*[text()='PIM'])[1]")
	private WebElement pimtab;
	
	@FindBy(xpath = "//*[text()='Configuration ']")
	private WebElement confrigrationpimtab;
	
	@FindBy(xpath = "//*[text()='Employee List']")
	private WebElement employee;
	
	@FindBy(xpath = "(//*[text()='Leave'])[1]")
	private WebElement leavetab;
	
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
		generalinformation.click();
		organisationtab.click();
		locations.click();
		organisationtab.click();
		structure.click();
		qulifications.click();
		nationalities.click();
		corporatebranding.click();
		confrigration.click();
		
		
	}
	
	public void openPimTab()
	{
		pimtab.click();
		confrigrationpimtab.click();
		employee.click();
	}
	
	public void openLeaveTab()
	{
		leavetab.click();
	}
}
