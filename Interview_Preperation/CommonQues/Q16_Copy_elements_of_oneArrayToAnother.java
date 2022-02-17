package Interview_Preperation.CommonQues;

import java.util.Arrays;
import java.util.Scanner;

public class Q16_Copy_elements_of_oneArrayToAnother {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        int [] copy = arr;
        System.out.print("Original Array is : ");

        arr[4] = 500; // this is for replacing the element

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        System.out.print("Duplicate Array is : ");

        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]+ " ");
        }


    }
}



