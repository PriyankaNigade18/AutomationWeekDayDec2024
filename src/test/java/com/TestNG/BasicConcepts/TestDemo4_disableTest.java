package com.TestNG.BasicConcepts;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestDemo4_disableTest 
{
  @Test(priority=1)
  public void chromeTest()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.quit();
  }
  
  @Test(priority=2)
  public void edgeTest()
  {
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.facebook.com");
	  driver.quit();
  }
  
  //disable test from current execution Way1: enabled=false
  @Test(priority=3,enabled=false)
  public void firefoxTest()
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.amazon.com");
  }
  
  //way2: using xml file we can exclude method
  @Test(priority=4)
  public void chromeIncongintoTest()
  {
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--incognito");
	  WebDriver driver=new ChromeDriver(options);
	  driver.get("https://automationplayground.com/crm/");
	  driver.quit();
  }
}
