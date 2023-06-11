package com.navir.arrays;

public class MissingNumberInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3,4, 5,7,8,9,10}; // Example array with a missing number
		int missingNumber = findMissingNumber(arr);
		System.out.println("Missing number: " + missingNumber);
	}

	public static int findMissingNumber(int[] arr) {
		int n = arr.length + 1; // Expected number of elements (including the missing number)
		int expectedSum = n * (n + 1) / 2; // Calculate the expected sum

		int actualSum = 0;
		for (int num : arr) {
			actualSum += num; // Calculate the actual sum
		}

		return expectedSum - actualSum; // Return the missing number
	}
}
