package Interview_Preperation.CommonQues;

public class Q11_Reverse_number {
    public static void main(String[] args) {

        int num  = 12345;
        int rem , rev = 0;

        while   (num != 0){

            rem = num % 10 ;
            rev = rev * 10 + rem;
            num  = num /10 ;

        }
            System.out.println( rev + " is reverse number ");

//        you may face question like subtract two nos and then reverse the answer
//        so in that case you have to store that ans into new variable
//        like this : int num = total ;

//        int a = 453 ;
//        int b = 34;
//        int rem = 0;
//        int rev = 0;
//
//        int total  = a - b;
//        System.out.println(total);
//
//        int  num = total;
//        while (num != 0){
//            rem = num % 10 ;
//            rev = rev * 10 + rem;
//            num  = num /10 ;
//        }
//        System.out.println(rev);

    }
}
