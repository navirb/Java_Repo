package com.navir.strings;
/*
 * i/p:tomorrow
 * o/p:tm#rr##w
 */
public class ReplaceVowelsWithIncreasingCountOfSpecialCharcters {
	public static void main(String[] args) {
		String s = "tomorrow";
		int oCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'o') {
				for (int j = 0; j < oCount; j++) {
					System.out.print("#");
				}
				oCount++;
			} else {
				System.out.print(s.charAt(i));
			}
		}
	}
}
