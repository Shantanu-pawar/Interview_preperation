package Interview_Preperation.CommonQues;

import java.util.Scanner;

public class Q28_get_Nth_Fibonacci_No {
    public static void main(String[] args)
    {
        System.out.print(" Enter the value of N : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt() ;
        int a = 0 ;
        int b = 1;
        int count  = 2;

        System.out.print( "So specific fibonacci number is : ");

        while(count <= n){

            int temp = b;

            b = b + a ;
            a = temp ;
            count++ ;

        }
        System.out.println(b + " ");

    }
}
