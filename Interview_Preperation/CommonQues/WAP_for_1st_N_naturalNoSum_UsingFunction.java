package Interview_Preperation.CommonQues;

/*
Java program to find the sum of n natural numbers using the function

 */
public class WAP_for_1st_N_naturalNoSum_UsingFunction {

    // Returns sum of first n natural
    // numbers
    static int findSum(int n)
    {
        int sum = 0;
        for (int x = 1; x <= n; x++)
            sum = sum + x;
        return sum;
    }

    // Driver code
    public static void main(String args[])
    {
        int n = 7;
        System.out.println(findSum(n));
    }
}
