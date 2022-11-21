package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	
	public static String captureScreenShotWithPath(WebDriver driver , String filename) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 
//		 String path = "C:\\Users\\CHETAN\\eclipse-workspace\\23AprSeleniumBasics\\ScreenShot\\"+filename+".png";
	
		 String path = System.getProperty("user.dir")+"\\ScreenShot\\"+filename+".png";
		 
		File destination = new File(path);
		
		FileHandler.copy(source, destination);
		
		return path;
		
	}
	
	
	
}
