package com.week3.ControlFlowStatement;

public class LoopDemo {

	public static void main(String[] args) throws InterruptedException
	{
		// Print hello statement 5 time
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
		}
		
		System.out.println("******************");
		
		//print 1 to 10 numbers
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("******************");

		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		System.out.println("******************");
		/*
		//interview question
		for(;;)//default for loop condition is true
		{
			System.out.println("Hi");
			Thread.sleep(2000);
			//infinite time
		}
		*/
		
		
		//write a program to print sum of 100 natural numbers =5050
		
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum=sum+i;
		}
		
		System.out.println("sum of 100 natural numbers: "+sum);
		
		System.out.println("*************************");
		
		//print all even number upto 25
		for(int i=1;i<=25;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even number: "+i);
			}
		}
		
		
		
		
	}

}
