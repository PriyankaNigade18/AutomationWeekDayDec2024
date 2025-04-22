package com.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridFirstTest {
  @Test
  public void testRemoteExecution() throws MalformedURLException, URISyntaxException, InterruptedException 
  {
	  //which browser: i wanted to start session on remote side chrome
	  ChromeOptions cap=new ChromeOptions();
	  
	  //Server address:Grid
	  URL url=new URI("http://localhost:4444/").toURL();
	  
	  WebDriver driver=new RemoteWebDriver(url,cap);
	  
	  System.out.println("Remote session started......");
	  
	  
	  Thread.sleep(10000);
	  
	  driver.get("https://www.google.com");
	  
	  Thread.sleep(10000);
	  
	  System.out.println("Application Title is: "+ driver.getTitle());
	  
	  
	  
	  driver.quit();
	  
	  System.out.println("Remote session ended.......");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
