package com.navir.strings;

public class ReverseAStringUsingStringBuilder {
	
	public static void main(String[] args) {
		
	
	String input = "This is a java Program";
	 
    StringBuilder input1 = new StringBuilder();

    // append a string into StringBuilder input1
    input1.append(input);

    // reverse StringBuilder input1
    input1.reverse();

    // print reversed String
    System.out.println(input1);
	}
}
