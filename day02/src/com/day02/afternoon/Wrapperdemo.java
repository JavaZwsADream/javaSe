package com.day02.afternoon;

public class Wrapperdemo {
	
	public static double max(double...values)
	{
		
		double largest=0;
		
		for (double d : values) {
			if(d>largest)
				largest=d;
			
		}
		return largest;
	}

	public static void main(String[] args) {
		double m=max(3.1,40.4,2.5);
		System.out.println(m);
	}
}
