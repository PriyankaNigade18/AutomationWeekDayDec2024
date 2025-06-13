package com.AppTesting.MobileScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.AppTesting.Utility.DriverUtil;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ClickGestureTest {
  @Test
  public void testClickGesture()
  {
	  
	  //create driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	//identify element
	  WebElement ele=driver.findElement(AppiumBy.accessibilityId("Views"));
	  
	  //ele.click();
	  
	  //perform touch action  : mobile:clickGesture
	  
	  driver.executeScript("mobile:clickGesture",ImmutableMap.of(
			  
			  "elementId", ((RemoteWebElement)ele).getId()
			  
			  ));
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
