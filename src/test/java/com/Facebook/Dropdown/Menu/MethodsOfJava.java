package com.Facebook.Dropdown.Menu;

public class MethodsOfJava {
	
	//Methods are also known as functions
	//Methods are known as independent units of execution
	//access modifier static/nonstatic retun type name of the method()


	
	
	public static void main(String[] args) {
		System.out.println("This is the main method");
	
		int sumAgain = sample(100,200,300);
		String val = test("hello");
	

	}
	public static int sample(int i, int j, int k) {
		i= 10;
		j= 20;
		k= 30;
		
		int sum = i+j+k; 
		return sum;
		
	}
	public static String test(String S1, String S2) {
		String S3 = S1+S2;
		return S3;
		
	


}}
