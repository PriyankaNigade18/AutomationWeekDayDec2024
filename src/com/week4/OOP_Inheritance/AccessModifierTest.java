package com.week4.OOP_Inheritance;

public class AccessModifierTest {

	int id=101;//default
	public String name="Akhil";
	private long phno=9887776665L;
	protected int acno=876699;
	
	
	public static void main(String[] args)
	{
		// Same class
		
		 AccessModifierTest a1=new  AccessModifierTest();
		 System.out.println(a1.id);
		 System.out.println(a1.name);
		 System.out.println(a1.phno);
		 System.out.println(a1.acno);
	}

}
