package com.week3;

public class MethodCalling 
{
	public void m1()
	{
		System.out.println("This is m1 calling....");
		m2();
		
	}

	public void m2()
	{
		System.out.println("This is m2 calling....");
		m3();
		
	}
	
	public void m3()
	{
		System.out.println("This is m3 calling....");
		//m1();//StackOverflowError
		
	}
	
	
	public static void main(String[] args)
	{

		MethodCalling obj=new MethodCalling();
		obj.m1();
		//obj.m2();
		
		
		
		
		

	}

}
