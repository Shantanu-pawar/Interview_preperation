package Interview_Preperation.Special_arrayReletedQues;
/*
Question : findout Largest Sum in Contiguous SubArray by kadane's algo
and this has O(n) time complexity approach
 */
public class IMPque9_find_sumSubArray {

    public static void main(String[] args) {
        int []arr = {5, -4, -2, 6, -1, 15, -3, 4};
        System.out.println(maxSumSubArray(arr));
    }
    static int maxSumSubArray(int []arr ){
        int maxSum = 0;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum){
                maxSum = currentSum;

            }
            if (currentSum <0){
                currentSum = 0;
            }

        }
        return maxSum;
    }


}