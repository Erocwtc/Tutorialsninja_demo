package automation03_02_2023;

public class Variables_in_java {
	
	//1 instance variables
	//2 static variables
	//3 local variables
	//local variables are neither static or non static
	
	
	//global variables -C and C++
	
	// any variables defined under the Class but not in my method
	
	//NON Static---------- Notes
	
	
	//Class -static
	
	//non static - Object level interaction
	//static will call static entities
	//static can interact with static (but with a warning
	String name;// instance variable
	int age; // instance variable
	double balance; //instance variable
	static int wheels = 4;// static variable
	
	
	
	public static void main(String[] args) {
		static_nonStatic.sample();
		sample();
	

	}
	public static void sample() {

	}

}
