package Interview_Preperation.CommonQues;

import java.util.Scanner;

public class Q8_prime_number_PrintTrueFalse {
    public static void main(String[] args) {
        /*
        for details visit functions class at 1 hr 21 min time

        steps 1. check no is less than 1 ot not using if
                2. initialise from a = 2 and check square condition
                and no % a

 */

//        Scanner in  =new Scanner(System.in);
        System.out.print(" Enter your no here: ");
//        int n = in.nextInt();

        int n=  6;
        System.out.println(isPrime(n));


    }

    static boolean isPrime(int n){
        if (n <=1){
            return false;
        }

        int a =  2;
        while (a * a <= n){
            if (n % a == 0){
                return false;
            }
            a++;
        }
        if (a *a > n){
            return true;
        }
        return false;

    }
}
