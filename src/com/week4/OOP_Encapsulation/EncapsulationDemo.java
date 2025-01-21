package com.week4.OOP_Encapsulation;


class Employee
{
	//Encapsulation=private data +public method
	private int id=101;
	private String name="Sarang";
	private int salary=78000;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public void show()
	{
		System.out.println("Employee details are:");
		System.out.println("Employee id: "+id);
		System.out.println("Employee name: "+name);
		System.out.println("Employee salary: "+salary);
	}
}



public class EncapsulationDemo {

	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.show();
		//e1.id=201;
		//e1.name="Sara";
		e1.setId(201);
		e1.setName("Sarang sharma");
		e1.setSalary(90000);
		System.out.println(e1.getId()+" : "+e1.getName()+" : "+e1.getSalary());
		e1.show();

	}

}
