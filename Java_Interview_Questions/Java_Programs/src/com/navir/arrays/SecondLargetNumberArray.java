package com.navir.arrays;

public class SecondLargetNumberArray {
	    public static void main(String[] args) {
	        int[] numbers = {5, 10, 2, 8, 15, 3};

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] > largest) {
	                secondLargest = largest;
	                largest = numbers[i];
	            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
	                secondLargest = numbers[i];
	            }
	        }

	        if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("There is no second largest number.");
	        } else {
	            System.out.println("The second largest number is: " + secondLargest);
	        }
	    }
	}

/*
 * 
 * In this program, we initialize two variables largest and secondLargest with the minimum possible integer value using Integer.MIN_VALUE. Then, we iterate through the array and compare each element with the largest and secondLargest variables. If an element is greater than the largest number, we update both largest and secondLargest accordingly. If an element is greater than the secondLargest number but not equal to the largest number, we update only the secondLargest variable. Finally, we output the secondLargest number.

Note: This program assumes that the array has at least two distinct elements. If the array may contain duplicate values and you want to consider only distinct numbers, you can add an additional condition to handle it.

*/



/*
 * 
 * Certainly! Here's a Java program to find the second-largest number in an array without using `Integer.MIN_VALUE`:

```java
public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 2, 8, 15, 3};

        Integer largest = null;
        Integer secondLargest = null;

        for (Integer number : numbers) {
            if (largest == null || number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (secondLargest == null || number > secondLargest) {
                secondLargest = number;
            }
        }

        if (secondLargest == null) {
            System.out.println("There is no second largest number.");
        } else {
            System.out.println("The second largest number is: " + secondLargest);
        }
    }
}
```

In this program, we use `null` as the initial values for `largest` and `secondLargest`. During the iteration, we compare each number with the current `largest` number. If the number is greater than the `largest` number, we update both `largest` and `secondLargest`. If the number is not greater than the `largest` number but is greater than the current `secondLargest`, we update only the `secondLargest` variable. Finally, we output the `secondLargest` number.

Note: This program also assumes that the array has at least two distinct elements.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */



