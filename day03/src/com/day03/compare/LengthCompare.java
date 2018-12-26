package com.day03.compare;

import java.util.Arrays;
import java.util.Comparator;

public class LengthCompare implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.length()-o2.length();
	}

	
	public static void main(String[] args) {
		String[] friends= {"peter","11tony","wang"};
		Arrays.sort(friends, new LengthCompare());
		System.out.println(Arrays.toString(friends));
		
	}
}
