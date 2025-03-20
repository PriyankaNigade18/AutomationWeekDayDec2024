package com.TestNG.BasicConcepts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo6_DependsOnMethods 
{
  @Test(priority=1)
  public void registerTest()
  {
	  System.out.println("User register here!");
	  AssertJUnit.assertEquals(true,true);//pass
  }
  
  @Test(priority=2,dependsOnMethods = "registerTest")
  public void loginTest()
  {
	  System.out.println("User login here!");
	  AssertJUnit.assertEquals(true,false);//fail
  }
  
  
  @Test(priority=3,dependsOnMethods = "loginTest")
  public void logoutTest()
  {
	  System.out.println("User logout here!");
  }
}


