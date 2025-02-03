package com.week5_CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo3_Types {
	/*
	 * ArrayList is class implements List interface
	 * ArrayList underline data structure is Dynamic array
	 * ArrayList is order collection,is based on indexing
	 * Duplication allowed
	 * It is non synchronize
	 * Default capacity for ArrayList is 10
	 * Frequent operation is data retrieval
	 */
	public static void main(String[] args)
	{
		//list of locations
		ArrayList<String> loc=new ArrayList<String>();
		loc.add("Pune");
		loc.add("Satara");
		loc.add("Mumbai");
		loc.add("Nagpur");
		
		System.out.println(loc);
		System.out.println("Total locations are: "+loc.size());
		
		System.out.println("**********************");
		
		ArrayList<Double> marks=new ArrayList<Double>();
		marks.add(78.66);
		marks.add(56.66);
		marks.add(88.67);
		
		System.out.println("Total Marks: "+(marks.get(0)+marks.get(1)+marks.get(2)));
		
		System.out.println("Total Student marks: "+marks.size());//3
		
		System.out.println(marks);
		System.out.println("**********************");

		ArrayList<Object> stdData=new ArrayList<Object>();
		
		stdData.add("Sarang");
		stdData.add("Pune");
		stdData.add('M');
		stdData.add(30);
		stdData.add(787655444L);
		
		System.out.println(stdData);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
