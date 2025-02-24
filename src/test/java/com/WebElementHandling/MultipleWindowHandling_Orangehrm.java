package com.WebElementHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowHandling_Orangehrm {
  @Test
  public void testMultipleWindow() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  //parent page
	  
	  String parentId=driver.getWindowHandle();
	  System.out.println(parentId);
	  
	  
	  driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	  //child page
	  Thread.sleep(3000);
	  
//	  String childId=driver.getWindowHandle();	
//	  System.out.println(childId);
	  
	  Set<String> allWindows=driver.getWindowHandles();
	  System.out.println(allWindows);
	  
	  //switch to child window
	  for(String childId:allWindows)
	  {
		  if(!childId.equals(parentId))//parentId and childid not equal then switch
		  {
			  driver.switchTo().window(childId);
			 System.out.println(driver.getWindowHandle());
			  //email element
			  driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
			  
		  }
	  }
	  
	  //parent windows
	  driver.switchTo().window(parentId);
	  driver.findElement(By.name("username")).sendKeys("Priyanka");

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
