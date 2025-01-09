package com.week3.ControlFlowStatement;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		//validate is number even or odd
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+" is even");
		}else
		{
			System.out.println(num+" is odd");
		}
		
		
		
		
		
		
		
		
		
		/*
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Valid!");
		}else
		{
			System.out.println("Invalid!");
		}

*/
	}

}
