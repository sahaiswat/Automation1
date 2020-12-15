package com.application.testcases;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.application.pages.HomePage;
import com.application.pages.TestBase;

public class TestCases extends TestBase {
	
	public WebDriver driver;
	public HomePage homepage;
	
	
	public TestCases()
	{
		super();
	}
	
	@BeforeMethod
	public void Setup()
	{
		startApplication();
		homepage=new HomePage();
		
	}
	
	@Test

	public void TC1_ShowInfoMessageForAge()
	{	  
		homepage.ClickonCalc();
		 String actualCurrentAgeMessage = homepage.VerifyInfomessage();

	        String expectedTitlePage = "This calculator has an age limit of 18 to 64 years old";
	        Assert.assertEquals(actualCurrentAgeMessage, expectedTitlePage);		
		    
	}
	
	@Test
	
	public  void VerifyAcceptanceCriteria1(String ageval, String salary) {
		
		startApplication();
		homepage=new HomePage();
        homepage.ClickonCalc();
        boolean  balance= homepage.VerifyProjectedBalance("30", "82000");
        
       Assert.assertTrue(balance, "KiwiSaver balance is estimated to be:$436,365" );
	}
	
	@AfterClass
	public void CloseApplication()
	{
		closeApplication();
	}
	
}

