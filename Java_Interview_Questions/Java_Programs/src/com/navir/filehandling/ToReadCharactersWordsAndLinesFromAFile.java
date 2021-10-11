package com.navir.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class ToReadCharactersWordsAndLinesFromAFile {

	public static void main(String[] args) {

		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;

		try {
			BufferedReader reader = new BufferedReader(new FileReader(
					"C:\\Bakke_World\\Bakke_Repo\\Bakke_Java_Repo\\Java_Interview_Questions\\Java_Programs\\resources\\input"));
			String currLine = reader.readLine();
			while (currLine != null) {
				lineCount++;
				// words
				String words[] = currLine.split(" ");
				wordCount = wordCount + words.length;

				// line
				for (String word : words) {
					charCount = charCount + word.length();
				}
				currLine = reader.readLine();

			}
			System.out.println("Total no of lines:" + lineCount);
			System.out.println("Total words:" + wordCount);
			System.out.println("Total chars:" + charCount);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
