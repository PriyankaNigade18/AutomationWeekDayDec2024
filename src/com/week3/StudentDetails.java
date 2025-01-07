package com.week3;

public class StudentDetails 
{
	int id;
	String name;
	
	StudentDetails(int i,String n)
	{
		id=i;
		name=n;
	}
	
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
	}

	public static void main(String[] args) 
	{
		StudentDetails s1=new StudentDetails(101,"Kiran");
		s1.display();
		StudentDetails s2=new StudentDetails(102,"Amit");
		s2.display();
		StudentDetails s3=new StudentDetails(103,"Reena");
		s3.display();
		StudentDetails s4=new StudentDetails(104,"Neelam");
		s4.display();
		

	}

}
