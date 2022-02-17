package Interview_Preperation.mainLEVEL_forWipro;

public class q3_find_2ndLarge_ndSmall_no_EfficientCode {
    public static void main(String[] args) {

//        this is efficient code for find largest element 2nd

        int [] a = {60, 80, 2, 3, 5, 9, 12, 16, 54, 78, 95};

        int largest = Integer.MIN_VALUE ;
        int secondLarge  = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {

            if (a[i] > largest){
                secondLarge = largest ; // this is for just storing the 2nd large element

                largest = a[i] ;

            }
            else if( a[i] > secondLarge && a[i] != largest){
                secondLarge = a[i];
            }

        }

        if (secondLarge == Integer.MIN_VALUE){
            System.out.println(" there is no second largest element in list ");
        }
        else{
            System.out.println("second large value is :" + secondLarge );
        }


    }
}
