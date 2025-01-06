package com.week3;

import java.util.Scanner;

public class RuntimeParameterPassing
{
	public void add(int a,int b)
	{
		System.out.println("Addition is: "+(a+b));
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
		
		

	}

}
