package Interview_Preperation.GFG_question;

import java.util.Scanner;

public class algorithm_identification {

    /*
    question : write an algorithm to display the examination set code according to the student
    application ID

    input : 6442
    output : P

     */
    public static void main(String[] args) {
/*
Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
       int r = sc.nextInt();
       int s = sc.nextInt();

 */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;
        int r = 0;

        while  (n!= 0){
            r = n % 10 ;
            s = s + r ;
            n = n  / 10 ;
        }
        findNum(s); // solve this from online
    }

    public static void findNum(int n) {

         int s = 0 ;    int r;

        if (n > 26){

            while  (n!= 0){
                r = n % 10 ;
                s = s + r ;
                n = n  / 10 ;
            }

            findNum(s);
        }
        else{
            System.out.println(n);
        }
    }

}
