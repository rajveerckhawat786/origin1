package com.pojo;

import java.util.Arrays;

public class Student 
{
	private String name;
	private int[] marks;
	int rollNo;

	public Student()
	{
		name = "CrimeMasterGogo";
		marks=new int[5];
		Arrays.fill(marks, 101);
		rollNo = 0;
	}
	public Student(String name,int[] marks,int rollNo)
	{
		this.name = name;
		this.marks = marks;
		this.rollNo = rollNo;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void display()
	{
		System.out.println(name + "\t"+ rollNo +"\t");
		for(int x:marks)
		{
			System.out.print(x+"  ");
		}
	}
	
	
}
