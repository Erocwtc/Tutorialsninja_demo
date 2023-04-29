package com.java.code;

public class Post_increment {

	public static void main(String[] args) {
	int i = 1;
	i++;
	//variable is i which is before ++
	//++ is coming after i. So ++ is post variable
	
	//post increment operator 

	i++; // this is uni-body
	System.out.println(i);
	
	int j = i++; 
	System.out.println(j);  //2
	System.out.println(i); //3
	
	j = i++ + i++;
	
	System.out.println(i); //5
	System.out.println(j); //7
	
	
	j = i++ + i++ + i++ + i++;
	
	System.out.println(j);
	
	
	//j += 3 + 
	
	
	}

}
