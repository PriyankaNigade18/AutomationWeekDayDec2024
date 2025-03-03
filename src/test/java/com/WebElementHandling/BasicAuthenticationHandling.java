package com.WebElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicAuthenticationHandling {
  @Test
  public void testBasicAuth() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	  
	  String text=driver.findElement(By.xpath("//div[@id='content']")).getText();
	  System.out.println(text);
  }
}
