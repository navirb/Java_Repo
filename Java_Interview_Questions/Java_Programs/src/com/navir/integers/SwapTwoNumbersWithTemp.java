package com.navir.integers;

public class SwapTwoNumbersWithTemp {
	
	public static void main(String[] args) {
		int x=5,y=10;
		int temp=0;
		temp=x;
		x=y;
		y=temp;
		System.out.println("x value is:"+ x);
		System.out.println("y value is:"+ y);
	}

}
