package com.navir.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 4, 3, 5, 6, 5 }; // Example array with duplicate elements

		int[] uniqueArray = removeDuplicates(arr);
		System.out.println("Updated array without duplicates:");
		for (int num : uniqueArray) {
			System.out.print(num + " ");
		}
	}

	public static int[] removeDuplicates(int[] arr) {
		Set<Integer> uniqueElements = new HashSet<>();
		List<Integer> uniqueList = new ArrayList<>();

		for (int num : arr) {
			if (uniqueElements.add(num)) {
				uniqueList.add(num);
			}
		}

		int[] uniqueArray = new int[uniqueList.size()];
		for (int i = 0; i < uniqueList.size(); i++) {
			uniqueArray[i] = uniqueList.get(i);
		}

		return uniqueArray;
	}
}
