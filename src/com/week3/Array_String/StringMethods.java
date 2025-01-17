package com.week3.Array_String;

public class StringMethods 
{
	/*
	 * 
	 * String is Collection of characters in java
	 * String is Immutable class in Java
	 * Ways:
	 * =============
	 * 1.Using literal: Object will create inside SCP
	 * 2.Using new keyword: 2 Objects will create inside JVM Heap and SCP
	 * 
	 */
	

	public static void main(String[] args)
	{

		String s1="Hello All!";
		//length()
		System.out.println("Total length is: "+s1.length());//10

		//to covert String toUpperCase() toLowerCase()
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		/*
		 * equality between Strings: 
		 * 1.equals(): case sensitive
		 * 2.equalsIgnoreCase(): not case sensitive
		 * 
		 */
		
		String act="Selenium WebDriver is WebUI Automation library";
		String exp="Selenium WebDriver is WebUI automation library";

		System.out.println(act.equals(exp));//true//false
		System.out.println(act.equalsIgnoreCase(exp));//true
		
		//searching specific string- contains()
		
		System.out.println("Is Actual string have Selenium?: "+act.contains("Selenium"));//true
		
		System.out.println("Is Actual string have TestNG?: "+act.contains("TestNG"));//false
		
		//prefix:startsWith()    suffix: endsWith()
		
System.out.println("Is actual string starts with Selenium?: "+act.startsWith("Selenium"));//true
System.out.println("Is actual string starts with Sele?: "+act.startsWith("Sele"));//true

System.out.println("Is actual string starts with Se?: "+act.startsWith("Se"));//true

System.out.println("Is actual string starts with nium?: "+act.startsWith("nium"));//false


System.out.println("Actual string ends with library?: "+act.endsWith("library"));//true
		
System.out.println("Actual string ends with Library?: "+act.endsWith("Library"));//false
System.out.println("Actual string ends with ary?: "+act.endsWith("ary"));//true
System.out.println("Actual string ends with y?: "+act.endsWith("y"));//true
System.out.println("Actual string ends with lib?: "+act.endsWith("lib"));//false


	//concat() and  +
	String s2="Hello";
	String s3="All";
	System.out.println(s2.concat(" "+s3));
	System.out.println(s2+" "+s3);

	//trim()- ignore white space from the beginning and after the string
	
	String s4="    Welcome all      ";
	System.out.println(s4);
	
	System.out.println(s4.trim());
	
	
	/*
	 * charAt(),indexOf(),split(),substring(),isEmpty(),isBlank(),replace(),tocharArray()
	 * 
	 * StringBuffer & StringBuilder
	 * How to reverse any string
	 * 
	 */
	
	
	
	
	
	
	





		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
