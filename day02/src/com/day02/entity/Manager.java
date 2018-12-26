package com.day02.entity;

public class Manager extends Employee{
	
	

	private double bonus;
	
	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		bonus=0;
	}//必须定义构造方法 且与父类构造方法一致 对类的属性进行初始化

	public double getSalary()
	{
		double baseSalary=super.getSalary();
		return baseSalary+bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	
	

}
