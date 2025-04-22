package com.TestListners;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CRMAppTestForListener extends BaseClass
{
  @Test(priority=1)
  public void validateSignInLink() 
  {
	  driver.findElement(By.linkText("Sign In")).click();
  }
  
  @Test(priority=2)
  public void validateLogin() 
  {
	  driver.findElement(By.id("email-id####")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test123");
	  driver.findElement(By.id("submit-id")).click();
  }
  
  
  @Test(priority=3)
  public void validateSignOutLink()
  {
	  driver.findElement(By.linkText("Sign Out")).click();
  }
}
