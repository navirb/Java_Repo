package com.navir.strings;

public class RemoveTheSpaceAndReverseAString {

	public static void main(String[] args) {
		String input = "Hello World!";

		// Removing spaces from the input string
		String withoutSpaces = input.replace(" ", "");

		// Reversing the string
		String reversed = new StringBuilder(withoutSpaces).reverse().toString();

		System.out.println("Original string: " + input);
		System.out.println("String without spaces: " + withoutSpaces);
		System.out.println("Reversed string: " + reversed);
	}
}
