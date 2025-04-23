package com.TestListners;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {
  @Test
  public void testReport() 
  {
	  
	  //create Extent report instance
	  ExtentReports extent=new ExtentReports();
	  
	  //location for report
	  ExtentSparkReporter spark=new ExtentSparkReporter(System.getProperty("user.dir")+"//TestReports//ExtentReport"+System.currentTimeMillis()+".html");
	  
	  
	  //set the configuration
	  spark.config().setDocumentTitle("ReportTest");
	  spark.config().setReportName("BasicDemoOnReport");
	  spark.config().setTheme(Theme.DARK);
	  
	  
	  //attach the report
	  extent.attachReporter(spark);
	  
	  
	  //to create log create test first
	  ExtentTest test=extent.createTest("TestReport");
	  
	  //log
	  test.log(Status.PASS,"Test case is Pass!" );
	  
	  test.log(Status.FAIL,"Test case is Fail!" );
	  test.log(Status.SKIP,"Test case is Skip!" );
	  test.log(Status.INFO,"Test case information!" );
	  test.log(Status.WARNING,"Its a Warning!" );
	  
	  
	  //close the report
	  
	  extent.flush();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
