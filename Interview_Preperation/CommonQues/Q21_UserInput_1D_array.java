package Interview_Preperation.CommonQues;

import java.util.Arrays;
import java.util.Scanner;

public class Q21_UserInput_1D_array {
    public static void main(String[] args) {

//        this is for user input array sum return
        System.out.println(" Enter nos of elements you want to store : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // this ask you how many nos you want to entered ?

        int [] arr = new int [10];

        System.out.println(" Enter the Elements in Array ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // this can ask the numbers you want to enter
        }

        System.out.println(" So Array element are : ");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]); // this can print your entered numbers
        }



//      if you want to sum of all the above numbers then this loop are in used
//        int [] arr = {1, 2, 3, 4, 5};


        int sum = 0;

        for( int i = 0; i < arr.length ;i++)
        {
            sum += arr[i];
        }

        System.out.println(sum + " is your total sum of all numbers.");


    }
}
