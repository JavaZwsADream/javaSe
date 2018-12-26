package com.day02.abstractdemo;

public class PersonTest {
	
	public static void main(String[] args) {
		
		
		Person[] person=new Person[2];
		person[0]=new Employee("zws", 3500, 1997, 10, 16);
		person[1]=new Student("zz", "computer science");
		for (Person person2 : person) {
			System.out.println("name="+person2.getName()+" description="+person2.getDescription());
		}
		
	}

}
