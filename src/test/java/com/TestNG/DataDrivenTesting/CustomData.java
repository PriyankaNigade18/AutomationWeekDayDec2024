package com.TestNG.DataDrivenTesting;

import org.testng.annotations.DataProvider;

public class CustomData
{

	@DataProvider(name="loginData")
	public Object[][] testData()
	{
		Object data[][]= {{"Admin","admin123"},{"Pooja","test123"},{"Admin","admin123"},{"Sarang","test123"}};
		return data;
	}
}
