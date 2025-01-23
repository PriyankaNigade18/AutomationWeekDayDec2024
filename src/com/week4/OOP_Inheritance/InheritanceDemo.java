package com.week4.OOP_Inheritance;


class A{
	
	public void m1()
	{

		System.out.println("M1 is calling!");
	}
}

class B extends A//A is parent and B is child- Single level
{
	
	public void m2()
	{

		System.out.println("M2 is calling!");
	}
}

class C extends B//B is parent and C is child: Multilevel inheritance
{
	public void m3()
	{

		System.out.println("M3 is calling!");
	}
}

class D extends A//A is parent and D and B are Child:Heirarchical Inheritance
{
	public void m4()
	{

		System.out.println("M4 is calling!");
	}
}



public class InheritanceDemo {

	public static void main(String[] args)
	{
		System.out.println("Child class ref and child class object : parent+Child");
//		B b1=new B();
//		b1.m1();//inherited
//		b1.m2();//individual
		
		//multilevel C--->B--->A
		
//		C c1=new C();
//		c1.m1();//inherited
//		c1.m2();//inherited
//		c1.m3();//individual
		
		//Heirarchical  A is parent and B, D are child
		
		D d1=new D();
		d1.m1();//inherited
		d1.m4();//individual
		
		
		System.out.println("parent class ref and parent class object : parent");
//		A a1=new A();
//		a1.m1();//individual
		//multilevel C--->B--->A
		
//		B b1=new B();
//		b1.m1();//inherited
//		b1.m2();//individual
		
		A a1=new A();
		a1.m1();//individual
		
		System.out.println("Parent class ref and child class object: Parent");
		
//		A a2=new B();
//		a2.m1();//individual
		//multilevel C--->B--->A
//		B b2=new C();
//		b2.m1();//inherited
//		b2.m2();//individual
		
		//Heirarchical
		A a2=new D();
		a2.m1();
		
		
		System.out.println("Child class ref and Parent class object: Invalid");
		//B b2=new A();
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		

	}

}
