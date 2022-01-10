package Interview_Preperation.mainLEVEL_forWipro;

import java.util.Scanner;
// source sum of two arrays pepcoding nados
public class Sum_ofTwoArrays {
    public static void main(String[] args) {


//        note : in the input first we have to put how much array we need to create
//        then take input accordingly to both arrays


//         IMP : here u have to identify that what the question sys : if it says that take input at one line
//         or take input in separate lines

        Scanner sc = new Scanner (System.in);

        //step 1" array 1 input
        System.out.println( " enter your 1st array :");
        int n1 =sc.nextInt(); // this is for getting elements in array from user
        int [] arr1 = new int[n1]; // this is for elements in 1st array
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        // array 2 input
        System.out.println(" enter your 1st array : ");
        int n2 = sc.nextInt();
        int [] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        // step 2 : sum establish and sum array la mothya array chya jagi thevla

        int [] sum = new int[n1 > n2?  n1 : n2];

        // here ternary operation is required
//        this is just true false like means
//        n1 motha ahe n2 chya then we get n1 ans and if not then we get n2 ans

        int carry  = 0;
        int i = arr1.length -1 ;
        int j = arr2.length -1;
        int k = sum.length -1 ;

        while   (k >= 0) {
            int digit  = carry;

            if (i >= 0){
                digit += arr1[i] ; // arr1 mdhe jaga urli then tyala add kara
            }
            if(j >= 0){
                digit += arr2[j]; // arr2 mdhe jaga urli then tyala add kara
            }

            carry = digit /10; // initialised carry here
            digit = digit % 10 ; // now no ko kam krdo and sum me dal do
            sum [k]  = digit;

            i--; j--; k--; //3 ko reduce krdete hai and
        }

        if (carry != 0){
            System.out.print(carry + " "); // nd this is for non zero element print
        }
        for(int no : sum){
            System.out.print(no + " "); // here keep in mind that what question says about printing
        }

    }
}