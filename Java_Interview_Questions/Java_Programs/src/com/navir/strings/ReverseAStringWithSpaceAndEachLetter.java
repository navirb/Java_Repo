package com.navir.strings;

public class ReverseAStringWithSpaceAndEachLetter {
	public static void main(String[] args) {
		String s = "I Love Java";
		String str = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			str = str + s.charAt(i);
		}
		System.out.println(str);
	}

}
