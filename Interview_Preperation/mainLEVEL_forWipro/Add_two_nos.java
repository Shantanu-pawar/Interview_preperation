package Interview_Preperation.mainLEVEL_forWipro;

public class Add_two_nos {
    /*
        Add two numbers represented by two arrays
        Input : n = 3, m = 3
        a[] = { 1, 2, 3 }
        b[] = { 2, 1, 4 }
        Output : 337
        123 + 214 = 337

        Input : n = 4, m = 3
        a[] = { 9, 5, 4, 9 }
        b[] = { 2, 1, 4 }
        Output : 9763

     */

    public static void main(String[] args)
    {
        int a[] = { 8, 3 };
        int b[] = { 1, 7 };

        int n = a.length;
        int m = b.length;
        System.out.println(calSum(a, b, n, m));
    }


    // Return sum of two number represented by
    // the arrays. Size of a[] is greater than
    // b[]. It is made sure be the wrapper
    // function
    static int calSumUtil(int a[], int b[], int n, int m)  {
        // array to store sum.
        int[] sum= new int[n];

        int i = n - 1, j = m - 1, k = n - 1;

        int carry = 0, s = 0;

        // Until we reach beginning of array.
        // we are comparing only for second array because we have already compare the size of array in wrapper function.

        while (j >= 0) {
            // find sum of corresponding element of both array.
            s = a[i] + b[j] + carry;

            sum[k] = (s % 10);

            // Finding carry for next sum.
            carry = s / 10;

            k--; i--; j--;
        }

        // If second array size is less
        // the first array size.
        while (i >= 0) {
            // Add carry to first array elements.
            s = a[i] + carry;
            sum[k] = (s % 10);
            carry = s / 10;

            i--; k--;
        }

        int ans = 0;

        // If there is carry on adding 0 index
        // elements  append 1 to total sum.
        if (carry == 1)
            ans = 10;

        // Converting array into number.
        for ( i = 0; i <= n - 1; i++) {
            ans += sum[i];
            ans *= 10;
        }

        return ans / 10;
    }

    // Wrapper Function
    static int calSum(int a[], int b[], int n,
                      int m)
    {
        // Making first array which have
        // greater number of element
        if (n >= m)
            return calSumUtil(a, b, n, m);

        else
            return calSumUtil(b, a, m, n);
    }
}

