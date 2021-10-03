package com.navir;
/**
 * 
 * @author Nagaraju
 *
 */
public class Pattern1 {
	public static void main(String[] args) {
		int toprint_Digits = 1;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(toprint_Digits++ +" ");
			}
			System.out.println(" ");
		}
	}
}
