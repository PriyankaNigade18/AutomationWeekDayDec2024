package com.AppTesting.MobileScenarios;





import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.AppTesting.Utility.DriverUtil;
import com.AppTesting.Utility.MobileElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AutomateAndroidKeyboard {
  @Test
  public void testKeyboard() 
  {
	  //create Appium Session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  
	  //scroll 3 time 
	  
	  //get the area
	  WebElement area=driver.findElement(AppiumBy.id("android:id/list"));
	  MobileElement.scrollAsPerUserChoice(driver,area,3,"down");
	  	  
	  //textview
	  driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
	  
	  //enter text using android keyboard
	  WebElement editArea=driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit"));
	  
	  //editArea.sendKeys("Hello All");
	  
	  //some commands are android specific so type casting required!
	  //appium driver into android driver
	  
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.H));
	   ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.E));
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.L));
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.L));
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.O));
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.SPACE));
	  
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.A)); 
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.L));
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.L));
	  
	  
	  
	  
  }
}
