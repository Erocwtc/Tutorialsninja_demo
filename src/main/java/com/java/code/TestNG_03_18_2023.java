package com.java.code;

import org.testng.annotations.Test;

public class TestNG_03_18_2023 {
	@Test(priority=1)
	public void sample1() {
	System.out.println("This is Test1");
		
	}
	@Test(priority=2)
	public void sample2() {
	System.out.println("This is test 2");
	
	
	}
	
	@Test(priority=2, invocationCount=5)
	public void sample3() {
		System.out.println ("this is test3"); 
	}
	
	
	

}
