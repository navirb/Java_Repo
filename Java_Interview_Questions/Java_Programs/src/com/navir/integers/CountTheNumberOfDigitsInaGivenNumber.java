package com.navir.integers;

public class CountTheNumberOfDigitsInaGivenNumber {
	public static void main(String[] args) {

		int count = 0, num = 1234567;

		while (num != 0) {
			// num = num/10
			num /= 10;
			++count;
		}

		System.out.println("Number of digits: " + count);
	}

}
