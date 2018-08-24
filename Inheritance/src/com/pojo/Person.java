package com.pojo;

import java.util.Scanner;

public class Person {

	private int age;
	private String name;

	public void display() {
		System.out.println("name:" + name + "\tage:" + age);

	}

	public Person() {
		age = 99;
		name = "SteveRogers";
	}

	public Person(int age, String name) {
		this.age = age;
		this.name = name;

	}
	/*
	 * public void setAge(int a) { age = a; }
	 */

	public int getAge() {
		return age;
	}

	public void setAge(int age) 
	{
		
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name)
	{
		
		this.name = name;
		
	}
	
	public void getPersonData()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter age : " );
		
		age = s.nextInt();
		System.out.println("enter name : " );
		
		name = s.next();
		
	}

	@Override
	public String toString() 
	{
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	

}
