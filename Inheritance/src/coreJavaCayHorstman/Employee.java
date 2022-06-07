package coreJavaCayHorstman;

import java.time.LocalDate;

public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	//constructor with parameters.
	public Employee(String name, double salary, int year, 
					int month, int day) 
	{
	//There is no "this" on hireday because the hireday instance variable has a
	//diff name from the parameters year, month and day. But note that
	//instance variables name and salary and their parameters are the same. 	
		this.name = name;
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
	}

	//Getter Method to get name. (This is because name is private)
	public String getName() 
	{
		return name;
	}
	
	//Getter Method to get salary
	public double getSalary() 
	{
		return salary;
	}
	
	//Getter Method to return hire date.
	public LocalDate getHireDay() 
	{
		return hireDay;
	}
	
	//Method to raise salary. Wondering why not in constructor
	//May be because it is defined in terms of salary which is in constructor.
	public double raiseSalary(double byPercent) 
	{
	double raise = salary*byPercent/100;
	return salary += raise;
	}
}
