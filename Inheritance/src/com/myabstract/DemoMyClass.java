package com.myabstract;
import java.util.Scanner;

import com.pojo.Employee;

//import com.pojo.Employee;

public class DemoMyClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		EmployeeIO empIO = new EmployeeIO() 
		{
			public Employee readEmployee() 
			{
				// TODO Auto-generated method stub
				
				Scanner s = new Scanner(System.in);
				System.out.println("enter empId : " );
				
				int empId = s.nextInt();
				
				
				System.out.println("enter empSalary : " );
				
				double salary = s.nextDouble();
				System.out.println("enter age : " );
				
				int age = s.nextInt();
				System.out.println("enter name : " );
				
				String name = s.next();
				Employee e = new Employee(empId,salary,age,name);
				return e;
				
				
			}
			public void writeEmployee(Employee employee)
			{
				System.out.println(employee.toString());
			}

		};
		empIO.writeEmployee(empIO.readEmployee());
		

	}

}
