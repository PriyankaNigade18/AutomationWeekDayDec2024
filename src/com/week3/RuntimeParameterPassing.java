package com.week3;

import java.util.Scanner;

public class RuntimeParameterPassing
{
	public void add(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
	}

	public int sub(int a,int b)
	{
		return a-b;
	}
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1=sc.nextInt();
		
		System.out.println("Enter second number: ");
		int num2=sc.nextInt();
		
		//runtime parameter passing
		RuntimeParameterPassing r1=new RuntimeParameterPassing();
		r1.add(num1,num2);
		
		int result=r1.sub(num1,num2);
		System.out.println("Subtraction is: "+result);
		
		

	}

}
