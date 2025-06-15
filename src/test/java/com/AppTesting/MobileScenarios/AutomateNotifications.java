package com.AppTesting.MobileScenarios;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.AppTesting.Utility.DriverUtil;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AutomateNotifications {
  @Test
  public void testNotification() 
  {
	  
	  //create AppiumDriver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  
	  //open notification from device
	    
	 ((AndroidDriver)driver).openNotifications();
	  
	  
	 //total notifications and capture text
	 List<WebElement> allNotifications=driver.findElements(AppiumBy.id("android:id/app_name_text"));
	  
	  System.out.println("Total Notifications are: "+allNotifications.size());
	  
	  for(WebElement i:allNotifications)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  
	  
  }
}
