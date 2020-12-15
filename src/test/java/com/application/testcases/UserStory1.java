package com.application.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserStory1 {
	
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
		WebElement element = driver.findElement(By.xpath("//a[contains(.,'Click here to get started.')]"));
        element.click();
        
        
        Thread.sleep(5000);
		
		  driver.switchTo().frame(0);
		  
		  WebElement icon =  driver.findElement(By.className("icon"));
		  System.out.println(icon.isDisplayed());
		  System.out.println(icon.isEnabled());
				 
		   icon.click();
				  
		WebElement  msg=driver.findElement(By.cssSelector(".field-message.message-info.ng-binding"));
			System.out.println(msg.getText());
					
	}
	
}