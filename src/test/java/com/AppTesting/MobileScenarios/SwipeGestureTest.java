package com.AppTesting.MobileScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.AppTesting.Utility.DriverUtil;
import com.AppTesting.Utility.MobileElement;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class SwipeGestureTest {
  @Test
  public void testGesture() throws InterruptedException
  {
	  
	  //create appiumDriver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  //views
	  
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //gallery
	  driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	  
	  
	  //photos
	  driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	  
	    
	  //area
	  WebElement area=driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
	  
	  //swipe
	  /*
	  driver.executeScript("mobile:swipeGesture",ImmutableMap.of(
			  
			  "elementId",((RemoteWebElement)area).getId(),
			  "direction","left",
			  "percent",1.0
			   
			  ));
	  */
	  
	  MobileElement.swipeLeft(driver,area);
	  
	  Thread.sleep(2000);
	  
	  MobileElement.swipeRight(driver,area);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
