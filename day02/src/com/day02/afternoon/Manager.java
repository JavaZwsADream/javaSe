package com.day02.afternoon;

public class Manager extends Employee{
	
	
	
	private double bonus;
	
	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		this.bonus=0;
	}
    
       public double getSalary()
       {
    	   
    	   return super.getSalary()+bonus;
       }

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public int hashCode() {
		return super.hashCode()+17*Double.hashCode(bonus);
	}

	@Override
	public String toString() {
		return  super.toString()+"[bonus=" + bonus + "]";
	}
    
       
       
}
