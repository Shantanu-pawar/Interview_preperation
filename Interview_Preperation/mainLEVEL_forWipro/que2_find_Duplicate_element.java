package Interview_Preperation.mainLEVEL_forWipro;
import java.util.HashSet;
import java.util.Set;

public class que2_find_Duplicate_element {
    /*
    find the repetative numbers in array this is question
     */

    public static void main(String[] args) {

        int [] arr = {2, 3, 4, 5, 8, 6, 8, 4 ,2 ,9 ,9};


//        first logic for finding first duplicate elements


        int temp = 0;


//        for (int i = 0; i < arr.length -1; i++) {
//
//            for (int j = i + 1 ; j < arr.length; j++) {
//
//                if(arr[i] == arr[j] && (i != j)) {
//                    System.out.println(" first duplicate element " + arr[j]);
//                    temp = temp + 1;
//                    break;
//
//                }
//            }
//            if (temp >0){
//                break;
//            }
//        }


//        2nd logic by using hashset but in this method it is not give
//         this find_Out all duplicate elements in arrays

        Set<Integer> s = new HashSet<>();

        System.out.println(" duplicate elements are : ");
        for(int no : arr){

            boolean value = s.add(no);
            if(value == false){
                System.out.print( " " +no);
            }
        }


    }
}
