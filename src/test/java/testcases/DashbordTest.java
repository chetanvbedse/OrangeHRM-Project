package testcases;

import org.testng.annotations.Test;

import listeners.TestNGListeners;

public class DashbordTest extends TestNGListeners{

	
	
	@Test(priority = 7)
	public void validateAdminTab()
	{
	    dp.openAdminTab();
	}
	
	
	@Test(priority = 8)
	public void validatePimTab()
	{
		dp.openPimTab();
	}
}
