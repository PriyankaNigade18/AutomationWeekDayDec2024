package com.week5_ExceptionHandling;

public class ThrowsKeyword {

	public void m1() //throws InterruptedException
	{
		m2();
	}
	public void m2() //throws InterruptedException
	{
		m3();
	}
	public void m3()// throws InterruptedException
	{
		try {
		System.out.println("Hello");
		Thread.sleep(3000);
		System.out.println("Hi");
	}catch(InterruptedException i)
	{
		System.out.println("This line throws exception....");
	}
		
	}
	public static void main(String[] args) //throws InterruptedException
	{
		ThrowsKeyword t1=new ThrowsKeyword();
		t1.m1();

	}

}
