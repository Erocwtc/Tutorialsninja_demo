package class04_29_2023;

public class StringClassBeingFinal {
	
	//Final is a keyword in Java which is used with Classes, Methods and Variables 
	//Anything which is termed final cannot be changed 

	public static void main(String[] args) {
		
		int i = 10;
		i = i+2; 
		System.out.println(i) ;   //i became 12
		
		
		final int j = 5; 
		//j=3; //this is not allow to change due to it being final 
		
		void show()  { 
		}
		

	} class Test extends StringClassBeingFinal{
		
		void show () { 
		
		
	}

}
