package com.Capabilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadUsingSendKeys {
  @Test
  public void testFileUpload()
  {
	  //type=file then only upload is possible
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  //choose a file
	  driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Ganes\\OneDrive\\Desktop\\Automation TOC-6 Full days.xlsx");
	  
	  
	  //upload
	  driver.findElement(By.id("file-submit")).click();
	  
	  //get the text
	  System.out.println("Text is: "+driver.findElement(By.tagName("h3")).getText());
	  
	  
  }
}
