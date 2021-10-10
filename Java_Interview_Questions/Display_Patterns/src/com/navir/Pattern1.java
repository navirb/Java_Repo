package com.navir;
/**
 * 
 * @author Nagaraju
 * 1  
 * 2 3  
 * 4 5 6  
 * 7 8 9 10 
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
