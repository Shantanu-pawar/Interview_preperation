package Interview_Preperation.CommonQues;

/*
Java program to find the sum of n natural numbers using the function

 */
public class Q19_for_1st_N_naturalNoSum_UsingFunction {

    // Returns sum of first n natural
    // numbers

    public static void main(String args[])
    {
        int n = 7;
        System.out.println(findSum(n));
    }

    static int findSum(int n)
    {
        int sum = 0;

        for (int i = 1; i <= n; i++)
            sum = sum + i;
        return sum;
    }



}
