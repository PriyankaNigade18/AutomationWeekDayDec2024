package com.week4.OOP_Inheritance;



//final class Demo2
class Demo2
{
	final int id=101;
	
	public final void color()
	{
		
		System.out.println("Yellow");
	}
	
	int r=5;

	final float pi=3.14f;
 //pi=3.20f;//The final local variable pi cannot be assigned.
	
	public final void areaOfCircle(float pi,int r) 
	{
		float area=pi*r*r;
		System.out.println("Area of circle: "+area);
	}
	
}
//The type FinalDemo cannot subclass the final class Demo2
public class FinalDemo extends Demo2
{
//	@Override
//	public void color()
//	{
//		
//		System.out.println("Yellow");
//	}
//	@Override
//	public final void areaOfCircle(float pi,int r) 
//	{
//		float area=pi*r*r;
//		System.out.println("Area of circle: "+area);
//	}
	public static void main(String[] args)
	{

		FinalDemo f1=new FinalDemo();
		System.out.println(f1.id);
		f1.color();
		
		f1.areaOfCircle(f1.pi,5);

	}

}
