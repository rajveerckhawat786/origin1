package com.pojo;

import java.util.Scanner;
import java.util.Arrays;

public class Test 
{

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		Student s1;
		s1 = new Student();
		
		Student s2;
		s2 = new Student();
		
	
		Scanner s = new Scanner(System.in);
		System.out.println("enter name ");
		s2.setName(s.next()); 
		
		System.out.println("enter roll number ");
		s2.setRollNo(s.nextInt());
		
		System.out.println("enter marks :  ");
		int[] marks;
		marks = new int[5];
		for(int i = 0;i<5;i++)
		{
			marks[i] = s.nextInt();
		}
		s2.setMarks(marks);
		s1.display();
		s2.display();
		
		
		
		

	}

}
