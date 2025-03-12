package com.Capabilities;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CapabilitiesforBrowser {
  @Test
  public void testCapabilities()
  {
	  
	  ChromeDriver driver1=new ChromeDriver();
	  Capabilities cap=driver1.getCapabilities();
	  Map<String,Object> allCap=cap.asMap();
	  System.out.println(allCap);
	  
	  System.out.println("*******************************");
	  EdgeDriver driver2=new EdgeDriver();
	  Capabilities cap2=driver2.getCapabilities();
	  Map<String,Object> allCap2=cap2.asMap();
	  System.out.println(allCap2);
	  
	  System.out.println("*******************************");

	  FirefoxDriver driver3=new FirefoxDriver();
	  Capabilities cap3=driver3.getCapabilities();
	  Map<String,Object> allCap3=cap3.asMap();
	  System.out.println(allCap3);
	  
	  
	  
  }
}
