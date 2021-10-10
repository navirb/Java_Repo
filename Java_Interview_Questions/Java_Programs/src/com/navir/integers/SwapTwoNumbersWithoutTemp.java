package com.navir.integers;

public class SwapTwoNumbersWithoutTemp {
	public static void main(String[] args) {
		
		int x =20,y=80;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x +" : X value after swapping");
		System.out.println(y + " : y value after swapping");
	}

}
