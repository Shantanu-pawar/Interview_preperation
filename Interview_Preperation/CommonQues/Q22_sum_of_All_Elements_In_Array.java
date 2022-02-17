package Interview_Preperation.CommonQues;

public class Q22_sum_of_All_Elements_In_Array {
    public static void main(String[] args) {
        int  [] arr ={2, 3, 4, 5, 1};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("your sum is : "+ sum);
    }
}
