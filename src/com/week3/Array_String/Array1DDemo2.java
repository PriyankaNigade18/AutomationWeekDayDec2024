package com.week3.Array_String;

public class Array1DDemo2 {

	public static void main(String[] args)
	{
		// using new keyword
		
		Object empdata[]=new Object[5];
		empdata[0]="Sarang";
		empdata[1]="Pune";
		empdata[2]=40;
		empdata[3]='M';
		empdata[4]=78.89;
		
		System.out.println("length of array: "+empdata.length);
		
		for(int i=0;i<empdata.length;i++)
		{
			System.out.println(empdata[i]);
		}
		
		System.out.println("*****Iteration Using for-each loop***********");
		
		for(Object i:empdata)
		{
			System.out.println(i);
		}
System.out.println("********************************");
		
		//Using literal
		
	int sid[]= {10,20,30,40,50};
	
	System.out.println(sid[3]);//40
	//System.out.println(sid[5]);//ArrayIndexOutOfBoundsException
	System.out.println("Length is: "+sid.length);
	
	for(int i=0;i<sid.length;i++)
	{
		System.out.println(sid[i]);
	}
		
	System.out.println("*****Iteration Using for-each loop***********");

	for(int i:sid)
	{
		System.out.println(i);
	}
	System.out.println("*******************************");	
	
	Object stData[]= {"Smita","Mumbai",23,'f',89776655544L};
	
	for(int i=0;i<stData.length;i++)
	{
		System.out.println(stData[i]);
	}
		
		
	System.out.println("*****Iteration Using for-each loop***********");

	for(Object i:stData)
	{
		System.out.println(i);
	}
		
	}

}
