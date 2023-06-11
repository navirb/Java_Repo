package com.navir.integers;

public class ToPrintNumbersInReverseOrder {
	public static void main(String[] args) {
		int start = 9;
		int end = 1;

		printNumbers(start, end);
	}

	public static void printNumbers(int start, int end) {
		if (start >= end) {
			System.out.println(start);
			printNumbers(start - 1, end);
		}
	}

}
