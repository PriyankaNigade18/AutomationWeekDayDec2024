package com.WebElementHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandling {
  @Test
  public void testAlert() throws InterruptedException 
  {
	  //create  driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  
	  //username
	  driver.findElement(By.id("login1")).sendKeys("Priyanka");
	  //click on signin
	  driver.findElement(By.name("proceed")).click();
	  
	  Thread.sleep(2000);
	  //UnhandledAlertException: unexpected alert open: {Alert text : Please enter your password}
	  //alert will open
	  
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert text is: "+alt1.getText());
	 //click on ok
	  alt1.accept();
	  
	  //password
	 driver.findElement(By.id("password")).sendKeys("test123");
	  
	    
  }
  
  
  @Test
  public void alertTypesHandling() throws InterruptedException
  {
	  
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	  WebElement resultEle=driver.findElement(By.id("result"));
	  
	  //alert1
	  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  Thread.sleep(2000);
	  
	  //alert will open
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert1 text is: "+alt1.getText());
	  //ok
	  alt1.accept();
	  System.out.println("Alert1 Result is: "+resultEle.getText());
	  
	  
	  //alert2
	  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	  
	  //alert will open
	  Thread.sleep(2000);
	  
	  Alert alt2=driver.switchTo().alert();
	  System.out.println("Alert2 text is: "+alt2.getText());
	  //cancel
	  alt2.dismiss();
	  
	  System.out.println("Alert2 Result is: "+resultEle.getText());
	  
	  
	  //alert3-Assignment
	  driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	  
	  //alert will open
	  Thread.sleep(2000);
	  
	  Alert alt3=driver.switchTo().alert();
	  
	  System.out.println("Alert3 text is: "+alt3.getText());
	  
	  
	  alt3.sendKeys("Hello All!");
	  
	  alt3.accept();
	  System.out.println("Alert3 result is: "+resultEle.getText());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  
  
  
  
  
}
