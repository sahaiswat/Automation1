package com.application.testcases;
	
	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


	public class Test {
		

		
		
		public static void startApplication()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssinha\\Desktop\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.westpac.co.nz/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement ele=driver.findElement(By.id("ubermenu-section-link-kiwisaver-ps"));
			WebElement ele1=driver.findElement(By.id("ubermenu-item-cta-kiwisaver-calculators-ps"));
			Actions action= new Actions(driver);
			action.moveToElement(ele).click(ele1).build().perform();
			driver.findElement(By.xpath("//a[@class='btn'][contains(.,'Click here to get started."));
			
			
			
			
			
		}
		
		


}
