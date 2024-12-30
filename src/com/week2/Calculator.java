package com.week2;

public class Calculator 
{
	public void add()
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println("Addition of "+a+" and "+b+" is: "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1=new Calculator();
		c1.add();
	}

}
