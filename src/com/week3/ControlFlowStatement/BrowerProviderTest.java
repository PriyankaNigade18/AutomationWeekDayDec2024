package com.week3.ControlFlowStatement;

import java.util.Scanner;

public class BrowerProviderTest {

	public static void main(String[] args)
	{
		/*
		 * String is class 
		 * String comparison
		 * =====================
		 * 1.equals(): exact match and this is case sensitive
		 * 2.equalsIgnoreCase(): exact match and it is not a case sensitive
		 *
		
		String act="Hello";
		String exp="Hello";
		System.out.println(act.equals(exp));//true/false
		
		System.out.println(act.equalsIgnoreCase(exp));//true
		
		*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name: ");
		String bname=sc.nextLine();
		
		if(bname.equalsIgnoreCase("chrome"))
		{
			System.out.println("Test is executing on "+bname);
		}else if(bname.equalsIgnoreCase("edge"))
		{
			System.out.println("Test is executing on "+bname);

		}else if(bname.equalsIgnoreCase("firefox"))
		{
			System.out.println("Test is executing on "+bname);

		}else
		{
			System.out.println("Browser name is invalid");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
