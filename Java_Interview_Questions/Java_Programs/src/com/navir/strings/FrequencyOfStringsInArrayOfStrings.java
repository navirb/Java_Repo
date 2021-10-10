package com.navir.strings;

public class FrequencyOfStringsInArrayOfStrings {
	static int search(String[] arr, String s) {
		int counter = 0;
		for (int j = 0; j < arr.length; j++) {
			if (s.equals(arr[j])) {
				counter++;
			}
		}
		return counter;
	}

	static void answerQueries(String[] arr, String q[]) {
		for (int i = 0; i < q.length; i++) {
			System.out.println(search(arr, q[i]) + " ");
		}
	}

	public static void main(String[] args) {
		String[] arr = { "wer", "wer", "tyu", "oio", "tyu" };
		String[] q = { "wer", "tyu", "oio" };
		answerQueries(arr, q);
	}

}
