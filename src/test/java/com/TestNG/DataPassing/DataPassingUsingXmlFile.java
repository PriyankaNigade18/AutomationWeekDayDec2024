package com.TestNG.DataPassing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class DataPassingUsingXmlFile 
{
  @Test
  @Parameters({"user","password"})
  public void dataReading(String un,String psw)
  {
	  System.out.println("UserName is: "+un);
	  System.out.println("Password is: "+psw);
  }
}
