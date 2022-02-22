package Interview_Preperation.GFG_question;

/*

question  : Write Program to find the product of array
in other words find factorial in just array.

Examples :

Input  : ar[] = {1, 2, 3, 4, 5}
Output : 120
Product of array elements is 1 x 2
x 3 x 4 x 5 = 120.

Input  : ar[] = {1, 6, 3}
Output : 18

 */


public class Q0_product_of_Arrays {

    static int product(int ar[], int n) {

        int result = 1;
        for (int i = 0; i < n; i++)
            result = result * ar[i];
        return result;
    }

    // driver code for the above program
    public static void main(String[] args)
    {
        int ar[] = { 1, 2, 3, 4, 5 };
        int n = ar.length;
        System.out.printf("%d", product(ar, n));
    }
}
