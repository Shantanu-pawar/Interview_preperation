package Interview_Preperation.mainLEVEL_forWipro;

public class q3_find_2ndLarge_ndSmall_no_EfficientCodeSMALL {

        public static void main(String[] args) {

//        this is efficient code for find largest element 2nd

            int [] a = {2, 3, 5, 9, 12, 16, 54, 78, 95};

            int largest = Integer.MAX_VALUE ; // just change both sides to max values
            int secondLarge  = Integer.MAX_VALUE;

            for (int i = 0; i < a.length; i++) {

                if (a[i] < largest){ // here change only to >
                    secondLarge = largest ; // this is for just storing the 2nd large element

                    largest = a[i] ;

                }
                else if( a[i] < secondLarge && a[i] != largest){  // here change only to >
                    secondLarge = a[i];
                }

            }

            if (secondLarge == Integer.MAX_VALUE){
                System.out.println(" there is no second Smalest element in list ");
            }
            else{
                System.out.println("second smallest value is :" + secondLarge );
            }


        }
    }

