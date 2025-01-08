package com.week3;

public class StaticVsInstanceVariable 
{
	/*
	 * Static variable get the memory one time and same memory it share with all object
	 * Instance variable get the new memory every time when we create object
	 */
	//int count=1;instance-->11111
	static int count=1;//-->12345
	
	StaticVsInstanceVariable()
	{
		System.out.println(count);
		count++;
	}
	
	public static void main(String[] args) 
	{
		StaticVsInstanceVariable s1=new StaticVsInstanceVariable();
		StaticVsInstanceVariable s2=new StaticVsInstanceVariable();
		StaticVsInstanceVariable s3=new StaticVsInstanceVariable();
		StaticVsInstanceVariable s4=new StaticVsInstanceVariable();
		StaticVsInstanceVariable s5=new StaticVsInstanceVariable();
		

	}

}
