package com.navir.displaypatterns;
/*
 * 1 1 1 1 1 
 * 1       1 
 * 1       1 
 * 1       1 
 * 1 1 1 1 1 
 */
public class Pattern3 {
	public static void main(String[] args) {
		for (int rows = 1; rows <= 5; rows++) {
			for (int cols = 1; cols <= 5; cols++) {
				if (rows == 1 || rows == 5 || cols == 1 || cols == 5) {
					System.out.print(1 + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
