package com.Generic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility
{
	public static void selectBasedDropdown(WebElement ele,String value)
	{
		 //select class object
		  Select dd=new Select(ele);
		  
		  System.out.println("Is dropdown supports multiple selection?: "+dd.isMultiple());
		  
		  //get the all options
		  List<WebElement> allOptions=dd.getOptions();
		  System.out.println("Total Options are: "+allOptions.size());
		  
		  
		  for(WebElement i:allOptions)
		  {
			  System.out.println(i.getText());
			  if(i.getText().contains(value))
			  {
				  System.out.println("Option found.....");
				  i.click();
				  break;
				  
			  }
		  }
	}

}
