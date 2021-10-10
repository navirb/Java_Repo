package com.navir.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsCountInString {

	public static void findDuplicateWords(String inputString) {
		
		Map<String, Integer> wordCount = new HashMap<String, Integer>();
		String words[] = inputString.split(" ");
		for (String word : words) {
			if (wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word) + 1);
			} else {
				wordCount.put(word, 1);
			}
		}
		//Extracting all the keys of map wordCount
		Set<String> wordsInString = wordCount.keySet();
		for (String word : wordsInString) {
			if (wordCount.get(word) > 1) {
				System.out.println(word + ":" + wordCount.get(word));
			}
		}
	}

	public static void main(String[] args) {
		findDuplicateWords("Mera Bharat Mahan Bharat Mera Bharat Mahan Bharat");
	}

}
