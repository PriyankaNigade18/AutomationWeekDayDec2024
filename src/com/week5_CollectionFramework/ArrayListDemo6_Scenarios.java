package com.week5_CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo6_Scenarios {
	/*
	 * ArrayList is class implements List interface
	 * ArrayList underline data structure is Dynamic array
	 * ArrayList is order collection,is based on indexing
	 * Duplication allowed
	 * It is non synchronize
	 * Default capacity for ArrayList is 10
	 * Frequent operation is data retrieval
	 * Iteration
	 * ===============
	 * 1.using for loop
	 * 2.using for each loop
	 * 3.iterator()
	 */
	public static void main(String[] args)
	{
		
		//Arrays class
		
		List<Integer> l1=Arrays.asList(10,20,30);
		
		
		
		System.out.println("List 1: "+l1);
		
			
		List<Integer> l2=Arrays.asList(40,50);
		System.out.println("List 2: "+l2);
		
		
		List<List<Integer>> finalList=new ArrayList<List<Integer>>();
		finalList.add(l1);
		finalList.add(l2);
		
		System.out.println(finalList);
		
		/*
		 * Using constructor we can add new list
		 * Using addAll()
		 */
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		System.out.println("arrayList 1: "+list1);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(400);
		list2.add(500);
		list2.add(600);
		System.out.println("arrayList 2: "+list2);
		
		
		
		ArrayList<Integer> list3=new ArrayList<Integer>(list1);
		list3.addAll(list2);
		list3.add(800);
		list3.add(900);
		
		
		System.out.println(list3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
