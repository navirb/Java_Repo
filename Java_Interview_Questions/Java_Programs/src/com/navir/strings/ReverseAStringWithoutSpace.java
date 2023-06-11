package com.navir.strings;

public class ReverseAStringWithoutSpace {
	
	public static void main(String[] args)
    {
        String input = "Thisismyprogram";
 
        // convert String to character array
        // by using toCharArray
        char[] finalString = input.toCharArray();
 
        for (int i = finalString.length - 1; i >= 0; i--)
            System.out.print(finalString[i]);
    }

}
