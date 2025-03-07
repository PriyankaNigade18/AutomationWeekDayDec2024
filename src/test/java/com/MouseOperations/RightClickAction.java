package com.MouseOperations;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClickAction {
  @Test
  public void testRightClick()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  //ele
	  WebElement button=driver.findElement(By.xpath("//span[text()='right click me']"));
	  
	  
	  //action
	  
	  Actions act=new Actions(driver);
	  
	  act.contextClick(button).perform();
	  
	  //get the menu options in the console
	  List<WebElement> list=driver.findElements(By.xpath("(//ul)[3]//li//span"));
	  
	  WebElement ele=null;
	  for(WebElement i:list)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Delete"))
		  {
//			  i.click();
//			  break;
			  ele=i;
		  }
	  }
	  
	  ele.click();
	  
	  //alert will open
	  Alert alt=driver.switchTo().alert();
	  System.out.println("Alert text is: "+alt.getText());
	  
	  //ok
	  alt.accept();
	  
	  
  }
}
