package learningtestNG;

import org.testng.annotations.Test;

public class Invocationpractice1 {
	@Test(priority=1)
	public void sample1() {
		System.out.println("This is test 1");
	}
	@Test(priority=2)
	public void sample2() {
		System.out.println("This is test 2");
	}
	@Test(priority=3, invocationCount=5)
	public void sample3() {
		System.out.println("This is test 3");
	}

}
