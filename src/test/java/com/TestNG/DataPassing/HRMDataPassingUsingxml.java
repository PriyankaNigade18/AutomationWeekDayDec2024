package com.TestNG.DataPassing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HRMDataPassingUsingxml 
{
	WebDriver driver;
  @Test
  @Parameters({"un","psw","bname"})
  public void loginTest(String un,String psw,String bname) 
  {
	  switch(bname)
	  {
	  case "chrome":driver=new ChromeDriver();break;
	  case "edge":driver=new EdgeDriver();break;
	  case "firefox": driver=new FirefoxDriver();break;
	  default: return;
	  
	  }
	  
	   
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  driver.findElement(By.name("username")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(psw);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  
	  
  }
}
