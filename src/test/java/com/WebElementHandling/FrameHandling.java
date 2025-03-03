package com.WebElementHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameHandling {
  @Test
  public void testFrame() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://ui.vision/demo/webtest/frames/");
	  
	  //frame with indexing
	  //driver.switchTo().frame(0);
	  
	  //frame with webelement
	  WebElement frameEle=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	  
	  driver.switchTo().frame(frameEle);
	  //frame1 ele
	  driver.findElement(By.name("mytext1")).sendKeys("Frame1");
	  //frame1--->frame2:NoSuchFrameException: no such frame
	  //switch to main window/document/parentframe
	  /*
	   * Selects either the first frame on the page, or 
	   * the main document when a page contains iframes. 
	   */
	  driver.switchTo().defaultContent();
	  
	  //frame 2
	  driver.switchTo().frame(1);
	  
	  driver.findElement(By.name("mytext2")).sendKeys("Frame2");
	  
	  driver.switchTo().defaultContent();
	  
	  //frame2--->frame3
	  driver.switchTo().frame(2);
	  WebElement frameEle3=driver.findElement(By.name("mytext3"));
	  frameEle3.sendKeys("Frame3 text");
	  
	  //switch to inner frame Nested Frame
	  driver.switchTo().frame(0);
	  
	  //frame3--->automate form
	  driver.findElement(By.id("i9")).click();
	  
	  //come back to parent(frame3)-->clear text and add new text
	  
	  driver.switchTo().parentFrame();//frame 3
	  
	  frameEle3.clear();
	  frameEle3.sendKeys("Hello All!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
