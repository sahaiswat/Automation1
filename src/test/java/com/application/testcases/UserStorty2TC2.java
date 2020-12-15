package com.application.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserStorty2TC2 {
	
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
					
					actions.moveToElement(element).click().sendKeys("45").perform();
					
					//Employment status = Self Employed

					element = driver.findElement(By.xpath("//div[@help-id='EmploymentStatus']//i[@class='ir dropdown-arrow']"));
					Thread.sleep(2000);
					actions.moveToElement(element).click().perform();
					driver.findElement(By.xpath("//span[@class='ng-scope' and text()='Self-employed']")).click();
					
					//Kiwisaver balance					
					element = driver.findElement(By.xpath("//div[@help-id ='KiwiSaverBalance']//div[@class='control-well']"));
					actions.moveToElement(element).click().sendKeys("100000").perform();
					
				
					
					// Voluntary contribution
					
					element= driver.findElement(By.xpath("//div[@help-id='VoluntaryContributions']//div[@class='control-cell']"));
					actions.moveToElement(element).click().perform();
					driver.findElement(By.xpath("//input[@class='ng-pristine ng-valid']")).sendKeys("90");

					driver.findElement(By.xpath("//div[@class='dropdown']//li[@value='fortnight']")).click();
					
			   	  // Risk profile

					driver.findElement(By.xpath("//input[@id='radio-option-016']")).click();
					
					//Saving goal 
					element = driver.findElement(By.xpath("//div[@help-id='SavingsGoal']//input[@class='ng-pristine ng-valid']"));
					actions.moveToElement(element).click().sendKeys("290000").perform();
					
					

					//Complete the form to see your KiwiSaver retirement projections.

					
					driver.findElement(By.xpath("//button[@class='btn btn-regular btn-results-reveal btn-has-chevron']")).click();

					
					//Display your KiwiSaver balance is estimated to be:

					
					String KSBal = driver.findElement(By.xpath("//span [@class='result-value result-currency ng-binding']")).getText();
					
					System.out.println("KiwiSaver balance is estimated to be:" +KSBal);
						
	        
		
		}

}
