package Interview_Preperation.CommonQues;

import java.util.Scanner;

public class Q29_Fibo_series_Print {
    public static void main(String[] args) {


        System.out.println(" Enter here how many numbers you want : ");
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int a = 0 ; int b = 0 ;
        int count = 1 ;

        System.out.println(" here is your fibonacci series : ");
        for (int i = 1; i <= n ; i++) {

            a = b ;
            b = count;
            count = a + b ;

            System.out.print(a +" ");

        }
    }
}