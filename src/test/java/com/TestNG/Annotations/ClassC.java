package com.TestNG.Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassC {
  @Test
  public void testCase1()
  {
	  System.out.println("ClassC.....testcase1");
  }
  
  @Test
  public void testCase2()
  {
	  System.out.println("ClassC.....testcase2");
  }
  
  @BeforeTest
  public void btest()
  {
	  System.out.println("BeforeTest executes before first class");
  }
  @AfterSuite
  public void asuite()
  {
	  System.out.println("AfterSuite executes only after last test!");
  }
}
