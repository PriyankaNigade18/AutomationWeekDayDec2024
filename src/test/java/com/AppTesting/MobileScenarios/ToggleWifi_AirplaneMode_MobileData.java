package com.AppTesting.MobileScenarios;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.AppTesting.Utility.DriverUtil;
import com.AppTesting.Utility.MobileElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class ToggleWifi_AirplaneMode_MobileData {
  @Test
  public void setUpToggle() throws InterruptedException 
  {
	  
	  
	  //create driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  System.out.println("By default Wifi setup is On: ");
	  
	  //on to off
	  ((AndroidDriver)driver).toggleWifi();
	  
	  System.out.println("After toggle Wifi setup is OFF: ");
	  
	  //swipe left
	  WebElement area=driver.findElement(AppiumBy.id("com.android.systemui:id/qs_pager"));
	  MobileElement.swipeLeft(driver,area);
	  
	  //mobileData
	  //off mobile data
	  ((AndroidDriver)driver).toggleData();
	  
	  System.out.println("After toggleData setup is OFF: ");

	  
	  Thread.sleep(2000);
	  //airplane mode:ON
	  
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  
	  System.out.println("After toggleAirplaneMode setup is ON: ");
	  
	  
}
}
