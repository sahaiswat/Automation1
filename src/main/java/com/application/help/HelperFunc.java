package com.application.help;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperFunc  {
	
	private static HelperFunc instance  ; 
	
	public static HelperFunc getInstance () {
		if (instance == null) {
			instance  = new HelperFunc(); 
		}
		return instance;
	}
	 public static void webClickById(WebDriver browser, String val){
    	 WebElement webelement = browser.findElement(By.id(val));
    	 webelement.click();
    	 
     }
     
     public static void webClickXpath(WebDriver browser, String val){
    	 WebElement webelement = browser.findElement(By.xpath(val));
    	 webelement.click();
    	 
     }
     
     public static void webClickCssSelector(WebDriver browser, String val){
    	 WebElement webelement = browser.findElement(By.cssSelector(val));
    	 webelement.click();
    	 
     }
     
     public static void webSendKeysByCssSelector(WebDriver browser, String css, String input){
    	 WebElement webelement = browser.findElement(By.cssSelector(css));
    	 webelement.sendKeys(input);
    	 
     }
     
     public static void webSendKeysByXpath(WebDriver browser, String xpath, String input){
    	 WebElement webelement = browser.findElement(By.xpath(xpath));
    	 webelement.sendKeys(input);
    	 
     }
     
     public static void webSwitchWindow(WebDriver browser, String title){
    	 String currentWindow = browser.getWindowHandle(); 
    	 for(String winHandle : browser.getWindowHandles()){
    	    if (browser.switchTo().window(winHandle).getTitle().equals(title)) {
    	     System.out.println("111111111111111111111111111I am in a window now @@@@");
    	      break;
    	    } 
    	    else {
    	    	browser.switchTo().window(currentWindow);
    	    } 
    	 
    	 	}
    	 }
     
     public static void webMoveToActionByLinkText(WebDriver browser, String val) {
 		Actions action = new Actions(browser);
 		WebElement kiwisavereelement = browser.findElement(By.xpath(val));
 		action.moveToElement(kiwisavereelement).build().perform();
 	}
     
     public static void webMoveToActionById(WebDriver browser, String val) {
  		Actions action = new Actions(browser);
  		WebElement kiwisavereelement = browser.findElement(By.id(val));
//  		action.moveToElement(kiwisavereelement).contextClick().build().perform();
  		action.moveToElement(kiwisavereelement).clickAndHold().build().perform();
  	}
     
     public static void webMoveToActionByXpath(WebDriver browser, String xpath) {
   		Actions action = new Actions(browser);
   		WebElement kiwisavereelement = browser.findElement(By.xpath(xpath));
//   		action.moveToElement(kiwisavereelement).contextClick().build().perform();
//   		action.moveToElement(kiwisavereelement).clickAndHold().build().perform();
   		action.moveToElement(kiwisavereelement).build().perform();
   	}
     
     public static void webMoveToAndClickActionByXpath(WebDriver browser, String xpath) {
    		Actions action = new Actions(browser);
    		WebElement kiwisavereelement = browser.findElement(By.xpath(xpath));
    		action.moveToElement(kiwisavereelement).click().build().perform();
	}
     
     
     
     public static void webSwitchToIFrame(WebDriver browser, String val) {
    	 
     }
     
     public static String getTextWebElementByXpath(WebDriver browser, String val)
     {
    	 WebElement webelement = browser.findElement(By.xpath(val));
    	 return webelement.getText();
    	 
     }
     
     public static void webDriverWaitByXpath(WebDriver browser, String val)
     {
    	 WebDriverWait wait = new WebDriverWait(browser, 10);
    	 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(val)));
     }
     
     
     public void closeDriver(WebDriver driver) {
    	 driver.close();
     } 
     
     public static void isWebElementClickable(WebDriver browser, String element) {
    	WebDriverWait wait_iframe = new WebDriverWait(browser, 50000);
 	    wait_iframe.until(ExpectedConditions.elementToBeClickable((By.xpath(element))));
    	 
     }

}
