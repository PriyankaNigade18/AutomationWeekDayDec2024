package com.TestNG.Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{
	 WebDriver driver;
		
		@BeforeClass
		public void setUp()
		{
			driver=new ChromeDriver();
			driver.get("https://automationplayground.com/crm/");
		}
		
		@BeforeMethod
		  public void getUrl()
		  {
			  System.out.println("Url is: "+driver.getCurrentUrl());
		  }
		  @AfterMethod
		  public void getAppTitle()
		  {
			  System.out.println("Title is: "+driver.getTitle());
		  }
		  
		  @AfterClass
		  public void tearDown()
		  {
			  //close the session
			  driver.quit();
		  }

}
