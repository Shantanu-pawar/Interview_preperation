package Interview_Preperation.CommonQues;

public class Q3_Factorial_ofNumber {
//    for ex of factorial
//    let no, 4! = 4 *3 *2 *1 = 24

    public static void main(String[] args) {
        int num = 5 ;
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i ;
        }
        System.out.println("the factorial of "+ num + " is : " +factorial);



    }
}
