package com.week5_CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo1 {
	/*
	 * ArrayList is class implements List interface
	 * ArrayList underline data structure is Dynamic array
	 * ArrayList is order collection,is based on indexing
	 * Duplication allowed
	 * It is non synchronize
	 * Default capacity for ArrayList is 10
	 */
	public static void main(String[] args)
	{
		//non Generic 1.not a type safe 2.type casting is required
		/*
		ArrayList l1=new ArrayList();
		l1.add(100);
		l1.add("Priyanka");
		l1.add(88.77);
		l1.add('P');
		
		System.out.println(l1);
		
		int num=(int)l1.get(0);
		System.out.println(num);
		
		*/
		
		/*ArrayList is a raw type. References to generic type ArrayList<E> should be 
		 parameterized
		*/
			
		
		//Generic 1.Type safe 2.no type casting required
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(567);
		al.add(67);
		al.add(22);
		al.add(88);
		al.add(22);
		
		System.out.println(al);
		
		int num=al.get(0);
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
