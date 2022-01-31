package Interview_Preperation.CommonQues;

/*
                deleting element in Array
    steps :  1. crete for loop
             2. take one if condition in that include deleting array element and run for loop
             3. run separate if else to checking count and for printing of array run for loop

 */
public class Q14_delete_element_InArrays {
    public static void main(String[] args) {

        int [] arr = {10, 20, 30, 40, 50, 60, 70};
        int delete = 30 ;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if(delete == arr[i]){
//                    initialised here value of j from i this is always mistake you do

                for (int j = i; j < arr.length -1  ; j++) {
                    // here keep in mind that arr.length -1 is for preventing outOfBound equation
                    arr[j] = arr[j+1];

                }
                count  = count + 1;
                break;
            }
        }
        if(count == 0){
            System.out.println("element Not Found");
        }
        else {
            System.out.print("element deleted Successfully : ");
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");

            }
        }

    }
}
