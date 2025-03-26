package com.TestNG.DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenUsingArray 
{
	//test Data
	@DataProvider(name="loginData")
	public Object[][] testData()
	{
		Object data[][]= {{"Admin","admin123"},{"Pooja","test123"},{"Admin","admin123"},{"Sarang","test123"}};
		return data;
	}
	
	
	
  @Test(dataProvider="loginData")
  public void testLogin(String un,String psw)
  {
	  System.out.println("UserName is: "+un+" : "+"password is: "+psw);
  }
}
