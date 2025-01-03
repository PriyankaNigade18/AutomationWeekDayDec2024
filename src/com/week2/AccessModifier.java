package com.week2;

public class AccessModifier 
{
	    int id=101;//default

	public String name="Sarang";

	private int phno=987655544;
	
	public static void main(String[] args) 
	{
		System.out.println("Within a same class");
		AccessModifier a1=new AccessModifier();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);


	}

}
