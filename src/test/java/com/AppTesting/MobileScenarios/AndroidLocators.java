package com.AppTesting.MobileScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.AppTesting.Utility.DriverUtil;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AndroidLocators 
{
  @Test
  public void testLocators() throws InterruptedException 
  {
	  //create a driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  //Locator1:AccessibilityId(primary)
	  WebElement ele1=driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	  System.out.println("Element 1 text is: "+ele1.getText());
	  ele1.click();
	  
	  Thread.sleep(2000);
	  driver.navigate().back();
	  
	  //Locator2: xpath-->Animation
	  WebElement ele2=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Animation\"]"));
	  System.out.println("Element 2 text is: "+ele2.getText());
	  ele2.click();
	  
	  Thread.sleep(2000);
	  driver.navigate().back();
	  
	  //Locator3:-android uiautomator-App
	  WebElement ele3=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"App\")"));
	  System.out.println("Element 3 text is: "+ele3.getText());
	  ele3.click();
	  
	  Thread.sleep(2000);
	  driver.navigate().back();
	  
	  
	  //Locator4: className(attribute):Content
	  //using class name 13 match  from 13 I want 6th number ele=index is 5
	  WebElement ele4=driver.findElements(AppiumBy.className("android.widget.TextView")).get(5);
	  System.out.println("Element 4 text is: "+ele4.getText());
	  ele4.click();
	  
	  Thread.sleep(2000);
	  driver.navigate().back();
	  
	  
	  //Locator 5: resource-id or id (attribute based)
	  WebElement ele5=driver.findElements(AppiumBy.id("android:id/text1")).get(11);
	  System.out.println("Element 5 text is: "+ele5.getText());
	  ele5.click();
	  
	  Thread.sleep(2000);
	  driver.navigate().back();
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
