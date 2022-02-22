package Interview_Preperation.GFG_question;

import java.util.Arrays;

public class Q2_remove_element_AtSpecific_index {


//        Remove an Element at Specific Index from an Array in Java

        /*

Input: arr[] = { 1, 2, 3, 4, 5 }, index = 2
Output: arr[] = { 1, 2, 4, 5 }

Input: arr[] = { 4, 5, 9, 8, 1 }, index = 3
Output: arr[] = { 4, 5, 9, 1 }

There are numerous approaches to check whether a specific element is present in this Array or not in Java.
These are –

Using another Array
Using Java 8 Streams
Using ArrayList
Using System.arraycopy() method

1. Using Another Array (Naive or Basic approach)
The basic approach includes finding the element at the specified index and then removing
that element. The rest of the elements are copied into a new array. This would lead to an array of
 size one less than the original array.

 Below is the implementation of the above approach:   */

    public static int[] removeTheElement(int[] arr, int index)
    {

        // If the array is empty
        // or the index is not in array range
        // return the original array

        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }

    // Driver Code
    public static void main(String[] args)
    {

        // Get the array
        int[] arr = { 1, 2, 3, 4, 5 };

        // Print the resultant array
        System.out.println("Original Array: "
                + Arrays.toString(arr));

        // Get the specific index
        int index = 2;

        // Print the index
        System.out.println("Index to be removed: " + index);

        // Remove the element
        arr = removeTheElement(arr, index);

        // Print the resultant array
        System.out.println("Resultant Array: "
                + Arrays.toString(arr));
    }
}


//output : Original Array: [1, 2, 3, 4, 5]
//        Index to be removed: 2
//        Resultant Array: [1, 2, 4, 5]

