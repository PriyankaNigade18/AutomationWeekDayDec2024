package com.TestNG.Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ClassB {
	@Test
	  public void testCase1()
	  {
		  System.out.println("ClassB.....testcase1");
	  }
	  
	  @Test
	  public void testCase2()
	  {
		  System.out.println("ClassB.....testcase2");
	  }
	  
	  @AfterTest
	  public void atest()
	  {
		  System.out.println("AfterTest executes after last class");
	  }
	  
	  @BeforeSuite
	  public void bsuite()
	  {
		  System.out.println("BeforeSuite executes only before first test!");
	  }
}
