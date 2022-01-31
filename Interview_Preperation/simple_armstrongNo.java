package com.shantu;
import java.util.Scanner;

public class simple_armstrongNo {

    public static void main(String[] args) {


        System.out.print(" enter your no : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       int temp =  n;
       int rem = 0;
        int sum  = 0;


        while   (n > 0){

            rem = n % 10;
            sum  = sum + (rem * rem *rem);
            n = n/ 10 ;

        }

        if (temp == sum ) {
            System.out.println(" this is armstrong no ");
        }else{
            System.out.println(" this is not armstrong no ");
        }


    }
}
