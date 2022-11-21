package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen {

	  
	static ExtentReports extent;
	
	public static ExtentReports extentReportGenerator()
	{
		String path = System.getProperty("user.dir")+"\\reports\\orangeHRMreport.html";
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		
		reporter.config().setTheme(Theme.DARK);
		
		reporter.config().setReportName("Orange HRM execution report");
		
		extent = new ExtentReports();
		 
		extent.attachReporter(reporter);
			
		extent.setSystemInfo("Project name", "Orange HRM");
			
		extent.setSystemInfo("Executed by", "Chetan Bedse");
			
		extent.setSystemInfo("Environment used", "Staging");
			
		return extent;
		
	}
}
