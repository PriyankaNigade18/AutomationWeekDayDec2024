package com.AppTesting.MobileScenarios;

import java.time.Duration;

import org.testng.annotations.Test;

import com.AppTesting.Utility.DriverUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class WorkingWithApp {
  @Test
  public void f() throws InterruptedException
  {
	//create a driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  
	  
	  //get the application package name
	  String packageName=((AndroidDriver)driver).getCurrentPackage();
	  
	  //check current status of app
	  System.out.println("Current Application status is: "+((AndroidDriver)driver).queryAppState(packageName));
	  
	  //how to terminate
	  ((AndroidDriver)driver).terminateApp(packageName);
	  
	   System.out.println("After terminate Application status is: "+((AndroidDriver)driver).queryAppState(packageName));

	  Thread.sleep(2000);
	  
	  //activate
	  ((AndroidDriver)driver).activateApp(packageName);
	  System.out.println("After activate Application status is: "+((AndroidDriver)driver).queryAppState(packageName));

	  Thread.sleep(2000);
	  
	  //uninstall 
	  ((AndroidDriver)driver).removeApp(packageName);
	  System.out.println("After Uninstallation Application status is: "+((AndroidDriver)driver).queryAppState(packageName));

	  Thread.sleep(2000);
	  
	  //install
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  ((AndroidDriver)driver).installApp(path);
	  System.out.println("After installation Application status is: "+((AndroidDriver)driver).queryAppState(packageName));

	  ((AndroidDriver)driver).activateApp(packageName);
	  
	  Thread.sleep(2000);
	  
	  ((AndroidDriver)driver).runAppInBackground(Duration.ofSeconds(5));
	  
	  System.out.println("After Background execution Application status is: "+((AndroidDriver)driver).queryAppState(packageName));

	  
	  
	  
	  
	  
	  
  }
}
