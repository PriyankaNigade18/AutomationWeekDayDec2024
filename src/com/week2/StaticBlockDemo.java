package com.week2;

public class StaticBlockDemo
{
	static String cname;
	
	//static block
	static
	{
		cname="AISSPMS";
		System.out.println("Static block is calling....."+cname);
	}
	
	public static void main(String[] args)
	{
		System.out.println("This is main() calling......");		

	}
	
	
	

}
