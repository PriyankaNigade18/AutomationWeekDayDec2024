package com.week3;

public class ThisKeywordDemo2 {

	//this can be used to invoke current class method (implicitly)

	public void startBrowser()
	{
		System.out.println("Broswer started!");
		this.launchApplication();
		//launchApplication();
	}
	
	public void launchApplication()
	{
		System.out.println("Application started!");
		this.stopBrowser();
	}
	
	
	public void stopBrowser()
	{
		System.out.println("Broswer stopped!");
	}
	public static void main(String[] args)
	{
		ThisKeywordDemo2 t1=new ThisKeywordDemo2();
		t1.startBrowser();
		

	}

}
