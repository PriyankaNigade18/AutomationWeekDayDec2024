package com.week3.ControlFlowStatement;

import java.util.Scanner;

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
		System.out.println("*******************************");
		
		//while loop
		
		//print hello statement 10 
		
		int i=1;
		while(i<=10)
		{
			System.out.println("Hello");
			i++;
		}
		System.out.println("*********************");
		//sum of digit num=123 result=6
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int rem,res=0;
		
		while(num!=0)
		{
			rem=num%10;
			num=num/10;
			res=res+rem;
		}
		
		System.out.println("Sum of digits : "+res);
		
		System.out.println("*****************************");
		
		int n=1234,r,rev=0;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		
		System.out.println("Reverse of 1234 is: "+rev);
		
		System.out.println("**************************");
		
		//do while
		
		int x=1;
		
		do 
		{
			System.out.println("Welcome");
			x++;
			
		}while(x<=10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
