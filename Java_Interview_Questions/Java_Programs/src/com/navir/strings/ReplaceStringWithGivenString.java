package com.navir.strings;

public class ReplaceStringWithGivenString {
	public static void main(String[] args) {
		String sentence = "Javascript is Easy";

		// Replacing "Javascript" with "Java"
		String replaced = sentence.replace("Javascript", "Java");

		System.out.println("Original sentence: " + sentence);
		System.out.println("Replaced sentence: " + replaced);
	}
}
