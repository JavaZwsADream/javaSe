package com.day02.abstractdemo;

public class Student extends Person{
	
	
	private String major;

	public Student(String name, String major) {
		super(name);
		this.major = major;
	}

	@Override
	public String getDescription() {
		// TODO 自动生成的方法存根
		return "a student major in "+major;
	}
	
//	public Student(String name,String major)
//	{
//		super(name);
//		this.major=major;
//	}

	
	
}
