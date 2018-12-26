package com.day02.afternoon.enumDemo;

import java.util.Scanner;

public class EnumTest {

	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
		String input=scanner.next().toUpperCase();
		System.out.println("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
		String input1=scanner.next().toUpperCase();
		Size size=Enum.valueOf(Size.class, input);
		Size size1=Enum.valueOf(Size.class, input1);
		System.out.println(size.compareTo(size1));
		System.out.println(size);
		System.out.println("abbreviation="+size.getAbbreviation());
		if(size==Size.EXTRA_LARGE)
		{
			System.out.println("Good Job you paid attention to_.");
		}
	}
	
	
	enum Size{
		
		
		SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
		
		private Size(String abbreviation)
		
		{
			this.abbreviation=abbreviation;
		}
		private String abbreviation;
		public String getAbbreviation() {
			return abbreviation;
		}
		
		
	}
}
