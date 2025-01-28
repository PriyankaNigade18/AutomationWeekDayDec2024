package com.week4.OOP_DataAbstraction;

public class TestHospital {

	public static void main(String[] args)
	{
		//child class ref and child class object
		
		NobleHs h1=new NobleHs();
		h1.medical();//individual
		h1.cardio();//inherited abstract method
		h1.dental();//inherited abstract method
		h1.nero();//inherited abstract method
		h1.physio();//inherited abstract method
		h1.covid19Test();//inherited abstract method
		
		System.out.println("***********************");
		
		//parent ref(IMA) and child object
		IMA i1=new NobleHs();
		i1.cardio();
		i1.dental();
		i1.covid19Test();
		System.out.println("***********************");

		//parent ref(USMA) and child object
		USMA u1=new NobleHs();
		u1.nero();
		u1.physio();
		u1.covid19Test();

		
		
		
		
	}

}
