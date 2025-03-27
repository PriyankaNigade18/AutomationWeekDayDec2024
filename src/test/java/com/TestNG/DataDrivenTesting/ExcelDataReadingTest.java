package com.TestNG.DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class ExcelDataReadingTest {
  @Test
  public void testFileReading() throws IOException 
  {
	  //file address
	  File f1=new File(System.getProperty("user.dir")+"//TestData//Data.xlsx");
	  
	  //in stream read data
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //Excel--->wb-->sheet-->row--->cell--->data
	  
	 
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  //Number of rows from the file
	  int rows=wb.getSheet("UserData").getPhysicalNumberOfRows();
	  System.out.println("Total Rows are: "+rows);//6
	  
	  //Number of Columns from the file
	  int cells=wb.getSheet("UserData").getRow(0).getPhysicalNumberOfCells();
	  System.out.println("Number of Cells are: "+cells);
	  
	  //create an array of same size like file
	  Object data[][]=new Object[rows-1][cells];//5
	  
	  //iterate array and read data from file and store it into array
	  for(int r=1;r<rows;r++)//rows
	  {
		  
		  for(int c=0;c<cells;c++)//cells
		  {
			  //array always start with 0th index
			  data[r-1][c]=wb.getSheet("UserData").getRow(r).getCell(c).getStringCellValue();
			  System.out.print(data[r-1][c]+"   ");
		  }
		  System.out.println();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 /* //single data reading
	String value=wb.getSheet("UserData").getRow(2).getCell(0).getStringCellValue();
	  
	 System.out.println(value);
	 
	  /*XSSFSheet sheet1=wb.getSheet("UserData");
	  XSSFRow row5=sheet1.getRow(4);
	  XSSFCell cell0=row5.getCell(0);
	 String value= cell0.getStringCellValue();
	  
	  System.out.println("File value at row 5 and cell 1 is: "+value);
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
