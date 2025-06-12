package com.AppTesting.DriverSession;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriversessionUsingUiAutomator2OptionsClass {
  @Test
  public void craeteDriverSession() throws MalformedURLException, URISyntaxException 
  {
	  
	  //set the capabilities
	  UiAutomator2Options options=new UiAutomator2Options();
	  
	  //app path
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  options.setCapability("appium:app",path);
	  
	  //server address
	  URL url=new URI("http://0.0.0.0:4723").toURL();
	  
	  //create driver session
	  AppiumDriver driver=new AndroidDriver(url,options);
	  System.out.println("Session id is: "+driver.getSessionId());
	  
	  
	  
	  
	 
	  
	  
	  
  }
}
