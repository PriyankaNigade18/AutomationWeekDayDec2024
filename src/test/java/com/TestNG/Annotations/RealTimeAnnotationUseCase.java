package com.TestNG.Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class RealTimeAnnotationUseCase extends BaseClass
{
//	 WebDriver driver;
//	
//	@BeforeClass
//	public void setUp()
//	{
//		driver=new ChromeDriver();
//		driver.get("https://automationplayground.com/crm/");
//	}
	
  @Test(priority=1)
  public void validateSignIn()
  {
	 	  //signIn
	  System.out.println("Test Case1....Executing");
	  WebElement link=driver.findElement(By.linkText("Sign In"));
	  if(link.isDisplayed() && link.isEnabled())
	  {
		  link.click();
	  }
	  
	  
  }
  
  @Test(priority=2)
  public void validateLogin()
  {
	  System.out.println("Test Case2....Executing");
	//login 
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  
	  driver.findElement(By.id("password")).sendKeys("test123");
	  
	  driver.findElement(By.id("submit-id")).click();
  }
  
  @Test(priority=3)
  public void validateLogout()
  {
	  System.out.println("Test Case3....Executing");
	//logout
	  driver.findElement(By.linkText("Sign Out")).click();
  }
  
  
//  @BeforeMethod
//  public void getUrl()
//  {
//	  System.out.println("Url is: "+driver.getCurrentUrl());
//  }
//  @AfterMethod
//  public void getAppTitle()
//  {
//	  System.out.println("Title is: "+driver.getTitle());
//  }
//  
//  @AfterClass
//  public void tearDown()
//  {
//	  //close the session
//	  driver.quit();
//  }
}
