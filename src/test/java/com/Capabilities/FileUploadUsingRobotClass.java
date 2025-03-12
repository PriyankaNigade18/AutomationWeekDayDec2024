package com.Capabilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FileUploadUsingRobotClass {
  @Test
  public void testFileUpload() throws AWTException
  {
	  
	  
//type=file then only upload is possible
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  //choose a file
	  WebElement chooseFile=driver.findElement(By.id("file-upload"));
	  
	  //actions class
	  Actions act=new Actions(driver);
	  act.moveToElement(chooseFile).click().build().perform();
	  
	  //Robot class
	  Robot rb=new Robot();
	  rb.delay(4000);
	  
	  
	  //clipboard ctrl+c
	  StringSelection sc=new StringSelection("C:\\Users\\Ganes\\OneDrive\\Desktop\\Youtube.txt");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc,null);
	  	  
	    
	  //ctrl+v press
	  rb.keyPress(KeyEvent.VK_CONTROL);
	  rb.keyPress(KeyEvent.VK_V);
	  
	  
	  //Ctrl+V release
	  rb.keyRelease(KeyEvent.VK_CONTROL);
	  rb.keyRelease(KeyEvent.VK_V);
	  
	  //Click Enter-->open
	  rb.keyPress(KeyEvent.VK_ENTER);
	  
	  	  //upload
	  driver.findElement(By.id("file-submit")).click();
	  
	  //get the text
	  //System.out.println("Text is: "+driver.findElement(By.tagName("h3")).getText());
	 
	  
  }
}
