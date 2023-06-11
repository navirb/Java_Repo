package com.navir.arrays;

import java.util.Arrays;

public class ShftZerosToBeginig {

	public static void main(String[] args) {
		int[] arr = { 0, 2, 0, 1, 0, 3, 0, 5 };

		// Shift zeros to the beginning
		int[] result = shiftZerosToBeginning(arr);

		// Print the result
		System.out.println("Array with zeros shifted to the beginning: " + Arrays.toString(result));
	}

	public static int[] shiftZerosToBeginning(int[] arr) {
		int count = arr.length - 1; // Number of zeros

		// Traverse the array from right to left
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0) {
				arr[count] = arr[i];
				count--;
			}
		}

		// Fill the beginning positions with zeros
		while (count >= 0) {
			arr[count] = 0;
			count--;
		}

		return arr;
	}
}
