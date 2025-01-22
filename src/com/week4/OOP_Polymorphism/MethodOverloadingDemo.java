package com.week4.OOP_Polymorphism;

public class MethodOverloadingDemo
{
	/*
	 * Method
	 * ===============
	 * Method Overloading is a process where same name method we
	 * can reuse in same class multiple number time with different 
	 * signature
	 * 1.add number of arguments
	 * 2.add different types of arguments
	 * 3.change order of arguments
	 * 
	 * constructor Overloading
	 * ==========================
	 * Constructor overloading supported in Java but not overriding
	 * Constructor Overloading is a process where same name Constructor we
	 * can reuse in same class multiple number time with different 
	 * signature
	 * 1.add number of arguments
	 * 2.add different types of arguments
	 * 3.change order of arguments
	 * 
	 * Operator overloading
	 * =====================
	 * +
	 * 
	 * Main() overloading is possible in java ?
	 * yes, It is possible but technically we don't need this anywhere
	 * 
	 */
	
	MethodOverloadingDemo()
	{
		System.out.println("Default constructor is calling!");
	}
	
	MethodOverloadingDemo(String msg)
	{
		System.out.println("Parameterized constructor is calling!msg: "+msg);
	}
	
	MethodOverloadingDemo(int id)
	{
		System.out.println("Parameterized constructor is calling!id: "+id);
	}

	public void add()//o parameter
	{
		int a=190,b=40;
		System.out.println("Addition is: "+(a+b));
	}
	//1.add number of arguments
	public void add(int a,int b)//2 parameter
	{
		System.out.println("Addition is: "+(a+b));

	}
	
	//2.add different types of arguments
	public void add(double a,int b)//2 parameter
	{
		System.out.println("Addition is: "+(a+b));
	
	}
	
	// 3.change order of arguments
	public void add(int a,double b)//2 parameter
	{
		System.out.println("Addition is: "+(a+b));

	}
	public static void main(String[] args) 
	{

		MethodOverloadingDemo m1=new MethodOverloadingDemo();
		m1.add();
		m1.add(129.88,40);
		m1.add(78,67);
		m1.add(89,778.660);
		
		MethodOverloadingDemo m2=new MethodOverloadingDemo(67);

	}

}
