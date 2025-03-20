package com.TestNG.BasicConcepts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo7_Grouping
{
  @Test(priority=1,groups = "SmokeTest")
  public void registerTest()
  {
	  System.out.println("This is register test");
  }
  
  @Test(priority=2,groups = "SmokeTest")
  public void loginTest()
  {
	  AssertJUnit.assertEquals(false,true);
	  System.out.println("This is login test");
	  
  }
  
  @Test(priority=3,groups = "RegressionTest",dependsOnGroups = "SmokeTest")
  public void searchProductTest()
  {
	  System.out.println("This is searchProduct test");
  }
  
  @Test(priority=4,groups = "RegressionTest")
  public void addToCartTest()
  {
	  System.out.println("This is add to cart test");
  }
  
  @Test(priority=5,groups = "SanityTest")
  public void paymentTest()
  {
	  System.out.println("This is payment test");
  }
  
  @Test(priority=6,groups = "SanityTest")
  public void logoutTest()
  {
	  System.out.println("This is logout test");
  }
}
