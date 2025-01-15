package com.week3.ControlFlowStatement;

public class BranchingStatements 

{
	
	
	
	public String info()
	{
		String msg="Hello All!";
		return msg;
	}
	
	

	public static void main(String[] args)
	{

		//break: exit from loop or switch body
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("Done!");
		
		System.out.println("********************************");
		
		//continue - will skip certain part of the code and continue iteration
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}else
			{
				System.out.println(i);
			}
		}
		
		BranchingStatements  b1=new BranchingStatements ();
		//calling
		String res=b1.info();
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
