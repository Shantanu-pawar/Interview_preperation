package Interview_Preperation.CommonQues;

/*
The natural numbers are the numbers that include all
the positive integers from 1 to infinity. For example, 1, 2, 3, 4, 5, ......, n.
 When we add these numbers together, we get the sum of natural numbers.
 */


public class WAP_for_1st_N_naturalNoSum {
    public static void main(String[] args) {
        int num = 3;
        int sum = 0;
        for(int i = 1; i <= num; ++i)
        {
            sum = sum + i;
        }
        System.out.println("Sum of First 10 Natural Numbers is = " + sum);
    }
}
