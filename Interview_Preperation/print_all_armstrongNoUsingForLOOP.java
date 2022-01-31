package com.shantu;

import java.util.Scanner;

public class print_all_armstrongNoUsingForLOOP {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter your 1st no :");
        int a  = sc.nextInt();
        System.out.print(" Enter your 2nd no :");
        int b  = sc.nextInt();

        findArmstrong(a, b);

    }
    static void findArmstrong (int a   , int b ){

        for (int i =a ; i < b ; i++) {

            int num  = i;
            int sum = 0;

            while (num > 0){
                int remender  = num % 10 ;
                sum = sum +( remender* remender* remender);

                num = num / 10 ;

            }
            if (sum == i)
            {
                System.out.print(sum + " ");
//                note : this is prints all the numbers within the range
            }
        }
    }
}
