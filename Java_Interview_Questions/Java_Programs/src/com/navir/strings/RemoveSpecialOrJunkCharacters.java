package com.navir.strings;

public class RemoveSpecialOrJunkCharacters {
	public static void main(String[] args) {
		String inputStr = "   labin string 012345678*&^";
		inputStr = inputStr.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(inputStr);
	}

}
