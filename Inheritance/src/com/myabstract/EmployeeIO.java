package com.myabstract;
import com.pojo.Employee;

public interface EmployeeIO 
{
	double PI = 3.14;
	public static final String NAME = "mogambo";
	
	Employee readEmployee();
	abstract public void writeEmployee(Employee employee);
}
