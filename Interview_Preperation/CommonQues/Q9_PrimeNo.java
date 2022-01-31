package Interview_Preperation.CommonQues;

import java.util.Scanner;

public class Q9_PrimeNo {
    public static void main(String[] args) {

        System.out.print("enter your number: ");

//        Scanner in  = new Scanner(System.in);
//        int num =in.nextInt();

        int num = 7;
        int temp  = 0;

        for (int i = 2; i < (num -1) ; i++) {
            if(num % i == 0){
                temp  = temp + 1 ;
            }
        }

        if(temp == 0){
            System.out.println(num + " is prime number");
        } else{
            System.out.println(num + " is not a prime number");
        }

    }
}
