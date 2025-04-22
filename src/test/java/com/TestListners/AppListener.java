package com.TestListners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class AppListener implements ITestListener     
{

	public void onTestStart(ITestResult result)
	{
		System.out.println("OnTestStart....Test Name is: "+result.getName());
	}
	
	//pass
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("OnTestSuccess called for pass test case: "+result.getName());
	}
	//fail
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("OnTestFailure called for Fail Test Case: "+result.getName());
	}
	
	
}
