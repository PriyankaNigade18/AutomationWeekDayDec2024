package com.week3.Array_String;

public class Array1DDemo {
	/*
	 * Array is static data structure
	 * Array implemented in Java as Object
	 * Array store similar type of data/Object
	 * Array index position starts with 0
	 * Array support only one property -length
	 * Array always have fixed size
	 * 
	 * Array types are:
	 * =================
	 * 1.single Dimensional
	 * 2. Multi/2D Dimensional
	 */
	public static void main(String[] args)
	{
		// Using new keyword
		
		//declaration
		int sid[]=new int[5];
		
		//initialization
		sid[0]=101;
		sid[1]=102;
		sid[3]=104;
		sid[4]=105;
		
		System.out.println(sid[2]);//0
		System.out.println("Length of array: "+sid.length);
		//System.out.println(sid[5]);//ArrayIndexOutOfBoundsException
		
		System.out.println(sid[4]);
		
		//get the the data from array
		System.out.println("*****Iteration Using for loop***********");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(sid[i]);
		}
		System.out.println("*************************");
		
		for(int i=0;i<sid.length;i++)
		{
			System.out.println(sid[i]);
		}
		System.out.println("*****Iteration Using for-each loop***********");
		for(int i:sid)
		{
			System.out.println(i);
		}
		
		System.out.println("*******************************************");
		
		double marks[]=new double[3];
		marks[0]=56.78;
		marks[1]=77.65;
		marks[2]=67.8;
		System.out.println("Total marks count: "+marks.length);
		System.out.println("Sum of marks:"+(marks[0]+marks[1]+marks[2]));
		
		System.out.println("****************Iteration*****************");
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		System.out.println("*****Iteration Using for-each loop***********");
		for(double i:marks)
		{
			System.out.println(i);
		}
		
		System.out.println("*********************************");
		
		String loc[]=new String[3];
		loc[0]="Nashik";
		loc[1]="Mumbai";
		loc[2]="Pune";
		
		for(int i=0;i<loc.length;i++)
		{
			if(loc[i].equals("Pune"))
			{
			System.out.println("Match found!");
			break;
			}
		}
		
		System.out.println("*****Iteration Using for-each loop***********");

		for(String i:loc)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
