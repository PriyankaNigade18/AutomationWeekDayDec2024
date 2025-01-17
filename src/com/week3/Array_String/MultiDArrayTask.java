package com.week3.Array_String;

public class MultiDArrayTask {

	public static void main(String[] args)
	{
		 Object data[][]= {{"Username","Password"},{"Admin","admin123"},{"Sunita","test123"},{"Amit","test123"},{"sudha","test123"}};
		 
		 System.out.println("Number of rows: "+data.length);
		 System.out.println("Number of columns: "+data[0].length);
		 
		 System.out.println("******Iteration using for loop***********");
		 
		 for(int r=1;r<data.length;r++)
		 {
			 for(int c=0;c<data[r].length;c++)
			 {
				 System.out.print(data[r][c]+"\t");
			 }
			 System.out.println();
		 }
		 
		 System.out.println("******Iteration using foreach loop***********");

		 for(Object i[]:data)
		 {
			 for(Object j:i)
			 {
				System.out.print(j+"   "); 
			 }
			 System.out.println();
		 }
		 

	}

}
