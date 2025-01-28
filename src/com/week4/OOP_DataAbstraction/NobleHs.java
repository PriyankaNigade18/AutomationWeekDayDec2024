package com.week4.OOP_DataAbstraction;

//Multiple inheritance in java
public class NobleHs implements IMA,USMA
{

	public void medical()
	{
		System.out.println("NobleHs......Medical service()");
	}

	@Override
	public void cardio() {
		System.out.println("NobleHs....Cardio service()");
		
	}

	@Override
	public void dental() {
		System.out.println("NobleHs...... dental service()");
		
	}

	@Override
	public void nero() {
		
		System.out.println("NobleHs...... nero service()");

	}

	@Override
	public void physio() {
		System.out.println("NobleHs...... physio service()");

		
	}

	@Override
	public void covid19Test() {
		System.out.println("NobleHs...... Covid19Test service()");

		
	}
}
