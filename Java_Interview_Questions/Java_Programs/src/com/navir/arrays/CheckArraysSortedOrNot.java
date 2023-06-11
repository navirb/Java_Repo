package com.navir.arrays;

public class CheckArraysSortedOrNot {
	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 4, 5}; // Sorted in ascending order
	        int[] arr2 = {5, 4, 3, 2, 1}; // Sorted in descending order
	        int[] arr3 = {1, 3, 2, 4, 5}; // Not sorted

	        System.out.println("arr1 is sorted in " + getOrder(arr1) + " order");
	        System.out.println("arr2 is sorted in " + getOrder(arr2) + " order");
	        System.out.println("arr3 is sorted in " + getOrder(arr3) + " order");
	    }

	    public static String getOrder(int[] arr) {
	        boolean ascending = true;
	        boolean descending = true;

	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] > arr[i + 1]) {
	                ascending = false;
	            }
	            if (arr[i] < arr[i + 1]) {
	                descending = false;
	            }
	        }

	        if (ascending) {
	            return "ascending";
	        } else if (descending) {
	            return "descending";
	        } else {
	            return "not sorted";
	        }
	    }
	}


