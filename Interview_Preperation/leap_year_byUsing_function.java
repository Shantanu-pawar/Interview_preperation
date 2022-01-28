package com.shantu;

public class leap_year_byUsing_function {
    public static void main(String[] args) {


//        Scanner sc =  new Scanner(System.in);
//        System.out.print( " enter your no here :");
//        int year = sc.nextInt();


            isLeapYear(2024);
            isLeapYear(900);
            isLeapYear(800);
            isLeapYear(1000);


        }
        static void isLeapYear ( int year){

            boolean leap = false;

            if (year % 4 == 0) {

                if (year % 100 == 0) {

                    if (year % 400 == 0) {

                        leap = true;

                    } else {
                        leap = false;
                    }

                } else {
                    leap = true;
                }

            } else {
                leap = false;
            }

            if (!leap) {
                System.out.println(year + " not a leap year ");
            } else {
                System.out.println(year + " leap year");
            }


    }
}
