package Interview_Preperation.mainLEVEL_forWipro;

public class q1_find_2nd_smallest_no {
    public static void main(String[] args) {

//        ques : find the 2nd smallest element in array
//

        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // first sort the array by using loop ;
        int temp;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i +1 ; j < arr.length; j++) {
                if ( arr[i] > arr[j] ) {  // here all code is same just change the sign to >
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // this is for printing descending list
        }

        System.out.println();
        System.out.println(" second Smallest element is : " + arr[1]);
        // this is for finding 2nd largest element in array
    }
}
