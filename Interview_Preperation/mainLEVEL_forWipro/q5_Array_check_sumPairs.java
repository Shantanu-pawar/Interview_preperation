package Interview_Preperation.mainLEVEL_forWipro;

public class q5_Array_check_sumPairs {
/*
question :  Given an array A[] and a number x, check for pair in A[] with sum as x
Input: arr[] = {0, -1, 2, -3, 1}
        sum = -2
Output: -3, 1
         Valid pair exists.

If we calculate the sum of the output,
1 + (-3) = -2

Input: arr[] = {1, -2, 1, 0, 5}
       sum = 0
Output:
        No valid pair exists.
 */

    static boolean chkPair(int A[], int size, int x) {

        for (int i = 0; i < (size - 1); i++) {

            for (int j = (i + 1); j < size; j++) {

                if (A[i] + A[j] == x) {

                    System.out.println("Pair with a given sum " + x +
                            " is (" + A[i] + ", " + A[j] + ")");


                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String [] args) {

        int A[] = {0, -1, 2, -3, 1};
        int x = -2;
        int size = A.length;

        if (chkPair(A, size, x)) {
            System.out.println("Valid pair exists");
        }
        else {
            System.out.println("No valid pair exists for " + x );
        }
    }
}
