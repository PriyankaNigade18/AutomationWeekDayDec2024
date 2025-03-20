package com.TestNG.BasicConcepts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo3_timeout
{
  @Test(timeOut=5000)
  public void testCase1() throws InterruptedException
  {
	  System.out.println("test1 started....");
	  Thread.sleep(4000);
	  System.out.println("test1 ended....");
  }
  
  @Test(timeOut=5000)
  public void testCase2() throws InterruptedException
  {
	  System.out.println("test2 started....");
	  Thread.sleep(6000);
	  System.out.println("test2 ended....");
  }
}
