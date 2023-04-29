package com.java.code;

public class Class_increment {

	public static void main(String[] args) {
			int i = 1; //latest value is i is 1
			int j = i++ + ++i;
			//j =1 + 3=4 //latest value of j here is 4
			//i=2,   3 //latest value of i is 3
			int k = j++ + i++ + ++j + j++;
			
			
			
			System.out.println(i); //3
			System.out.println(j); //4
			System.out.println(k);
	}

}
