package com.java.code;

public class Class_increment1 {

	public static void main(String[] args) {
		int i = 1; 
				int j = --i;
		int k = i++ - --i + i++;
		int l = j++ + ++k + --i - i--;
			
			System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}

}
