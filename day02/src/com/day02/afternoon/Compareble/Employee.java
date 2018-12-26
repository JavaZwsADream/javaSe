package com.day02.afternoon.Compareble;

public class Employee implements Comparable<Employee>{

	
	private String name;
	private double salary;
	
	
	public Employee(String name, double salary) {
	
		this.name = name;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public double getSalary() {
		return salary;
	}
    public void raiseSalary(double Bypercent) {
    	
    	double raise=salary*Bypercent/100;
    	salary+=raise;
    }
    

	@Override
	public int compareTo(Employee o) {
		// TODO 自动生成的方法存根
		return Double.compare(salary, o.salary);
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee("zws", 2300);
		Employee e2=new Employee("zdd", 3000);
		if(e1.compareTo(e2)>0)
			System.out.println("e1>e2");
		else if(e1.compareTo(e2)==0)
			System.out.println("e1=e2");
		else
			System.out.println("e1<e2");
	}

}
