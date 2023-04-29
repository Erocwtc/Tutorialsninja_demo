package class04_29_2023;

public class WhyStringsAreImmutable {
	//Immutable concept is used for String Objects 
	//String objects are immutable
	//once Strings objects are created, its data or state cannot be changed
	
	//so basically what happens is - if we try to change the state of a String Object, instead of changing
	//it will created anohter object

	public static void main(String[] args) {
		
		String S = new String("Apple");
		S.concat("Macbook");
		System.out.println(S);
		
		S= S.concat("iPhone"); 
		
		System.out.println(S); // here you are modifying the object as well as pointing the
		//refernce to the new ojbect
		
		
		String state1 = "Virginia";
		String state2 = "Virginia'";
		
		
		String state30 = "Maryland";
				
	

	}

}
