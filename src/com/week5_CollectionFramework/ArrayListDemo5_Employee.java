package com.week5_CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo5_Employee {

	
	
	
	
	public static void main(String[] args)
	{
		//create object for Employee class
		
		Employee e1=new Employee(101,"Seema");
		Employee e2=new Employee(102,"Rohit");
		Employee e3=new Employee(103,"Kimaya");
		Employee e4=new Employee(104,"Jay");
		Employee e5=new Employee(105,"Sumit");
		
		
		//create list of these employee
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		//System.out.println(list);
		
		for(Employee i:list)
		{
			System.out.println(i.id+" : "+i.name);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
