package com.TestNG.ParallelTesting;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeTest {
	@Test
	  public void edgeTest()
	  {
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://www.facebook.com");
	  }
}
