package com.navir.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountTheOccurenceOfEachElementInArray {
	public static void main(String[] args) {
		int[] arr = { 2, 5, 7, 2, 4, 5, 7, 2, 8, 5, 9, 5 };

		// Create a HashMap to store element-frequency pairs
		Map<Integer, Integer> frequencyMap = new HashMap<>();

		// Iterate over the array elements
		for (int element : arr) {
			// Check if the element is already present in the map
			if (frequencyMap.containsKey(element)) {
				// If present, increment the frequency count by 1
				frequencyMap.put(element, frequencyMap.get(element) + 1);
			} else {
				// If not present, add the element to the map with a frequency of 1
				frequencyMap.put(element, 1);
			}
		}

		// Print the element-frequency pairs
		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
		}
	}
}
