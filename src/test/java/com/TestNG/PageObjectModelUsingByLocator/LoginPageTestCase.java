package com.TestNG.PageObjectModelUsingByLocator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTestCase extends BaseClass
{
		
  @Test(priority=1)
  public void validateUrl()
  {
	  //LoginPage lp=new LoginPage(driver);
	 String actUrl=lp.getAppUrl();
	 Assert.assertTrue(actUrl.contains("live"));
	 System.out.println("Url Matched....."+actUrl);
	 
	  
  }
  
  @Test(priority=2)
  public void validateTitle() 
  {
	  //LoginPage lp=new LoginPage(driver);
	  String actTitle=lp.getAppTitle();
	  Assert.assertEquals(actTitle,"OrangeHRM");
	  System.out.println("Title matched...."+actTitle);
  }
  
  @Test(priority=3)
  public void validateLogin() throws InterruptedException 
  {
	  //LoginPage lp=new LoginPage(driver);
	  lp.setUserName("Admin");
	  lp.setPassword("admin123");
	  lp.clickOnLoginButton();
	  Thread.sleep(2000);
	  //navigate to dashboard
	  Assert.assertTrue(lp.getAppUrl().contains("dashboard"));
	  System.out.println("Login Successfull!");
  }
}
