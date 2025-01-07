package com.week3;

public class ThisKeywordDemo1 
{
	
	/*
	 * This keyword points to current class Object
	 * This Keyword is used to call instance variable and instance method
	 */
	int eid;
	String ename;
	
	public ThisKeywordDemo1 (int eid,String ename)
	{
		System.out.println("Constructor calling");
		//local to instance
		this.eid=eid;
		this.ename=ename;
		System.out.println("Employee id: "+this.eid);
		System.out.println("Employee name: "+this.ename);
		
	}
	public void display()
	{
		System.out.println("display Method calling");

		System.out.println(eid);
		System.out.println(ename);
	}
	
	

	public static void main(String[] args)
	{
		ThisKeywordDemo1 e1=new ThisKeywordDemo1(101,"Era");
		e1.display();

	}

}
