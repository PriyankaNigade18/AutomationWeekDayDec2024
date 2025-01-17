package com.week3.Array_String;

public class StringDemo1 
{
	/*
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
		String s1="Hello";//23
		String s2="Hello";//23
		
		
		/*
		 * compare ids assign by jvm using operator
		 * compare data assign to string use method
		 * 
		 */
		
		System.out.println(s1==s2);//true
		
		String s3=new String("Hello");//34
		
		System.out.println(s1==s3);//false
		
		
		//String is Immutable
		String name1="Jay";
		String name2="Jay";
		
		System.out.println(name1==name2);//true
		
		name1=name1+" Nigade";
		
		System.out.println(name1==name2);//false
		
		
		
		
		
		
		

	}

}
