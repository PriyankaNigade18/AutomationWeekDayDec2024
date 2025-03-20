package com.TestNG.BasicConcepts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo2_invocationCount
{
  @Test(priority=1)
  public void registerTest()
  {
	  System.out.println("User Register here");
  }
  
  
  @Test(priority=2,invocationCount=3)
  public void loginTest()
  {
	  
	  System.out.println("User login here");
	  
	
  }
}
