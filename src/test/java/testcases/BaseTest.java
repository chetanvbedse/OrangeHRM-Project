package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.DashbordPage;
import pages.LoginPage;


public class BaseTest {

	public static WebDriver driver;
	
	public LoginPage lp;
	public DashbordPage dp;
	
	
	
	@BeforeSuite
	public void initBrowser()
	{
			
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		
		}
	
	@BeforeClass
	public void createobject()
	{
		lp = new LoginPage(driver);
		dp = new DashbordPage(driver);
		
	}
	
}
