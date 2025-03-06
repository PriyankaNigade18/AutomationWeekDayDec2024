package com.specialScenario;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinkTest
{
	/*
	 * Automation
================
1.there should be href attribute available for link
if href is empty or null you cant test that link is valid or broken
2.those links are having href attribute we are passing that request to server
3.get the response code/status code and compare
4.if status code>=400 then it is broken
	 */
  @Test
  public void testBrokenLink() 
  {
	  
	  //create  driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  //get the all link for page
	  List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	  System.out.println("Total links on the page are: "+allLinks.size());
	  
	  int count=0;
	  for(WebElement i:allLinks)
	  {
		  
		  String hrefValue=i.getDomAttribute("href");
		  /*
		   * compare link is empty or null if yes then skip
		   */
		  if(hrefValue==null ||hrefValue.isEmpty())
		  {
			  System.out.println("Empty or null href link we cant test!");
			  //skip the link
			  continue;
			  
		  }
		  
		  /*
		   * link is having valid href attribute
		   * send that as a request to server
		   * String--->URL 
		   */
		 try {
		  //send the request--URL class java
		  URL url=new URL(hrefValue);
		  //to establish connection to the server open connection
		  HttpURLConnection httpurl=(HttpURLConnection) url.openConnection();
		  //lets connect to server--.get the status code
		  httpurl.connect();
		 int statuscode= httpurl.getResponseCode();
		 if(statuscode>=400)
		 {
			 System.out.println(hrefValue+"===== Broken link======");
			count++;
		 }else
		 {
			 System.out.println(hrefValue+"===== Valid link======");

		 }
		 
		  
		 }catch(Exception e)
		 {
			 
		 }
		  
		 
		  
		  
		  
		  
		  
		  
		  
		  
	  }
	  
	  System.out.println("Total Broken links are:"+count);
	  
	  
	  
	  
	  
  }
}
