package com.week3.ControlFlowStatement;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter performance Id(1 to 5)");
		int id=sc.nextInt();
		
		switch(id)
		{
		case 1: 
			System.out.println("Your performance is poor");
			break;
		case 2: 
			System.out.println("Your performance is Need to improve");
			break;
		case 3: 
			System.out.println("Your performance is Good ");
			break;
		case 4: 
			System.out.println("Your performance is Excellent");
			break;
		case 5: 
			System.out.println("Your performance is Employee of the month");
			break;
			
			default:
				System.out.println("Wrong choice!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		System.out.println("Enter browser name");
		String bname=sc.nextLine();
		
		switch(bname.toLowerCase())
		{
		case "chrome": 
			System.out.println("Test case is executing on Chrome!");
			break;
		case "edge": 
			System.out.println("Test case is executing on Edge!");
			break;
		case "firefox": 
			System.out.println("Test case is executing on Firefox!");
			break;
			
			default:
				System.out.println("Wrong Browser choice!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		System.out.println("Enter a character");
		char ch=sc.nextLine().charAt(0);
		
		switch(ch)
		{
		case 'a':
			System.out.println(ch+" is vowel");
			break;
		case 'e':
			System.out.println(ch+" is vowel");
			break;
		case 'i':
			System.out.println(ch+" is vowel");
			break;
		case 'o':
			System.out.println(ch+" is vowel");
			break;
		case 'u':
			System.out.println(ch+" is vowel");
			break;
			
			default:
				System.out.println(ch+" is not a vowel");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		/*
		System.out.println("Enter number between 0 to 5");
		int num=sc.nextInt();
		
		switch(num)
		{
		case 0:
			System.out.println("Zero");
			break;//exit from switch and loop
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		
		default:
			System.out.println("Wrong Number!");
			break;
		}
		
		*/

	}

}
