package com.navir;

/**
 *  1 1 1 1 1 
 *  1 0 0 0 1 
 *  1 0 0 0 1 
 *  1 0 0 0 1 
 *  1 1 1 1 1 

 * @author MyDevice
 *
 */
public class Pattern2 {
	public static void main(String[] args) {
		for (int rows = 1; rows <= 5; rows++) {
			for (int cols = 1; cols <= 5; cols++) {
				if (rows == 1 || rows == 5 || cols == 1 || cols == 5) {
					System.out.print(1 + " ");
				} else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
}
