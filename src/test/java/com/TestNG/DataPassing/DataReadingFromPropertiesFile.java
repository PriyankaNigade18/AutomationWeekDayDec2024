package com.TestNG.DataPassing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class DataReadingFromPropertiesFile {
  @Test
  public void testFile() throws IOException
  {
	  /*
	   * C:\Users\Ganes\OneDrive\Desktop\Learning\WeekdayDec24\MavenSelenium\ConfigData\config.properties
	   * to read project directory: ./ or System.getProperty("user.dir")
	   */
	  
	  //path of file-File class
	  File f1=new File(System.getProperty("user.dir")+"//ConfigData//config.properties");
	  
	  
	  //to read a data in Stream -FileInputStream class
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //create instance of Properties File-Properties class
	  Properties p1=new Properties();
	  
	  //load the file
	  p1.load(fs);
	  
	  //to read file data p1.getProperty(Key)-->Value
	  
	  System.out.println("Browser Name is: "+p1.getProperty("browserName"));
	  System.out.println("User Name is: "+p1.getProperty("user"));
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
