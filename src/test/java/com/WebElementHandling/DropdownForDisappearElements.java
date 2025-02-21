package com.WebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropdownForDisappearElements {
  @Test
  public void testDropdown()
  {
	  
	  //create driversession
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  //login
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  //pim
	  driver.findElement(By.xpath("//span[text()='PIM']")).click();
	  
	  //automate dropdown
	  driver.findElement(By.xpath("(//i[contains(@class,'oxd-select-text--arrow')])[3]")).click();
	  
	  //class="oxd-select-option"
	  
	  List<WebElement>  allOptions=driver.findElements(By.xpath("//div[contains(@class,'oxd-select-dropdown')]//span"));
	  System.out.println("Total options are: "+allOptions.size());
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("QA Engineer"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
  }
  
  
  
}
