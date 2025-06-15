package com.AppTesting.MobileScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.AppTesting.Utility.DriverUtil;
import com.AppTesting.Utility.MobileElement;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LongClickGestureTest {
  @Test
  public void testGesture() 
  {
	  
	  //create appium dirver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  MobileElement.getScreenshot(driver,"Homepage");
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  MobileElement.getScreenshot(driver,"Viewpage");
	
	  //dragndrop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  MobileElement.getScreenshot(driver,"DragPage");
	  
	  //element
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
	  
	  //longclick
	  driver.executeScript("mobile:longClickGesture",ImmutableMap.of(
			  
			  "elementId",((RemoteWebElement)ele).getId(),
			  "duration",4000
			  
			  ));
	  
	  System.out.println("Long click gesture completed!");
	  
	  
	  
  }
}
