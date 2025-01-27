package com.week4.OOP_DataAbstraction;

public abstract class SampleTest 
{
	//implemented
	public void accept()
	{
		System.out.println("Accept is implemented Method");
	}
	
	
	/*
	 * non implemented method is method without body
	 * such method we declare as abstract
	 * 
	 * If any class contains any abstract method then class need to declare as abstract
	 * Abstract class is not fully implemented and so we cant create object for abstrct class
	 * only partial abstraction is possible
	 * 
	 * Using child class we can access methods of abstract class
	 * Child class need to implement abstract method 
	 */
	
	public abstract void display();
	
	
	
	
	
	
	

	public static void main(String[] args)
	{
		//Cannot instantiate the type SampleTest	
		//SampleTest s1=new SampleTest();
		

	}

}
