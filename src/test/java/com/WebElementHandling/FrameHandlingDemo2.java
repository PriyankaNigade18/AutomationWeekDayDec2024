package com.WebElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandlingDemo2 {
  @Test
  public void testFrame()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/nested_frames");
	  
	  //total frames from the page
	  int total=driver.findElements(By.tagName("frame")).size();
	  System.out.println("Total frames are: "+total);
	  
	  
	  
	  
	  //top--->middle
	  driver.switchTo().frame(0).switchTo().frame("frame-middle");
	  
	  System.out.println("Text is: "+driver.findElement(By.id("content")).getText());
	  
	  
	  //top frame
	  driver.switchTo().defaultContent();
	  
	  //middle--->right 
	  driver.switchTo().frame(0).switchTo().frame("frame-right");
	  System.out.println("Text is:"+driver.findElement(By.xpath("//body[normalize-space()='RIGHT']")).getText());
	  
	  
	  
	  
	  
	  
  }
}
