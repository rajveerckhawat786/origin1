package com.pojo;

import java.util.Scanner;

public class Manager extends Employee 
{
	private String dpt;
	private int inct;
	
	public Manager() 
	{
		// TODO Auto-generated constructor stub
		dpt = "nothing";
		inct = 0;
		
	}

	public String getDpt() {
		return dpt;
	}

	public void setDpt(String dpt) {
		this.dpt = dpt;
	}

	public int getInct() {
		return inct;
	}

	public void setInct(int inct) {
		this.inct = inct;
	}
	
	public void getMgrData()
	{
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("enter department : " );
		
		this.dpt = s.next();
		
		System.out.println("enter incentives : ");
		
		this.inct = s.nextInt();		
	}

	@Override
	public String toString() {
		return "Manager [dpt=" + dpt + ", inct=" + inct +"\t" + super.toString()+ "]";
	}
	
	
	
}
