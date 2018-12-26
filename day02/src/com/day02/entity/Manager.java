package com.day02.entity;

public class Manager extends Employee{
	
	

	private double bonus;
	
	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		bonus=0;
	}//���붨�幹�췽�� ���븸�๹�췽��һ�� ��������Խ��г�ʼ��

	public double getSalary()
	{
		double baseSalary=super.getSalary();
		return baseSalary+bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	
	

}
