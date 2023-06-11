package com.navir.strings;

public class ArmstrongNumberChecker {
	public static void main(String[] args) {
		String input = "153"; // Replace with the input string you want to check

		boolean isArmstrong = isArmstrongNumber(input);

		if (isArmstrong) {
			System.out.println(input + " is an Armstrong number.");
		} else {
			System.out.println(input + " is not an Armstrong number.");
		}
	}

	public static boolean isArmstrongNumber(String input) {
		int number = Integer.parseInt(input);
		int originalNumber = number;
		int sum = 0;
		int length = input.length();

		while (number > 0) {
			int digit = number % 10;
			sum += Math.pow(digit, length);
			number /= 10;
		}

		return (sum == originalNumber);
	}
}
