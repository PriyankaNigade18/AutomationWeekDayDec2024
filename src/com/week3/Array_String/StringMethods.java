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
	
	//to return single character-charAt(index)
	
	String s5="webtesting";
	System.out.println("character at 4th position: "+s5.charAt(4));//e
	
	//indexOf(): returns index of first occurrence of character
	System.out.println("index of first Occurrence character e: "+s5.indexOf('e'));//1
	
	//lastIndexOf():returns index of last occurrence of character
	System.out.println("index of last Occurrence character e: "+s5.lastIndexOf('e'));//4
	

	/*isBlank():Returns true if the string is empty or contains only white space codepoints,otherwise false.
	and isEmpty():if lenght is 0
	*/
	String s6=" ";
	System.out.println(s6.length());
	System.out.println("Is String Empty?: "+s6.isEmpty());//false/true
	System.out.println("Is string blank?: "+s6.isBlank());//true/true
	
	
	//substring()
	String test="TestNG is unit testing test framework";
	System.out.println(test.substring(5));
	System.out.println(test.substring(7,16));//7th char to 15th char
	
	//replace
	System.out.println(test.replace('i','*'));
	System.out.println(test.replace("test","softwaretest"));
	
	
	//split(regular expression): pattern
	String tools="selenium,Jmeter,Appium,Postman,Cypress";
	System.out.println(tools);
	
	String arr[]=tools.split(",");
	for(String i:arr)
	{
		System.out.println(i);
	}
	
	//only single element
	String apiTool=tools.split(",")[3];
	System.out.println("Api testing tool: "+apiTool);
	
	String date="Jan 2025";
	String month=date.split(" ")[0];
	String year=date.split(" ")[1];
	
	System.out.println("Month is: "+month);
	System.out.println("Year is: "+year);
	
	/*
	 * Amount validation
	 * amount should be 5000 and less than 10000
	 * 
	 */
	
	String bill="Total amount is 5000";
	String data=bill.split(" ")[3];
	System.out.println(data);
	//string to int
	int amount=Integer.parseInt(data);
	if(amount==5000 && amount<10000)
	{
		System.out.println("Amount matched....Test Pass!");
	}else
	{
		System.out.println("Amount not matched....Test Fail!");

	}
	
	
	
	//toCharArray():Converts this string to a new character array.
	
	String s7="Hello";
	char ar[]=s7.toCharArray();
	for(char i:ar)
	{
		System.out.println(i);
	}
	
	/*
	 * StringBuffer class (java v1.1) & StringBuilder class(java v1.5)
	 * - these classes are mutable
	 * - StringBuffer is synchronize (at a time only thread)
	 * - StringBuilder class is non synchronize(at a time multiple thread)
	 */
	StringBuilder b=new StringBuilder("Hello");
	b.append(2025);
	System.out.println(b);
	
	//how to reverse any string using method
	System.out.println(b.reverse());
	
	//How to reverse string using string class
	String ss1="Java Selenium cypress";
	String res="";
	for(int i=ss1.length()-1;i>=0;i--)
	{
		res=res+ss1.charAt(i);
	}
	
	System.out.println("Reverse of string is: "+res);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	





		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
