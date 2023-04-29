package com.java.code;

public class Programtodetermineleap {

	public static void main(String[] args) {
		int year = 1980;
		
		if(year%4 ==0 && year%100 ! = 0 || year %400 == 0) {
			System.out.println("year 1980 is a leap year");
		}else {
			System.out.println("year is not leap");
		}

	}

}
