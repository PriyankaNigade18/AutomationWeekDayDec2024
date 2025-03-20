package com.TestNG.BasicConcepts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo1_priority_description 
{
  @Test(priority=1,description="This is register test")
  public void registerTest()
  {
	  System.out.println("User Register first!");
  }
  
  
  @Test(priority=2,description="This is login test")
  public void loginTest()
  {
	  System.out.println("User login here!");
  }
  
  
  @Test(priority=3)
  public void searchProductTest()
  {
	  System.out.println("User search Product here!");
  }
  
  
  @Test(priority=4)
  public void addToCartTest()
  {
	  System.out.println("User will add product to cart!");
  }
}
