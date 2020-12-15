package com.application.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class KiwiSaverCalc extends TestBase {
	
	KiwiSaverCalc kiwisavercal;
	
	
	@FindBy(xpath = "//div[contains(@label,'Current age')]//i" )
	WebElement ageicon;
	
	@FindBy(xpath = "//div[contains(@class,'field-message')]")
	WebElement ageiconmessage;
	
	@FindBy(xpath = "//div[contains(@label,'Current age')]//input")
	WebElement age;
	
	@FindBy(xpath = "//div[@class='well-value ng-binding'][contains(.,'Select')]")
	WebElement empstatus;
	
	@FindBy(xpath = "//div[contains(@label,'Current KiwiSaver balance')]//input")
	WebElement balance;
	
	@FindBy(xpath = "//div[contains(@label,'Voluntary contributions')]//input")
	WebElement contributions;
	
	@FindBy(xpath = "//span[@class='ng-scope'][contains(.,'Defensive')]")
	WebElement riskprofileDefensive;
	
	@FindBy(xpath = "//span[@class='ng-scope'][contains(.,'Conservative')]")
	WebElement riskprofileConservative;
	
	@FindBy(xpath = "//span[@class='ng-scope'][contains(.,'Balanced')]")
	WebElement riskprofileBalanced;
	
	@FindBy(xpath = "//span[@class='ng-scope'][contains(.,'Growth')]")
	WebElement riskprofileGrowth;
	
	@FindBy(xpath = "//div[contains(@label,'Savings goal at retirement')]//input")
	WebElement goal;
	
	
	public KiwiSaverCalc ()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Infomessage()
	{
		ageiconmessage.click();
		
				
	}
	
	public void Calculate(String currentage, String status, String kiwisaverbalance, String Volcontri, String savings )
	{
		age.sendKeys(currentage);
		Select select=new Select(empstatus);
		select.selectByVisibleText(status);
		balance.sendKeys(kiwisaverbalance);
		contributions.sendKeys(Volcontri);
		goal.sendKeys(savings);
		
	}
	
	
}
