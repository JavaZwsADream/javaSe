package com.day03.afternoon;

import java.time.LocalDate;

public class PairTest2 {
	
	public static void main(String[] args) {
		
		LocalDate[] birthdays= {
				LocalDate.of(1997, 10, 16),
				LocalDate.of(2000, 11, 12),
				LocalDate.of(1998, 01, 01),
				LocalDate.of(1998, 11, 21)
				
		};
		Pair<LocalDate> mm=ArrayAlg.minmax(birthdays);
		System.out.println("min="+mm.getFirst());
		System.out.println("max="+mm.getSecond());
		
	}
	
	static class ArrayAlg{
		
		
		public static <T extends Comparable> Pair<T> minmax(T[] a)
		{
			
			if(a==null || a.length==0)
				return null;
			T min=a[0];
			T max=a[0];
			for(int i=0;i<a.length;i++)
			{
				if(min.compareTo(a[i])>0)
					min=a[i];
				if(max.compareTo(a[i])<0)
					max=a[i];
			}
			return new Pair<>(min,max);
			
		}
		
	}

}
