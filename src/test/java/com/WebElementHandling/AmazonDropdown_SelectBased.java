package com.WebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class AmazonDropdown_SelectBased
{
  @Test
  public void testDropdown() throws InterruptedException 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.in/");
	  
	  //identify dropdown
	  WebElement dropdownEle=driver.findElement(By.id("searchDropdownBox"));
	 Utility.selectBasedDropdown(dropdownEle,"Kindle Store");
	  
	  
	  
	  
	  /*
	  //select based -->create object of Select class
	  Select dd=new Select(dropdownEle);
	  
	 System.out.println("Is dropdown support multiple selection?: "+dd.isMultiple());
	  
	 
	 //single option selection
	 dd.selectByIndex(3);//Amazon Fashion
	 //static wait
	 Thread.sleep(3000);
	 
	 dd.selectByValue("search-alias=computers");//Computers & Accessories
	 
	 //static wait
	 Thread.sleep(3000);
	 
	 dd.selectByVisibleText("Kindle Store");
	 
	  //get all options calculate total and print all options
	 
	 List<WebElement> allOptions=dd.getOptions();
	 System.out.println("Total Options are: "+allOptions.size());
	 
	 String expected="Video Games";
	 
	 for(WebElement i:allOptions)
	 {
		 System.out.println(i.getText());
		 if(i.getText().contains(expected))
		 {
			 System.out.println("Option found....Test Pass!");
			 i.click();
			 break;
		 }
	 }
	
	 
	 */
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  
	  
	  
  }
}
