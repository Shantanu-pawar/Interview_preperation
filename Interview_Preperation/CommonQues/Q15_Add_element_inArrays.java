package Interview_Preperation.CommonQues;

public class Q15_Add_element_inArrays {
    public static void main(String[] args) {

        int []arr = {10, 20, 30, 40, 50, 60, 70, 80, 90 ,100, 110, 120};
        int position  = 4; // this is position not index value keep in mind
        int element  = 5555 ;
//        simply here when we add element into array then array's last index is gone


        arr[8] = 0; // this is for replacing the element of 90 -> 0

        for (int i = arr.length-1 ; i > position -1 ; i--) {
            arr[i] = arr[i -1];
        }

        arr[position -1] = element;
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + "  "); //Insert the element

        }

    }
}
