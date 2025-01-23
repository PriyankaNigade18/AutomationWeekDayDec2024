package com.week4.OOP_Inheritance;

public class TestCar {

	public static void main(String[] args)
	{
		System.out.println("Child ref and Child Object");
		BMW b1=new BMW();
		b1.start();//inherited
		b1.refule();//inherited
		b1.stop();//inherited
		b1.autoEngine();//individual
		b1.breakFeature();
		//child ref and child oject
		
		Audi a1=new Audi();
		a1.start();//inherited
		a1.refule();//inherited
		a1.stop();//inherited
		a1.autoGear();//individual
		a1.breakFeature();
		
		System.out.println("Parent ref and Parent Object");

		Car c1=new Car();
		c1.start();//individual
		c1.refule();//individual
		c1.stop();//individual
		c1.breakFeature();
		
		Vehical v1=new Vehical();
		v1.breakFeature();

		System.out.println("Parent ref and Child Object");
		
		Car c2=new BMW();
		c2.start();//individual
		
		c2.refule();//individual
		
		c2.stop();//individual
		c2.breakFeature();
		
		Car c3=new Audi();
		c3.start();
		c3.refule();
		c3.stop();
		c3.breakFeature();
		
		
		
		
		

	}

}
