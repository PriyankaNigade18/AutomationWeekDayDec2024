package com.TestNG.PageObjectModelUsingPageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HrmLoginPageTestCase extends BaseClass 
{
  @Test(priority=1)
  public void validateUrl()
  {
	  String actUrl=lp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("login"));
	  System.out.println("Url matched...."+actUrl);
	  
  }
  
  @Test(priority=2)
  public void validateTitle()
  {
	  String actTitle=lp.getAppTitle();
	  Assert.assertEquals(actTitle,"OrangeHRM");
	  System.out.println("Title matched...."+actTitle);
  }
  
  
  @Test(priority=3)
  public void validateLogin()
  {
	lp.setUserName("Admin"); 
	lp.setPassword("admin123");
	lp.clickOnLoginButton();
	
	//or
	
	//lp.doLogin("Admin","admin");
	
	Assert.assertTrue(lp.getAppUrl().contains("dashboard"),"Login Fail....");
	System.out.println("Login Successfull....");
	
  }
}
