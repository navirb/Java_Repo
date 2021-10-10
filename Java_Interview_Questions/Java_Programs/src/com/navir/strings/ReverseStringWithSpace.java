package com.navir.strings;

/*
 * input :I Love Java 
 * Output : Java Love I
 */
public class ReverseStringWithSpace {
	public static void main(String[] args) {

		String inputStr = "Selenium 123";
		String[] str = inputStr.split("\\s");
		String finalString = "";
		for (int i = str.length - 1; i >= 0; i--) {
			finalString = finalString + str[i] + " ";
		}
		System.out.println("Final String is: " + finalString);
	}

}
