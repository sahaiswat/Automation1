package com.application.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;




public class TestBase {
	 public static WebDriver driver;

	
	 @BeforeMethod
	public static void startApplication()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssinha\\Desktop\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.westpac.co.nz/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	 @AfterClass
	 public void closeApplication()
	{
	driver.quit();
	Reporter.log("Browser Session End",true);
	}
	 
	 @AfterMethod
		public void tearDownMethod(ITestResult result)

		{

}
}

