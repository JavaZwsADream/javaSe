package com.day02.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	
	
	private String name;
	
	private double salary;
	
	private LocalDate hireDay;
	
	
	public Employee(String name,double salary,int year,int month,int day)
	{
		
		this.name=name;
		
		this.salary=salary;
		
		hireDay=LocalDate.of(year, month, day);
		
	}


	public String getName() {
		return name;
	}


	public double getSalary() {
		return salary;
	}


	public LocalDate getHireDay() {
		return hireDay;
	}
	
	public void raiseSalary(double byPercent)
	{
		
		double raise=salary*byPercent/100;
		salary+=raise;
	}
	
	private void syso1()
	{
		
		System.out.println("不给子类调用");
	}


	@Override
	public int hashCode() {
		// TODO 自动生成的方法存根
//		return 7*name.hashCode()+11*new Double(salary).hashCode()+13*hireDay.hashCode();
//		return 7*Objects.hashCode(name)+11*Double.hashCode(salary)+13*Objects.hashCode(hireDay);
		return Objects.hash(name,salary,hireDay);

	}


	@Override
	public String toString() {
		return  getClass().getName()+" [name=" + name + ", salary=" + salary + ", hireDay=" + hireDay + "]";
	}
	

}
