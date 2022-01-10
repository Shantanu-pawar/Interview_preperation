package Interview_Preperation.Special_arrayReletedQues;
import java.util.ArrayList ;
import java.util.Arrays ;
public class que1_findTheOdd_EvenNo {

    /*
   This Question covers  : find the even and odd numbers ,and print it ,
                find the sum/ count or even or odd numbers in perticular array and print it

     */

    public static void main(String[] args) {

            int [] arr = {2, 4, 5, 8, 7, 9, 15, 14, 16};

            ArrayList<Integer> evenNo = new ArrayList<>();
            ArrayList<Integer> oddNo = new ArrayList<>();

          for( int i=  0 ; i <arr.length ;i++){

              if(arr[i] % 2 == 0){
                  evenNo.add(arr[i]);
              }
              else{
                  oddNo.add(arr[i]);
              }
          }

          int total = 0;

//          for even Nos
        System.out.print("Print even no here: ");
        for(int no: evenNo){
//
            total = total + no;

              System.out.print( " " +no); // this is for printing all the array of evenNo

          }
        System.out.println(); // for next line
        System.out.println("total no. of even nums are : " + evenNo.size());// .size is used to find how many even or odd nums are there
        System.out.println("sum of all even nos are : " + total); // this is for sum of even nos

        System.out.println("--------------------------------------------------------");


//        for odd Nos
        System.out.print("print odd no here: ");
        for(int no: oddNo){
            System.out.print( " "+ no); // this is for print oddNos
        }
        System.out.println();
        System.out.println("total no. of odd nums are : " + oddNo.size());


    }
}
