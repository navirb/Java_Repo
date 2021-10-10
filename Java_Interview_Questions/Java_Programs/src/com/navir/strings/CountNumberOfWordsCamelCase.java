package com.navir.strings;

public class CountNumberOfWordsCamelCase {

	public static void main(String[] args) {

		System.out.println(count("ThisIsCamelCase"));
	}

	public static int count(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				count++;
			}
		}
		return count;
	}

}
