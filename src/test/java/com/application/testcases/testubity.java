package com.application.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class testubity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssinha\\Desktop\\driver\\chromedriver.exe");
			 WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://54.253.214.197:8081/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("username")).sendKeys("ubiquity");
			driver.findElement(By.id("password")).sendKeys("P@ss123#UbiQuity");
			
		driver.findElement(By.xpath("//span[contains(.,'Login')]")).click();
		Thread.sleep(5000);
	    WebElement ele= driver.findElement(By.xpath("//ul[@id='fields']//h1//strong//span//span[contains(normalize-space(),'Welcome to the Ubiquity Tester admin page.')]"));
	    String txt= ele.getText();
	     Assert.assertEquals(txt, "                    Welcome to the Ubiquity Tester admin page.");
	
		
	WebElement	ele1=  driver.findElement(By.xpath("//span[contains(normalize-space(),'Edit Profile')]"));
	ele1.click();
//	JavascriptExecutor jse2 = (JavascriptExecutor)driver;
//	jse2.executeScript("arguments[0].click();", ele1);
//		Actions action= new Actions(driver);
//		action.moveToElement(ele1).click().build().perform();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     
	
	}

}
