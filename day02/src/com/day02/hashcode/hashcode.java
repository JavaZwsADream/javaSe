package com.day02.hashcode;

public class hashcode {
	
	public static void main(String[] args) {
		
	String s="Ok";
	
	StringBuilder sb = new StringBuilder(s);
	
	System.out.println("�ַ�����hashcode"+s.hashCode()+" Stringbuilder��hashcode:" +sb.hashCode());
	
	String t=new String("Ok");
	
	StringBuilder tb = new StringBuilder(t);
	
	System.out.println("�ַ���t��hashcodeֵ��:"+t.hashCode()+" tb��hashcode��:"+tb.hashCode());
	
    System.out.println(System.out);
	}
	

}
