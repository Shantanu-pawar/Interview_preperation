package Interview_Preperation.CommonQues;

import java.util.Scanner;

public class Q2_Check_EvenOdd_number {
    public static void main(String[] args) {


        System.out.print("Enter your number here : ");
        Scanner in  = new Scanner(System.in);
        int num  = in.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " :number is even ");
            } else {
                System.out.println(num + " :number is odd");
            }



//            program for printing even odd using looping
            /*


           int a = 50;
        System.out.print(" here is your all odd nos : ");


        for (int j = 1; j <= a; j++) {
            if (j %2 != 0){
                System.out.print(j + " ");
            }
        }

        int f = 50;
        System.out.println();
        System.out.print(" here is your all even nos : ");

        for (int i = 2; i <= f; i++) {
            if (i % 2 ==0)
            {
                System.out.print(i + " ");
            }
        }


             */


    }
}
