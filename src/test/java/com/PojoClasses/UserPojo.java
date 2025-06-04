package com.PojoClasses;

public class UserPojo
{
	/*
	 * what is POJO
	 * -----------------
	 * POJO is plain old java object
	 * It is class which follows encapsulation principle
	 * data private + public method(getter and setter)
	 * 
	 * 
	 * {
    	"name": "morpheus",
    	"job": "leader"
		}
	 * 
	 */

	
	private String name;
	private String job;
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getJob()
	{
		return job;
	}
	public void setJob(String job)
	{
		this.job = job;
	}
	
	
	
	
	
	
	
	
	
}
