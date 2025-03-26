package com.SwagLab.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SwagLab.Base.BaseClass;

public class T1_LoginTest extends BaseClass
{
  @Test(priority=1)
  public void verifyUrl() 
  {
	  String actUrl=lp.getAppUrl();
	 // String expUrl="https://www.saucedemo.com/";
	  Assert.assertEquals(actUrl,prop.getData("expUrl"));
	 // Assert.assertTrue(actUrl.contains("https"));
	  System.out.println("Url matched...."+actUrl);
  }
  
  @Test(priority=2)
  public void validateLogin() 
  {
//	  lp.setUsername("standard_user");
//	  lp.setPassword("secret_sauce");
//	  lp.clickOnLoginButton();
	  
	  lp.doLogin(prop.getData("un"),prop.getData("psw"));
	  Assert.assertTrue(lp.getAppUrl().contains("inventory"),"Login Fail");
	  System.out.println("Login Completed!.....");
	  
	  
  }
}
