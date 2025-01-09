package com.week3.ControlFlowStatement;

public class MethodChaining
{
	
	//method--->object
	public MethodChaining start()
	{
		System.out.println("Application start");
		return this;
	}
	
	
	public MethodChaining run()
	{
		System.out.println("Application run");
		return this;
	}
	
	public void stop()
	{
		System.out.println("Application stop");
	}
	
	

	public static void main(String[] args) {
		
		MethodChaining obj=new MethodChaining();
		
		obj.start().run().stop();
		
		//obj.start().run().stop();
		//obj.run();

	}

}
