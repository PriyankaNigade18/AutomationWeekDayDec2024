package com.SeleniumGrid;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class CrossBrowserTestOnGrid 
{
	
	WebDriver driver;
	
  @Test
  @Parameters({"bname"})
  public void testCrossBrowser(String bname) throws MalformedURLException, URISyntaxException, InterruptedException
  {
	  URL url=new URI("http://localhost:4444/").toURL();
	  
	  if(bname.equals("chrome"))
	  {
		  ChromeOptions cap=new ChromeOptions();
		  driver=new RemoteWebDriver(url,cap);
		  
	  }else if(bname.equals("firefox"))
	  {
		  
		 FirefoxOptions cap=new FirefoxOptions();
		  driver=new RemoteWebDriver(url,cap);
		  
		  
	  }else if(bname.equals("edge"))
	  {
		  
		  EdgeOptions cap=new EdgeOptions();
		  driver=new RemoteWebDriver(url,cap);
	  }
		  
	  System.out.println("Remote connection establish....Session started!");
	  
	  
	  Thread.sleep(10000);
	  
	  driver.get("https://automationplayground.com/crm/");
	  
	  Thread.sleep(8000);
	  
	  driver.findElement(By.linkText("Sign In")).click();
	  
	  Thread.sleep(5000);
	  
	  System.out.println("Url is: "+driver.getCurrentUrl());
	  
	  //quit browser
	  driver.quit();
	  
	  System.out.println("Remote connection is closed....Session stoped!");

	  
	  
	  
	  
	  
	  
  }
}
