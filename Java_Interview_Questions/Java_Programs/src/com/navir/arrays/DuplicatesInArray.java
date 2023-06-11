package com.navir.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4, 3, 5, 6, 5 }; // Example array with duplicate elements

		List<Integer> duplicates = findDuplicateElements(arr);
		System.out.println("Duplicate elements: " + duplicates);
	}

	public static List<Integer> findDuplicateElements(int[] arr) {
		Set<Integer> uniqueElements = new HashSet<>();
		List<Integer> duplicates = new ArrayList<>();

		for (int num : arr) {
			if (!uniqueElements.add(num)) {
				duplicates.add(num);
			}
		}

		return duplicates;
	}
}
