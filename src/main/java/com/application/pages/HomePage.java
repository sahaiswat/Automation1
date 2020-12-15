package com.application.pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;



public class HomePage extends TestBase{
	
	WebDriver driver;
	
	HomePage homepage;
	
	@FindBy(id = "ubermenu-section-link-kiwisaver-ps")
	 WebElement kiwisaver;
	
	@FindBy(id = "ubermenu-item-cta-kiwisaver-calculators-ps")
	 WebElement kiwisavercalc;
	
	@FindBy(xpath = "//a[contains(.,'Click here to get started.')]")
	WebElement clickstart;
	
	@FindBy(xpath = "//div[@help-id='CurrentAge']//div[@class='control-well']")
	WebElement current_age;

	@FindBy(className= ("icon"))
	WebElement icon;

	@FindBy(css= ".field-message.message-info.ng-binding")
	WebElement current_age_info;


	@FindBy(xpath = "//div[@help-id='CurrentAge']//div[@class='control-well']")
	WebElement age;
	
	
	@FindBy(xpath = "//div[@help-id='EmploymentStatus']//i[@class='ir dropdown-arrow']")
	WebElement estatus;
	
	@FindBy(xpath ="//div[@class='dropdown']//li[@value='employed']")
	WebElement estatus_employed;
	
	@FindBy(xpath="//span[@class='ng-scope' and text()='Self-employed']")
	WebElement estatus_selfemp;
	
	@FindBy(xpath= "//span[@class='ng-scope' and text()='Not employed']")
	WebElement estatus_notemployed;
	
	@FindBy(xpath= "//div[@help-id='AnnualIncome']//input[@class='ng-pristine ng-valid']")
	WebElement sal;
	
	@FindBy(xpath="//input[@id='radio-option-04F']")
	WebElement KiwiSaverContri;
	
	@FindBy(xpath="//div[@help-id ='KiwiSaverBalance']//div[@class='control-well']")
	WebElement KiwiSaverBal;
	
	@FindBy(xpath="//div[@help-id='VoluntaryContributions']//div[@class='control-cell']")
	WebElement contri;
	
	@FindBy(xpath="//div[@class='dropdown']//li[@value='fortnight']")
	WebElement frequency1;
	
	@FindBy(xpath="//div[@class='dropdown']//li[@value='year']")
	WebElement frequency2;
	
	@FindBy(xpath="//input[@id='radio-option-016']")
	WebElement riskprofile_conservative;
	
	@FindBy(xpath="//input[@id='radio-option-013']")
	WebElement riskprofile_defensive;
	
	@FindBy(xpath="//input[@id='radio-option-019']")
	WebElement riskprofile_balanced;
	
	@FindBy(xpath="//div[@help-id='SavingsGoal']//input[@class='ng-pristine ng-valid']")
	WebElement saving_goal;
	
	@FindBy(xpath="//button[@class='btn btn-regular btn-results-reveal btn-has-chevron']")
	WebElement button;
	
	@FindBy(xpath="//span [@class='result-value result-currency ng-binding']")
	WebElement result;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void ClickonCalc() 
	 {
		Actions action=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		action.moveToElement(kiwisaver).click(kiwisavercalc).build().perform();		
		clickstart.click();
		 
	 }
	
	public String VerifyInfomessage()
	
	{
		driver.switchTo().frame(0);
		   icon.click();
		   return current_age_info.getText();
		
	}
	
	
	public boolean VerifyProjectedBalance(String ageval, String salary)
	{
	    driver.switchTo().frame(0);
	    age.sendKeys(ageval);
	    estatus_employed.click();
	    sal.sendKeys(salary);
	    KiwiSaverContri.click();
	    riskprofile_defensive.click();
	    button.click();
	    System.out.println("Result is" + result);
	    return result.isDisplayed();
	}


	
	
	
}
