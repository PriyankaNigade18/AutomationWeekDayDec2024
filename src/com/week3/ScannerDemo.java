package com.week3;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) 
	{

		System.out.println("Enter your name:");
		
		Scanner reader=new Scanner(System.in);
		
		String name=reader.nextLine();
		
		System.out.println("Hello "+name);
		
		System.out.println("Enter your id:" );
		int id=reader.nextInt();
		System.out.println("Your id is: "+id);
		
		reader.close();

	}

}
