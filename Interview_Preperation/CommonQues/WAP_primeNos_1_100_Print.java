package Interview_Preperation.CommonQues;

public class WAP_primeNos_1_100_Print {


//    public static void main(String[] args) {
//        int N = 100;
//        //check for every number from 1 to N
//        for (int i = 1; i <= N; i++) {
//            //check if current number is prime
//            if (isPrime(i)) {
//                System.out.print(i + " ");
//            }
//        }
//
//    }
//
//    //function to check if a given number is prime
//    static boolean isPrime(int n) {
//        //since 0 and 1 is not prime return false.
//        if (n == 1 || n == 0) return false;
//
//        //Run a loop from 2 to n-1
//        for (int i = 2; i < n; i++) {
//            // if the number is divisible by i, then n is not a prime number.
//            if (n % i == 0) return false;
//        }
//        //otherwise, n is prime number.
//        return true;
//    }


/*
        2nd method to print using loops
 */
            public static void main(String[] args) {


                for (int num = 1; num <= 100; num++) {
                    int temp = 0;

                    for (int i = 2; i < num -1 ; i++) {
                        if (num % i == 0){
                            temp  = temp +1 ;
                        }
                    }

                        if (temp == 0){
                            System.out.print(num + "  ");
                        }

                }
            }
        }
