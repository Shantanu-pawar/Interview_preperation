package Interview_Preperation.mainLEVEL_forWipro;

import java.util.Arrays;

  /*

  Question : Check if two arrays are equal or not
  means just check whether the elements is same or not the position of the element

        Returns true if arr1[0..n-1] and arr2[0..m-1]
        contain same elements

Input  : arr1[] = {1, 2, 5, 4, 0};
         arr2[] = {2, 4, 5, 0, 1};
Output : Yes

Input  : arr1[] = {1, 2, 5, 4, 0, 2, 1};
         arr2[] = {2, 4, 5, 0, 1, 1, 2};
Output : Yes

Input : arr1[] = {1, 7, 1};
        arr2[] = {7, 7, 1};
Output : No
                 */

public class que8_check_TwoArrays_equalOrNot {



    public static void main(String[] args){
        int arr1[] = { 3, 5, 2, 5, 2 };
        int arr2[] = { 2, 3, 5, 5, 2 };


        if (areEqual(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

        public static boolean areEqual(int arr1[], int arr2[]) {
            int n = arr1.length;
            int m = arr2.length;

            // If lengths of array are not equal means
            // array are not equal
            if (n != m)
                return false;

            // Sort both arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Linearly compare elements
            for (int i = 0; i < n; i++)
                if (arr1[i] != arr2[i])
                    return false;

            // If all elements were same.
            return true;
        }
    }


