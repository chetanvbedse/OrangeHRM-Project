package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import listeners.TestNGListeners;
import pages.LoginPage;
import utility.ExcelReader;

public class LoginTest  extends TestNGListeners{

	
	@Test(priority = 1)
	public void validatelogin() throws IOException
	{
		test.info("Entering credentials");
		lp.loginToWeb(ExcelReader.readData(2, 1, "Sheet1"),ExcelReader.readData(3, 1, "Sheet1"));
		test.info("Entered creds are: "+ExcelReader.readData(2, 1, "Sheet1")+" "+ExcelReader.readData(3, 1, "Sheet1"));

	}
	
	@Test(priority = 2)
	public void validateTitle()
	{
		String actualtitle = lp.titleOfPage();
		
		String expectedtitle = "OrangeHRM";
		Assert.assertEquals(actualtitle, expectedtitle);
		test.info("Title of the page is : "+lp.titleOfPage());
	}
	
	@Test(priority = 3)
	public void validateLogout() throws InterruptedException
	{
		
		lp.logoutToWeb();
	}
	@Test(priority = 4)
	public void validateInvalidUsernameLogin() throws IOException
	{
		test.info("Entering credentials");
		lp.invalidUsernameLogin(ExcelReader.readData(4, 1, "Sheet1"),ExcelReader.readData(3, 1, "Sheet1"));
		test.info("Entered creds are: "+ExcelReader.readData(4, 1, "Sheet1")+" "+ExcelReader.readData(3, 1, "Sheet1"));
		Assert.assertEquals(LoginPage.ActualMsg, "Invalid credentials");
		test.info("Error msg is : "+LoginPage.ActualMsg);
	}
	
	@Test(priority = 5)
	public void validateInvalidPasswordLogin() throws IOException
	{
		test.info("Entering credentials");
		lp.invalidPasswordLogin(ExcelReader.readData(2, 1, "Sheet1"),ExcelReader.readData(5, 1, "Sheet1"));
		test.info("Entered creds are: "+ExcelReader.readData(2, 1, "Sheet1")+" "+ExcelReader.readData(5, 1, "Sheet1"));
		Assert.assertEquals(LoginPage.ActualMsg, "Invalid credentials");
		test.info("Error msg is : "+LoginPage.ActualMsg);
		
	}
	
	@Test(priority = 6)
	public void validateInvalidUnameAndPwordLogin() throws IOException
	{
		test.info("Entering credentials");
		lp.invalidUnameAndPwordLogin(ExcelReader.readData(4, 1, "Sheet1"),ExcelReader.readData(5, 1, "Sheet1"));
		test.info("Entered creds are: "+ExcelReader.readData(4, 1, "Sheet1")+" "+ExcelReader.readData(5, 1, "Sheet1"));
		Assert.assertEquals(LoginPage.ActualMsg, "Invalid credentials");
		test.info("Error msg is : "+LoginPage.ActualMsg);
	}
	
	@Test(priority = 7)
	public void validatelogin1() throws IOException
	{
		test.info("Entering credentials");
		lp.loginToWeb(ExcelReader.readData(2, 1, "Sheet1"),ExcelReader.readData(3, 1, "Sheet1"));
		test.info("Entered creds are: "+ExcelReader.readData(2, 1, "Sheet1")+" "+ExcelReader.readData(3, 1, "Sheet1"));

	}
	
}
