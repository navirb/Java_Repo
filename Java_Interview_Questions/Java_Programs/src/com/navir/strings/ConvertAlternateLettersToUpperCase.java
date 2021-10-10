package com.navir.strings;

public class ConvertAlternateLettersToUpperCase {
	public static void main(String[] args) {
		String str = "program";
		String sum = "";
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				sum = sum + str.toLowerCase().charAt(i);
			} else {
				sum = sum + str.toUpperCase().charAt(i);
			}
		}
		System.out.println(sum);
	}
}
