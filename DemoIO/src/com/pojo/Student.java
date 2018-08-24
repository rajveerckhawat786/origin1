package com.pojo;

public class Student
{
	private String name;
	private int marks;
	
	Student()
	{
		name = "qwerty";
		marks = 100;
	}
	
	Student(String name,int marks)
	{
		this.name = name;
		this.marks = marks;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
