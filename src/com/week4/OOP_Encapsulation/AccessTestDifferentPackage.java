package com.week4.OOP_Encapsulation;

import com.week4.OOP_Inheritance.AccessModifierTest;

public class AccessTestDifferentPackage extends AccessModifierTest{

	public static void main(String[] args) 
	{
		AccessModifierTest t1=new AccessModifierTest();
		System.out.println(t1.name);
		
		
		//Protected data call by using child class
		AccessTestDifferentPackage a1=new AccessTestDifferentPackage();
		System.out.println(a1.acno);
	}

}
