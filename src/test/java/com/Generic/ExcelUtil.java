package com.Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public static XSSFWorkbook wb;
	
	public static Object[][] getSheetData(String sheetname)
	{
		
		 Object data[][]=null;
		//load the file
		  File f1=new File("./"+"\\TestData\\Data.xlsx");
		
		FileInputStream fs;
		
		try {
			fs=new FileInputStream(f1);
			 //file--->workbook
			 wb=new XSSFWorkbook(fs);
			//wb-->sheet-->row-->cell-->data
			  
			  //Number of rows
			  int rows=wb.getSheet(sheetname).getPhysicalNumberOfRows();
			  
			  //Number of columns
			  int cells=wb.getSheet(sheetname).getRow(0).getPhysicalNumberOfCells();
			  
			 //create an array as per size of excel file total rows=7 read=6
			 data=new Object[rows-1][cells];
			  
			  //read data from file and store it into array
			  for(int i=1;i<rows;i++)//rows-ignore heading
			  {
				  for(int j=0;j<cells;j++)//cells
				  {
					  //array index always start with 0
					  //data[i-1][j]=wb.getSheet(sheetname).getRow(i).getCell(j).getStringCellValue();
					  //System.out.print(data[i-1][j]+" ");
					  
					  data[i-1][j]=getDataAsPerType(sheetname,i,j);
				  }
				  System.out.println();
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
	
	public static String getDataAsPerType(String sheetname,int row,int cell)
	{
		XSSFCell cells=wb.getSheet(sheetname).getRow(row).getCell(cell);
		String data="";
		
		if(cells.getCellType()==CellType.STRING)
		{
			data=cells.getStringCellValue();
		}else if(cells.getCellType()==CellType.NUMERIC)
		{
			int dd=(int) (cells.getNumericCellValue());
			
			data=String.valueOf(dd);
			
		}else if(cells.getCellType()==CellType.BLANK)
		{
			data=" ";
		}
		return data;
	}
	
	public static String getData(String sheetname,int row,int cell)
	{
		FileInputStream fs;
		XSSFWorkbook wb;
		XSSFCell cells=null;
		String data="";
		try {
		File f1=new File("./"+"\\TestData\\Data.xlsx");
		 fs=new FileInputStream(f1);
		wb=new XSSFWorkbook(fs);
		cells=wb.getSheet(sheetname).getRow(row).getCell(cell);
		
		if(cells.getCellType()==CellType.STRING)
		{
			data=cells.getStringCellValue();
		}else if(cells.getCellType()==CellType.NUMERIC)
		{
			int dd=(int) (cells.getNumericCellValue());
			
			data=String.valueOf(dd);
			
		}else if(cells.getCellType()==CellType.BLANK)
		{
			data=" ";
		}		
		}catch(Exception e)
		{
			
		}
		
		return data;
	}

}
