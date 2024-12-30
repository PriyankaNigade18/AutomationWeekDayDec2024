package com.week2;

public class MethodDemo 
{
	//instance--> call with object
	public void accept()
	{
		System.out.println("This is instance method");
	}

	/*
	 * static method
	 * -----------------
	 * in same class call directly
	 * in different class using class name call static method
	 */
	public static void show()
	{
		System.out.println("This is static method");
	}
	
	public static void main(String[] args)
	{

		show();
		MethodDemo.show();

		MethodDemo m1=new MethodDemo();
		m1.accept();
		//The static method show() from the type MethodDemo should be accessed in a static way
		//m1.show();
		

	}

}
