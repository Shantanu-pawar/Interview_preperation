package Interview_Preperation.mainLEVEL_forWipro;
import java.util.Scanner;

public class q1_seperate_userInput_nos_evenOdd {
    public static void main(String[] args) {
//   Java program to separate even and odd numbers from an array user input

        Scanner scan=new Scanner(System.in);
//create a scanner object for input

        System.out.print("Enter the array size :\n");

        int size=scan.nextInt();//reads input from user for array size
        System.out.print("Enter the elements of the array :\n");

        int arr[]=new int[size];

        for(int i=0; i<arr.length; i++){
            arr[i]=scan.nextInt();
        }//reads input from user for array elements

        System.out.print("Even numbers are: \n");
        for(int i=0; i<size; i++){
            if(arr[i]%2==0){//separates even numbers
                System.out.println(arr[i]);
            }
        }

        System.out.print("Odd numbers are: \n");
        for(int i=0; i<size; i++){
            if(arr[i]%2==1){//separates odd numbers
                System.out.println(arr[i]);
            }
        }




        /*

        solve by using while loop so easy ,


        Scanner scan=new Scanner(System.in);
//create a scanner object for input

System.out.print("Enter the array size :\n");

int size=scan.nextInt();//reads input from user for array size
System.out.print("Enter the elements of the array :\n");

int arr[]=new int[size];

int i=0;
while(i<size){
        arr[i]=scan.nextInt();//reads input from user for array elements
         i++;
    }

    System.out.print("\nEven numbers are: \n");
i=0;
    while(i<size){
        if(arr[i]%2==0){//separate even numbers
            System.out.println(arr[i]);

        }
        i++;
    }

System.out.print("\nOdd numbers are: \n");
i=0;
    while(i<size){
        if(arr[i]%2==1){//separate odd numbers
            System.out.println(arr[i]);

        }
        i++;
    }
}
         */


    }
}
