package com.day02.entity;

import java.util.ArrayList;

public class ManagerTest {
	
	
	public static void main(String[] args) {
		
		
		Manager boss=new Manager("GuBingBing", 8000, 1987, 12, 15);
		boss.setBonus(2000);
		ArrayList<Employee> staff=new ArrayList<Employee>();
	    staff.add(boss);
	    staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
	    staff.add(new Employee("Tommy Tester", 40000, 1990, 3, 15)) ;
	    System.out.println(staff.remove(2));
	    for (Employee employee : staff) {
			System.out.println(employee.getName());
		}
	}

}
