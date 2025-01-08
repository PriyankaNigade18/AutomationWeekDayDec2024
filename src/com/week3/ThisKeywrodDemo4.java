package com.week3;

public class ThisKeywrodDemo4
{
	//this can be passed as an argument in the method call.

	int id=101;
	
	public void show(StudentDetails s)
	{
		System.out.println("This is show() calling!");
		s.display();
		//Method call using this keyword
		show2(this);
	}
	
	public void show2(ThisKeywrodDemo4 t)
	{
		System.out.println("Id is: "+id);
	}
	public static void main(String args[])
	{
		ThisKeywrodDemo4 t1=new ThisKeywrodDemo4();
			//t1.show2(t1);
			
		StudentDetails s1=new StudentDetails(102,"Seema");
		//method call by passing object
		t1.show(s1);
		
		
		
		
		
		
	}

}
