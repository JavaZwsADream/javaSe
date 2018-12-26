package com.day03.clone;

public class CloneTest {

	
	public static void main(String[] args) {
		
		Employee orignal = new Employee("john", 3000);
		orignal.setHireDay(2008, 10, 11);
		try {
			Employee copy = orignal.clone();
			copy.raiseSalary(100);
			copy.setHireDay(2012, 12, 1);
			System.out.println("orignal="+orignal);
			System.out.println("copy="+copy);
			
		} catch (CloneNotSupportedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
