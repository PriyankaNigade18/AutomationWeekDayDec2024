package com.AppTesting.MobileScenarios;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import com.AppTesting.Utility.DriverUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Lock_Unlock_RotateDevice {
  @Test
  public void testDevice() throws InterruptedException
    {
	  
	  //create a driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  
	 
	  ((AndroidDriver)driver).lockDevice();
	
	  Thread.sleep(2000);
	  
	  ((AndroidDriver)driver).unlockDevice();
	  
	  //Rotate
	  ((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);
	  
	  Thread.sleep(2000);
	  
	  ((AndroidDriver)driver).rotate(ScreenOrientation.PORTRAIT);
	  
	  
	  
	  
	  
  }
}
