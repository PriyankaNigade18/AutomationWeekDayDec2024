package com.TestNG.Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationBasics 
{
  @Test(priority=1)
  public void registerTest()
  {
	  System.out.println("Test Case 1 is Register");
  }
  
  @Test(priority=2)
  public void loginTest()
  {
	  System.out.println("Test Case 2 is login");
  }
  
  @Test(priority=3)
  public void logoutTest()
  {
	  System.out.println("Test Case 3 is logout");
  }
  
  //rule
  @BeforeMethod
  public void bmethod()
  {
	  System.out.println("BeforeMethod executes before every testcase!");
  }
  
  @AfterMethod
  public void amethod()
  {
	  System.out.println("AfterMethod executes after every testcase!");
  }
  
  @BeforeClass
  public void bclass()
  {
	  System.out.println("BeforeClass executes only before first testcase!");
  }
  
  @AfterClass
  public void aclass()
  {
	  System.out.println("Afterclass executes after last testcase!");
  }
}
