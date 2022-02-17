package Interview_Preperation.CommonQues;

/*
The natural numbers are the numbers that include all
the positive integers from 1 to infinity. For example, 1, 2, 3, 4, 5, ......, n.
 When we add these numbers together, we get the sum of natural numbers.
 */


public class Q18_for_1st_N_naturalNoSum {
    public static void main(String[] args) {
        int n = 10 ;
        int sum = 0 ;

//        here for loop always start using i = 1
        for(int i = 1 ;  i <= n ; i++ )  {

            sum = sum + i;//and take here i for sum input

        }
        System.out.println("Sum of First 10 Natural Numbers is = " + sum);
    }
}
