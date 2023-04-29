package com.java.code;

public class AccessModifiers {
	public static String name = "Don";
	protected static double height = 6.0;
			String color = "Red" ;
			
			
			public static void main(String[] args) {
		// There are 4 access modifiers in java
		// 1. public is everywhere across the project
		//2. protected - access is within the package. it can have the access outside the package 
		//but the condition is that you have the child class
		//3. private.this is stricktly within the same class
		// 4. default. only within the package 

	}
			public static void sample() {
				System.out.println("this is public sample method");
				
			}
			
			protected static void sample1() {
				System.out.println("this is a protected sample 1 method");
			}

			
			
			}
