package Interview_Preperation.CommonQues;

import java.util.Scanner;

public class Q5_numb_isEvenOdd_ifOddCheckPrime_Not {
    public static void main(String[] args) {


        System.out.print("Enter your number here : ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int temp = 0;


        if (num % 2 == 0) {
            System.out.println(num + " :number is even ");

        } else {

            System.out.println(num + " this num is odd so now check whether it is prime or not ");

            for (int i = 2; i <(num -1) ; i++) {

                if(num % i == 0){
                    temp = temp + 1;
                }
            }

            if (temp == 0){
                System.out.println(num + " is prime");
            }else{
                System.out.println(num + " not prime");
            }


        }
    }
}


