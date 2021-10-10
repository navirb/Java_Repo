package com.navir.strings;

import java.util.Arrays;
import java.util.HashSet;
/*
 * input : Java is Great is Java is Java correct
 * output : Java is Great correct
 */
public class PrintOnlyUniqueWordsOfaString {
	public static void main(String[] args) {
		String inputStr = "Java is Great is Java is Java correct";
		String[] words = inputStr.split(" ");
		HashSet<String> uniqueWords = new HashSet<String>(Arrays.asList(words));

		for (String obj : uniqueWords) {
			System.out.println(obj);
		}
	}

}
