package com.navir.integers;

public class PrimeNum {
//Prime number that has exactly 2 factors: itself and 1
	// Prime numbers ex:- 2,3,7
	public static boolean isPrimeNumber(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPrimeNumber(7));
	}
}
