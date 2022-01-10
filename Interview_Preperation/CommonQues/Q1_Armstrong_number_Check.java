package Interview_Preperation.CommonQues;
import java.util.Scanner;
/*
  write input of armstrong number
means like
        1 = 1
        12 = 1square +2square
        123  = 1cube + 2cube + 3cube
        in short how many number of digits are there thats the num of the raised to value
        and then the value of that addition is itself the num of question

follow methods lecture for more information 1hr 27mins


 */

public class Q1_Armstrong_number_Check {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        System.out.println(isArmstrong(n));
//        enter here number and check is it armstrong or not



        // if print all armstrong numbers then use this loop
        for (int i = 100; i <1000 ; i++) {
            if (isArmstrong(i)){
                System.out.print(i + " ");
            }
        }


        /*
        simple approach :
        just compare the no , n >0
        then moving forward take the remender , n % 10
        cube = rem*rem*rem
        store it in sum variable ,sum = sum + cube

        n /10 ,cube , sum (updated) now this loop goes on
         */


    }
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while (n > 0){
            int rem = n %  10 ;
            n = n / 10;

            sum = sum + rem*rem*rem;
        }

       if (sum == original){
           return  true;
       }
       return false;  // this is for basic true or false
    }
}
