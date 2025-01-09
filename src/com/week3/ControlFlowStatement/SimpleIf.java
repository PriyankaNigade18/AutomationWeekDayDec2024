package com.week3.ControlFlowStatement;

import java.util.Scanner;

public class SimpleIf {

	public static void main(String[] args)
	{
		//to match true condition we use simple if
		
		System.out.println("Program starts!");
		
		//validate age
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		
		//int age=23;
		
		if(age>=18)
		{
			System.out.println("Valid age!");
		}
		
		System.out.println("Program ends!");


	}

}
