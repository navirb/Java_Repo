package com.navir.strings;

import java.util.HashMap;
import java.util.Map;

/*
 * input ==>test
 * output ==> t=2,e=1,s=1
 */
public class CountOccurencesOfEachCharacter {

	public static void getCharCount(String name) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char strArray[] = name.toCharArray();
		for (char c : strArray) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		System.out.println(name+ ":"+ charMap);
	}

	public static void main(String[] args) {
		getCharCount("test");

	}
}
