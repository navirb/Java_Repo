package com.navir.strings;

public class ToRemoveGivenCharacterFromString {

	private static String removeChar(String str, Character c) {
		return str.replaceAll(Character.toString(c), " ");
	}

	public static void main(String[] args) {
		System.out.println(removeChar("my name", 'm'));

	}

}
