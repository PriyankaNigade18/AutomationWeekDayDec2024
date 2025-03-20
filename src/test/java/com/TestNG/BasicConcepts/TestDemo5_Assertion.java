package com.TestNG.BasicConcepts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestDemo5_Assertion {
  @Test
  public void testHardAssert()
  {
	  String act="Selenium WebDriver  is WebUI library";
	  String exp="1223";
	  
	  /*
	   * For Every assertion fail selenium throws Error
	   * java.lang.AssertionError
	   
	  Assert.assertEquals(act,exp,"Test fail:Strings are not equal");
	  System.out.println("Test Pass:Strings are equal");
	  
	  //actual string should have expected word
	  
	  Assert.assertTrue(act.contains(exp),"TestFail: String does not contains expected value");
	  System.out.println("Test Pass: String contains expected value");
	  */
	  //actual string should not contains expected value(-ve)
	  Assert.assertFalse(act.contains(exp),"Test Fail: As String have expected value");
	  System.out.println("Test Pass: As String does not have expected value");
	  
	  
	  
	  
	  
	  /*
	  if(act.equals(exp))
	  {
		  System.out.println("Strings are equal");
	  }else
	  {
		  System.out.println("Strings are not equal");
	  }*/
  }
  
  @Test
  public void testSoftAssertion()
  {
	int a=100,b=500;
	
	SoftAssert sf=new SoftAssert();
	sf.assertEquals(a,b,"Test Fail: As Numbers are not equal!");
	System.out.println("Test Pass: As Numbers are equal!");
	
	sf.assertAll();
	  
	  
	  
	  
	  
	  
  }
  
}
