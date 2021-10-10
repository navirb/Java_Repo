package com.navir.strings;

public class FindLengthOfSubStringInMainString {

	public static void main(String[] args) {
		String str[] = "My name is Nishant".split(" ");
		String str1 = "";
		String str2 = "";
		for (int i = 0; i < str.length; i++) {
			str1 = str[i];
			System.out.println(str1 + " ");
			if (str1.contains("Nishant")) {
				str2 = str2 + str1.length();
			}
		}
		System.out.println();
		System.out.println("Length of Nishant is:" + str2);
	}
}
