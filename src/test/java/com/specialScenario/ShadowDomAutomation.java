package com.specialScenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class ShadowDomAutomation {
  @Test
  public void testShadowDom() throws InterruptedException 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  
	  //scroll page
	  WebElement scrollele=driver.findElement(By.xpath("(//h2)[15]"));
	  Utility.scrollUpToElement(driver,scrollele);
	  
	  //document--->shadow host---->shadow root--->shadow element
	  
	  //mobiles(simple element)--hist1--->root1
	  
	  WebElement host1=driver.findElement(By.cssSelector("div#shadow_host"));
	  SearchContext root1=host1.getShadowRoot();
	  String text1=root1.findElement(By.cssSelector("span#shadow_content")).getText();
	  System.out.println("Text1 of Shadow element1: "+text1);
	  
	  //laptops(nested element)--->root1-->host2--->root2-->element
	  WebElement host2=root1.findElement(By.cssSelector("div#nested_shadow_host"));
	  SearchContext root2=host2.getShadowRoot();
	  String text2=root2.findElement(By.cssSelector("div#nested_shadow_content")).getText();
	  System.out.println("Text2 of nested shadow element is: "+text2);
	  
	  //root1-->input box
	  root1.findElement(By.cssSelector("input[type='text']")).sendKeys("Hello All");
	  
	  //root1-->checkbox
	  root1.findElement(By.cssSelector("input[type='checkbox']")).click();
	  
	  //root1-->blog link 
	  //JavascriptException: javascript error: Cannot read properties of undefined (reading 'defaultView')
	 // root1.findElement(By.cssSelector("a[href='https://www.pavantestingtools.com/']")).click();
	  
	  WebElement ele=root1.findElement(By.cssSelector("a[href='https://www.pavantestingtools.com/']"));
	  
	  //mouse operation-Actions is class in selenium
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).click().build().perform();
	  
	  Thread.sleep(1500);
	  
	  driver.navigate().back();
	  
	  //upload file-->sendKeys  Robot class
	  root1.findElement(By.cssSelector("input[type='file']")).sendKeys("C:\\Users\\Ganes\\OneDrive\\Desktop\\ISTQB Contents.docx");
	  
	  
	  
	  
	  
	  
	  
  }
}
