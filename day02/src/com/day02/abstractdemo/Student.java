package com.day02.abstractdemo;

public class Student extends Person{
	
	
	private String major;

	public Student(String name, String major) {
		super(name);
		this.major = major;
	}

	@Override
	public String getDescription() {
		// TODO �Զ����ɵķ������
		return "a student major in "+major;
	}
	
//	public Student(String name,String major)
//	{
//		super(name);
//		this.major=major;
//	}

	
	
}
