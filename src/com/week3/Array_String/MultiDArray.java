package com.week3.Array_String;

public class MultiDArray 
{
	
	
	
	
	public static void main(String args[])
	{
		
		//using new keyword
		int sid[][]=new int [2][3];
		sid[0][0]=10;
		sid[0][1]=20;
		sid[0][2]=30;
		
		sid[1][0]=40;
		sid[1][1]=50;
		sid[1][2]=60;
		
		System.out.println("Number of Rows: "+sid.length);//2
		System.out.println("Number of columns: "+sid[0].length);//3
		
		//single data
		System.out.println(sid[1][0]);//40
		
		System.out.println(sid[0][2]);//30
		
		//System.out.println(sid[2][1]);//ArrayIndexOutOfBoundsException
		
		
		System.out.println("**************Iteration using for loop************");
		
		for(int r=0;r<sid.length;r++)
		{
			for(int c=0;c<sid[r].length;c++)
			{
				System.out.print(sid[r][c]+" ");
			}
			System.out.println();
		}
		
		System.out.println("***********Using for each loop************ ");
		
		for(int i[]:sid)//[10,20,30]
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
		
		System.out.println("*************************************");
		
		
		//multi d array using literal
		
		int data[][]= {{100,200},{300,400},{500,600},{700,800}};
		
		System.out.println("Number of Rows: "+data.length);//4
		System.out.println("Number of columns: "+data[0].length);//2
		
		System.out.println(data[2][1]);//600
		
		System.out.println("*****************For loop**********************");
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		System.out.println("*****************For each loop**********************");

		for(int i[]:data)
		{
			for(int j:i)
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
		
		
		
	}

}
