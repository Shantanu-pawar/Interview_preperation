package Interview_Preperation.CommonQues;

import java.util.Scanner;

public class Q4_leap_year {
    public static void main(String[] args) {

        System.out.print("enter your year : ");
        Scanner in = new Scanner (System.in);
        int year  =in.nextInt();

//        1st way of solving method

//        if(year % 4 == 0){
//
//            if(year % 100 == 0){
//
//                if (year % 400 == 0){
//
//                    System.out.println(year +" leap year ");
//
//                }else{
//                    System.out.println(year +" not a leap year ");
//                }
//
//            }else{
//                System.out.println(year +" leap year ");
//            }
//
//        }else{
//            System.out.println(year +" not a leap year ");
//        }


//        simple program

        if((year % 400 == 0) || (year % 4 == 0) && (year %100 != 0) ){

            System.out.println(year +" : leap year ");

        }else{
            System.out.println(year +" :not a leap year ");
        }


    }
}
