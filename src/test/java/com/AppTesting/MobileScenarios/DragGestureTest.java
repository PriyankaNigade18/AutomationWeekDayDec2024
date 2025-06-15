package com.AppTesting.MobileScenarios;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.AppTesting.Utility.DriverUtil;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class DragGestureTest {
  @Test
  public void testGesture()
  {
	  
	  //Create appium driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  
	  //drag and drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  
	  //element dot1 to drag
	  
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
	  
	  //drag
	  
	  
	  driver.executeScript("mobile:dragGesture",ImmutableMap.of(
			  
			  "elementId",((RemoteWebElement)ele).getId(),
			  "endX",899,
			  "endY",1776
			  
			  ));
	  
	  
	  //get the text:locate the message and write script:getText()
	  String text=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
	  System.out.println(text);
	  
	  
	  Assert.assertEquals(text,"Dropped!");
	  
	  System.out.println("Text matched!");
	  
	  
	  
  }
}
