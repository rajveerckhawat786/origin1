package com.pojo;

import java.util.Scanner;

public class Employee extends Person 
{
	private double empSalary;
	private int empId;
	
	public Employee() 
	{
		// TODO Auto-generated constructor stub
		
		empId = 0;
		empSalary = 1000;
	}
	
	public Employee(int empId,double empSalary,int age,String name)
	{
	
		super(age,name);
		this.empId = empId;
		this.empSalary = empSalary;
		
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void getEmpData()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter empId : " );
		
		this.empId = s.nextInt();
		
		
		System.out.println("enter empSalary : " );
		
		this.empSalary = s.nextDouble();
		
		
	}
	public void display(int x)
	{
		super.display();
		System.out.println("empId : " + empId+"\t"+  "empSalary : " +empSalary + "\t" );
		
	}
	

	@Override
	public String toString() 
	{
		
		return "Employee [empSalary=" + empSalary + ", empId=" + empId+ "\t" + super.toString()+"]";
	}
	

}
