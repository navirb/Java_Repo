package com.navir.arrays;



import java.util.Arrays;

public class ZeroShift {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 0, 1, 0, 3, 0, 5 };

        // Shift zeros to the end
        int[] result = shiftZerosToEnd(arr);

        // Print the result
        System.out.println("Array with zeros shifted to the end: " + Arrays.toString(result));
    }

    public static int[] shiftZerosToEnd(int[] arr) {
        int count = 0; // Number of non-zero elements

        // Traverse the array and move non-zero elements to the left
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        // Fill the remaining positions with zeros
        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }

        return arr;
    }
}

/*
In this program, the `shiftZerosToEnd` method takes an array as input and shifts all the zeros to the end of the array while preserving the order of the non-zero elements. It uses a two-pointer approach: one pointer (`count`) keeps track of the current position to place the non-zero elements, and the other pointer traverses the array.

First, it iterates through the array and moves non-zero elements to the left, updating the `count` variable. Then, it fills the remaining positions with zeros until the end of the array.

Finally, the shifted array is printed using `Arrays.toString()` method.

Running the above program will give the output:

```
Array with zeros shifted to the end: [2, 1, 3, 5, 0, 0, 0, 0]
```

As you can see, all the zeros have been shifted to the end of the array.*/