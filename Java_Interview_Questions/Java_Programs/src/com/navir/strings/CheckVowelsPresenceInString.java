package com.navir.strings;

public class CheckVowelsPresenceInString {

	public static boolean StringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*");
	}

	public static void main(String[] args) {
		System.out.println(StringContainsVowels("Raghavendra"));
	}

}
