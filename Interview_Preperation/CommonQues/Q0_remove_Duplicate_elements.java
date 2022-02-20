package Interview_Preperation.CommonQues;
import java.util.Arrays;
import java.util.HashSet;

public class Q0_remove_Duplicate_elements {
    public static void main(String[] args) {
//        remove all duplicate elements if any problem Reffer to smartProgramming

        // this works only for sorted array means in ascending or decending order

//        int []arr = {1, 2, 2, 3, 4, 5, 6, 6, 7 };
//        int j =0;
//
//        int [] temp = new int[arr.length];
//        for (int i = 0; i < arr.length -1; i++) {
//
//            if (arr[i] !=  arr[i+1]) {
//                temp[j] = arr[i];
//                j++;
//            }
//        }
//        temp[j] = arr[arr.length -1];
//        for (int i = 0; i < temp.length; i++) {
//            System.out.print(temp[i] + " "); // 0 0 is for by default value of array
//        }


//        method 2 : by using hashset method this can also give output in unsorted array
//      note this will only remove the repeated numbers

        int []arr = {1, 2, 2, 8, 7 , 8 ,3, 4, 5, 6, 6, 7 };
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr.length ; i++) {
            hs.add(arr[i]);
        }


        for(int no : hs){
            System.out.print(no + " ");
        }
    }
}
