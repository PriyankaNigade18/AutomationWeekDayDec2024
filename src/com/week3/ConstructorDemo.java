package com.week3;


/*
 * 
 * Constructor is used to initialize Object
 * Constructor name is must be same like its class name
 * Constructor should not have any return type
 * constructor can not be declare with static,abstract,final
 * constructor get called by JVM
 * At the time of object creation we called constructor
 * Constructor overloading is possible but overriding is not possible
 * 
 * 
 * Types:
 * 1.Default constructor(called by jvm)
 * 2.parameterized constructor
 * 
 * 
 * 
 * 
 */
public class ConstructorDemo 
{

	//instance variable
	int id;
	String name;
	
	//default constructor
	public ConstructorDemo()
	{
		System.out.println("Default constaructor is calling!");
		System.out.println(id);
		System.out.println(name);
	}
	//parameterized constructor
	public ConstructorDemo(int i,String n)//2 parameters i ,n are local
	{//initialize object--->assigning local data to instance data
		
		System.out.println("Parameterized constaructor is calling!");
		id=i;
		name=n;
		
		System.out.println(id);
		System.out.println(name);
		
		
	}
	public static void main(String[] args)
	{
		ConstructorDemo c1=new ConstructorDemo();//default constructor
		
		ConstructorDemo c2=new ConstructorDemo(101,"Kiran");//parameterized
		
		



	}

}
