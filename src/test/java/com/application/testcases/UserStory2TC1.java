package com.application.testcases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.WebDriverWait;



public class UserStory2TC1 {
	
	static WebDriverWait wait;
	

	public static void main(String[] args) throws InterruptedException {
		
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssinha\\Desktop\\driver\\chromedriver.exe");
			 WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.westpac.co.nz/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement ele=driver.findElement(By.id("ubermenu-section-link-kiwisaver-ps"));
			WebElement ele1=driver.findElement(By.id("ubermenu-item-cta-kiwisaver-calculators-ps"));
			Actions action= new Actions(driver);
			action.moveToElement(ele).click(ele1).build().perform();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement element1 = driver.findElement(By.xpath("//a[contains(.,'Click here to get started.')]"));
	        element1.click();
	        
	        
	        Thread.sleep(5000);
			
			  driver.switchTo().frame(0);
			  
			  Actions actions = new Actions(driver);
				 
				 //  When Current age = 30
				WebElement element = driver.findElement(By.xpath("//div[@help-id='CurrentAge']//div[@class='control-well']"));
					
					actions.moveToElement(element).click().sendKeys("30").perform();
					
					//Employment status = Employed

					 element = driver.findElement(By.xpath("//div[@help-id='EmploymentStatus']//i[@class='ir dropdown-arrow']"));
					actions.moveToElement(element).click().perform();
					driver.findElement(By.xpath("//div[@class='dropdown']//li[@value='employed']")).click();
					
					//Salary or wages per year (before tax)
					
					driver.findElement(By.xpath("//div[@help-id='AnnualIncome']//input[@class='ng-pristine ng-valid']")).sendKeys("82000");
					
					//KiwiSavar member contribution

					driver.findElement(By.xpath("//input[@id='radio-option-04F']")).click();
					
			   	  // Risk profile

					driver.findElement(By.xpath("//input[@id='radio-option-013']")).click();
					

					//Complete the form to see your KiwiSaver retirement projections.

					
					driver.findElement(By.xpath("//button[@class='btn btn-regular btn-results-reveal btn-has-chevron']")).click();

					
					//Display your KiwiSaver balance is estimated to be:

					
					String KSBal = driver.findElement(By.xpath("//span [@class='result-value result-currency ng-binding']")).getText();
					
					System.out.println("KiwiSaver balance is estimated to be:" +KSBal);
						
	        
		
		}
		
		

	}


