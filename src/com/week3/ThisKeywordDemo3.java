package com.week3;

public class ThisKeywordDemo3
{

	//this() can be used to invoke current class constructor.
	//Constructor call must be first statement of that constructor

	public ThisKeywordDemo3()
	{
		this(101);
		System.out.println("Default constructor is calling....");
	}
	
	public ThisKeywordDemo3(int id)
	{
		//this();//default
		System.out.println("Parameterized constructor is calling...."+id);
	
	}
	
	
	public static void main(String[] args) 
	{
		ThisKeywordDemo3 t1=new ThisKeywordDemo3();
		

	}

}
