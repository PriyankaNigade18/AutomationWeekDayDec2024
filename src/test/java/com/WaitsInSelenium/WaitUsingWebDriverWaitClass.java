package com.WaitsInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitUsingWebDriverWaitClass {
  @Test
  public void testExplicitWait()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  //By locators
	  By email=By.id("input-email");
	  By password=By.name("password");
	  By loginBtn=By.xpath("//input[@value='Login']");
	  
	  /*
	   * TimeoutException: Expected condition failed: 
	   * waiting for presence of element located by: 
	   * By.id: input-email#### (tried for 5 second(s) 
	   * with 500 milliseconds interval)
	   * interval time =Polling time
	   * Selenium default polling timeout: 500ms= 0.5sec
	   */
	  
	  //explicit wait
	  WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement emailEle= wait1.until(ExpectedConditions.presenceOfElementLocated(email));
	  
	  emailEle.sendKeys("test@gmail.com");
	  
	  
	  WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(5));
	  wait2.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("test123");
	  
	  
	  WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(5));
	  wait3.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
