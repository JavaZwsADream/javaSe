package com.day02.hashcode;

public class hashcode {
	
	public static void main(String[] args) {
		
	String s="Ok";
	
	StringBuilder sb = new StringBuilder(s);
	
	System.out.println("字符串的hashcode"+s.hashCode()+" Stringbuilder的hashcode:" +sb.hashCode());
	
	String t=new String("Ok");
	
	StringBuilder tb = new StringBuilder(t);
	
	System.out.println("字符串t的hashcode值是:"+t.hashCode()+" tb的hashcode是:"+tb.hashCode());
	
    System.out.println(System.out);
	}
	

}
