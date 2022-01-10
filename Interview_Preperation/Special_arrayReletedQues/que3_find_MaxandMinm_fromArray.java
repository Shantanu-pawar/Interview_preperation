package Interview_Preperation.Special_arrayReletedQues;

public class que3_find_MaxandMinm_fromArray {
    public static void main(String[] args) {
/*
        there are two arrays
        1st array [1 4 7 3 2]
        2nd array [2 8 2 5 9 6]

        so the question is find the largest element that is 7
        and smallest element that is 2

        then sum both elements sum = 2+ 7 = 9
        so we have the output is 9
 */
        int [] arr1 = {2, 8, 2, 5, 9, 6}; // find smallest no
        int [] arr2 = {1, 4, 7, 3, 2}; // find max number

        int ans1 = minimum(arr1);
        int ans2 = maximum(arr2);

        System.out.print("this is the sum of algo : ");
        System.out.println( ans1  + ans2 );

    }
    static int minimum( int [] arr1 ){

        int ansMinimum = arr1[0];

//         assume the arr.length != 0
        //return the minimum value in the array

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] < ansMinimum ){

                ansMinimum = arr1[i];

            }
        }
        return ansMinimum;
    }
    static int maximum(int [] arr2 ){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr2.length; i++) {

            if(arr2[i] > max){
                max = arr2[i];

            }

        }
        return max;
    }
}
