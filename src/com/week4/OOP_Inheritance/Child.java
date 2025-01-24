package com.week4.OOP_Inheritance;

public class Child extends Parent
{
	/*
	 * child class has overrides parent class method
	 */
	@Override
	public void color()
	{
		System.out.println("color: Blue");
	}

	public static void main(String[] args) 
	{
		System.out.println("child class ref and child class object");
		
		Child c1=new Child();
		c1.color();//Blue
		
		System.out.println("parent class ref and parent class object");

		Parent p1=new Parent();
		p1.color();//red
		
		System.out.println("Parent class ref and child class object");
		
		
		Parent p2=new Child();
		p2.color();//blue
		
		


	}

}
