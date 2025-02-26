package com.WebElementHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomateNewTab_Window {
  @Test
  public void testNewTab_Window()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  
	  //new tab facebook
	  WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
	  newTab.get("https://www.facebook.com");
	  
	  //new Window by that newTab instance
	 WebDriver newWin= newTab.switchTo().newWindow(WindowType.WINDOW);
	  newWin.get("https://www.amazon.in");
	  
	  
	  
	  
	  
  }
}
