package com.AppTesting.MobileScenarios;

import java.util.List;

import org.testng.annotations.Test;

import com.AppTesting.Utility.DriverUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GetThePerformanceData {
  @Test
  public void f()
  {
	  //create a driver session
	  AppiumDriver driver=DriverUtil.initDriverSession();
	  
	  //how to get app package name
	  String packageName=((AndroidDriver)driver).getCurrentPackage();
	  
	  System.out.println("Package name: "+packageName);
	  
	  //how to get the activity name
	 // ((AndroidDriver)driver).getCurrentActivity();
	  
	  //to get the performance data: performance data type
	  List<String> allDataTypes=((AndroidDriver)driver).getSupportedPerformanceDataTypes();
	  System.out.println(allDataTypes);
	  
	  //[cpuinfo, memoryinfo, batteryinfo, networkinfo]
	  
	  List<List<Object>> batteryInfo=((AndroidDriver)driver).getPerformanceData(packageName,"batteryinfo",5);
	  System.out.println("Battery Information: "+batteryInfo);
	  
	  
	  List<List<Object>> memoryInfo=((AndroidDriver)driver).getPerformanceData(packageName,"memoryinfo",5);
	  System.out.println("Memory Information: "+memoryInfo);
	  
	  List<List<Object>> networkInfo=((AndroidDriver)driver).getPerformanceData(packageName,"networkinfo",5);
	  System.out.println("Network Information: "+networkInfo);
	  
	  
	  
	  
	  
  }
}
