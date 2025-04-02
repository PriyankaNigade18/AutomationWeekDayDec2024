package com.TestNG.DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData
{
	public XSSFWorkbook wb;

	@DataProvider(name="loginData")
	public Object[][] testData()
	{
		Object data[][]= {{"Admin","admin123"},{"Pooja","test123"},{"Admin","admin123"},{"Sarang","test123"}};
		return data;
	}
	
	
	@DataProvider(name="excelFile")
	public Object[][] excelFileReading()
	{
		//file address
		  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
		  
		  //in stream read data
		  FileInputStream fs;
		  Object data[][]=null;
		  
		try {
			fs = new FileInputStream(f1);
			
			//Excel--->wb-->sheet-->row--->cell--->data
			  
			 
			   wb=new XSSFWorkbook(fs);
			  
			  //Number of rows from the file
			  int rows=wb.getSheet("UserData").getPhysicalNumberOfRows();
			  System.out.println("Total Rows are: "+rows);//6
			  
			  //Number of Columns from the file
			  int cells=wb.getSheet("UserData").getRow(0).getPhysicalNumberOfCells();
			  System.out.println("Number of Cells are: "+cells);
			  
			  //create an array of same size like file
			   data=new Object[rows-1][cells];//5
			  
			  //iterate array and read data from file and store it into array
			  for(int r=1;r<rows;r++)//rows
			  {
				  
				  for(int c=0;c<cells;c++)//cells
				  {
					  //array always start with 0th index
					  data[r-1][c]=wb.getSheet("UserData").getRow(r).getCell(c).getStringCellValue();
					 
				  }
				 
			  }
			  
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  return data;
		  
	}
	
	
}
