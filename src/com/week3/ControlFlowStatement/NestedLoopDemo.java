package com.week3.ControlFlowStatement;

public class NestedLoopDemo {

	public static void main(String[] args) 
	{
		// print table of number
		int num=2;
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
		}
		
		System.out.println("************************");
		
		//print all table from 1 to 10
		
		
		for(int n=1;n<=10;n++)
		{
			
			for(int i=1;i<=10;i++)
			{
				System.out.print(n*i+"\t");
			}
			System.out.println();
			
		}
		
		System.out.println("************************");
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println("************************");

		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
