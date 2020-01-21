package CICD_Package;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.sikuli.basics.Settings;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

@Test
public class CICD_Story1 {
	
	public void Launch() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Sid_Folder\\Selenium\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--headless");
	WebDriver driver=new ChromeDriver(options);
	//Launch Browsers
	    String expectedtitle="Google";
		driver.get("http://www.google.com");
		String actualtitle=driver.getTitle();
		System.out.println(driver.getTitle());
		//try {
		Assert.assertEquals(actualtitle, expectedtitle);
		//System.out.println("Test Passed");
		//} catch (Throwable e) {
		//	System.out.println("Test Failed");
		
//		}

    //Browser close and Workbook close	
 		driver.close();
	
  }
}
 
  








	