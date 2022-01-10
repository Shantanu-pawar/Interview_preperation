package Interview_Preperation.CommonQues;

import java.util.Scanner;

public class Q2_Check_EvenOdd_number {
    public static void main(String[] args) {


        System.out.print("Enter your number here : ");
        Scanner in  = new Scanner(System.in);
        int num  = in.nextInt();



            if ( 2 % num == 0) {
//            if (num % 2 == 0) {
                System.out.println(num + " :number is even ");
            } else {
                System.out.println(num + " :number is odd");
            }


    }
}
