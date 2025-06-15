package com.AppTesting.MobileScenarios;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.AppTesting.Utility.DriverUtil;
import com.AppTesting.Utility.MobileElement;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ScrollGestureTest {
  @Test
  public void testGesture() throws InterruptedException
  {
	  
	  //create appium driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //on page perform scroll-pageArea
	  WebElement pageArea=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  //scrollGesture
	  /*
	  driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
			  
			  "elementId",((RemoteWebElement)pageArea).getId(),
			  "direction","down",
			  "percent",1.0
			  
			  
			  ));
			  */
	  
	  //MobileElement.scrollDown(driver,pageArea);
	  
	  MobileElement.scrollAsPerUserChoice(driver,pageArea,3,"down");
	  
	  Thread.sleep(2000);
	  
	  MobileElement.scrollUp(driver,pageArea);
	  
	  System.out.println("Page Scroll Down!");
	  
	  
	  
	  
	  
	  
	  
  }
}
