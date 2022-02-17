package Interview_Preperation.mainLEVEL_forWipro;

/*
logic part : in short in this question basically it sorts to descending order
and then return the 2nd element from that array
 */
public class q2_Find_second_largestElement {
    public static void main(String[] args) {

//        ques : find the 2nd largest element in array but
//         in ans this is ordering decendingly,

        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // this works in unsporting array also;
        int temp;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i +1 ; j < arr.length; j++) {
                if ( arr[i] < arr[j] ) {  // if we have to find smallest element then just change to (> sign)
                    temp = arr[i];       // and basically this is swapping algo for sorting
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " "); // this is for printing decending list
            }

        System.out.println();
        System.out.println(" second largest element is : " + arr[1]); // if we change here 1 to 3 then it find 3rd no,

    }
}
