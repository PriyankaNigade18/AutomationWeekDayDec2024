package com.week1;

public class StudentData 
{
	
	//data
	int id;
	String name;
	
	//method/function
	public void display()
	{
		System.out.println("Student id is: "+id);
		System.out.println("Student name is: "+name);
	}
	
	public static void main(String args[])
	{
		
// to call member of a class we need object
		StudentData s1=new StudentData();
		//s1.display();
		s1.id=101;
		s1.name="Yash";
		s1.display();
		
		
		System.out.println("***************************");
		StudentData s2=new StudentData();
		//s2.display();
		s2.id=102;
		s2.name="smita";
		s2.display();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
