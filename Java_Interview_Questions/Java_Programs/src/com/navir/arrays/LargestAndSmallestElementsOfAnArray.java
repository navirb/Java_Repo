package com.navir.arrays;

public class LargestAndSmallestElementsOfAnArray {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 9, 1, 7, 4 };

		int min = findMinElement(arr);
		int max = findMaxElement(arr);

		System.out.println("Minimum element: " + min);
		System.out.println("Maximum element: " + max);
	}

	public static int findMinElement(int[] arr) {
		int min = arr[0]; // Assume the first element is the smallest

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		return min;
	}

	public static int findMaxElement(int[] arr) {
		int max = arr[0]; // Assume the first element is the largest

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		return max;
	}
}
