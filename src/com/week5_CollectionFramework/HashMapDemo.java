package com.week5_CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	/*
	 * HashMap is class implement Map interface
	 * underline data structure is HashTable
	 * HashMap key should be unique and values duplication allows
	 * HashMap where to insert element we use put() 
	 * to get the element we get()
	 * 
	 * Entry is interface in Map 
	 * Any <Key,value> pair object is Entry
	 * 
	 */
	public static void main(String[] args) 
	{
		
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("VimanNagar",411047);
		hm.put("Kharadi",411044);
		hm.put("Lohegaon",411047);
		hm.put("Whagoli",411045);
		hm.put("Wadgaosheri",411014);
		
		System.out.println("Is map empty?: "+hm.isEmpty());
		System.out.println("Total elements: "+hm.size() );
		System.out.println(hm);
		
		System.out.println("look for 411047?: "+hm.containsValue(411047));
		System.out.println("look for Kharadi?: "+hm.containsKey("Kharadi"));
		
		hm.remove("Whagoli");
		System.out.println(hm);
		
		System.out.println("*************for each loop*******************");
		
		for(Entry<String,Integer> ir:hm.entrySet())
		{
			//System.out.println(ir.getKey());
			//System.out.println(ir.getValue());
			System.out.println(ir.getKey() +" : "+ir.getValue());
		}
		
		
		System.out.println("**************Using iterator()****************");
		
		/*
		 * Convert Map into Set then apply iterator()
		 */
		
		Set<Entry<String,Integer>> set=hm.entrySet();
		
		Iterator<Entry<String,Integer>> i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
