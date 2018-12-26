package com.day03.afternoon;

public class PairTest1 {

	public static void main(String[] args) {
		String[] words= {"aaaqqa","had","a1","littleqq"};
		Pair<String> mm=ArrayAlg.minmax(words);
		System.out.println("min="+mm.getFirst());
		System.out.println("max="+mm.getSecond());
		
		Integer[] a= {1,3,4,5,6};
		Pair<Integer> demo=ArrayAlg.minmax1(a);
		System.out.println("mini="+demo.getFirst());
		System.out.println("max="+demo.getSecond());
	}
	
	
	static class ArrayAlg{
		
		public static Pair<String> minmax(String[] a)
		{
			
			if(a==null || a.length==0)
			return null;
		    String min=a[0];
			String max=a[0];
			
			for(int i=0;i<a.length;i++)
			{
				if(min.length()-a[i].length()>0)
					
					min=a[i];
				if(max.length()-a[i].length()<0)
					max=a[i];
					
			}
			return new Pair<>(min,max);
		}
		public static Pair<Integer> minmax1(Integer[] a)
		{
			if(a.length==0||a==null)
				return null;
			int first=a[0];
			int second=a[0];
			for(int i=0;i<a.length;i++)
			{
				if(first>a[i])
					first=a[i];
				if(second<a[i])
					second=a[i];
			}
			return new Pair<>(first,second);
		}
		
	}
}
