package com.week4.OOP_Encapsulation;

public class Book 
{
	private int pageNo;
	
	public void setPageNo(int pageNo)
	{
		if(pageNo>0 && pageNo<=200)
		{
			System.out.println("Page for this pageNumber "+pageNo+" is available: ");
			this.pageNo=pageNo;
		}else
		{
			System.out.println("Invalid pageNumber: "+pageNo);

		}
	}
	
	public int getPageNo()
	{
		return pageNo;
	}

}
