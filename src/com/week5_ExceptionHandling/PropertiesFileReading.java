package com.week5_ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReading {

	public static void main(String[] args) throws InterruptedException, IOException  
	{
		System.out.println("Program started!");
		Thread.sleep(3000);
		
		// File class where we can declare path of the file
		File f1=new File(System.getProperty("user.dir")+"//config.properties");
		
		//FileInputStream which help to read contents in stream
		FileInputStream fs=new FileInputStream(f1);
		
		//Properties class Object
		Properties p1=new Properties();
				
		//load the file
		p1.load(fs);
		
		//read data from file using getProperty(Key)--->value
		System.out.println("UserName is: "+p1.getProperty("userName"));
		System.out.println("Browser Name is: "+p1.getProperty("browserName"));

	}

}
