package com.navir.arrays;

import java.util.ArrayList;
import java.util.List;

public class MissingNumbersInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 9 }; // Example array with missing numbers
		int maxNumber = 9; // Maximum number in the array

		List<Integer> missingNumbers = findMissingNumbers(arr, maxNumber);
		System.out.println("Missing numbers: " + missingNumbers);
	}

	public static List<Integer> findMissingNumbers(int[] arr, int maxNumber) {
		boolean[] marked = new boolean[maxNumber + 1]; // Boolean array to mark presence of numbers
		List<Integer> missingNumbers = new ArrayList<>();

		// Mark each number in the array as present
		for (int num : arr) {
			marked[num] = true;
		}

		// Check for missing numbers based on markings
		for (int i = 1; i <= maxNumber; i++) {
			if (!marked[i]) {
				missingNumbers.add(i);
			}
		}

		return missingNumbers;
	}
}
