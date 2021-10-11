package com.navir.strings;

public class ReplaceVowelswithSpecialCharacters {

	public static void main(String[] args) {
		String test = "tomorrow";
		StringBuffer finalString = new StringBuffer();
		int occurrence = 1;
		for (int i = 0; i < test.length(); i++) {
			if (test.charAt(i) == 'o')

			{
				for (int j = 0; j < occurrence; j++) {
					finalString.append("$");
				}
				occurrence++;
			} else {
				finalString.append(test.charAt(i));
			}
		}
		System.out.println(finalString.toString());
	}

}
