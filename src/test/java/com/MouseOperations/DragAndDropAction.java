package com.MouseOperations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropAction {
  @Test
  public void testDragAndDrop() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://jqueryui.com/droppable/#default");
	  
	  //driver.manage().window().maximize();
	  
	  //frame
	  driver.switchTo().frame(0);
	  
	  //src
	  WebElement src=driver.findElement(By.id("draggable"));
	  
	  //dest
	  WebElement dest=driver.findElement(By.id("droppable"));
	  
	  //Thread.sleep(1000);
	  //action
	  Actions act=new Actions(driver);
	  //older
	  //act.clickAndHold(src).moveToElement(dest).release().build().perform();
	  
	  //latest
	  try {
	  act.dragAndDrop(src,dest).perform();
	  }catch(StaleElementReferenceException s)
	  {
		  
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
