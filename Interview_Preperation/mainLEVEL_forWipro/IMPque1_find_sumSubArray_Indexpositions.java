package Interview_Preperation.mainLEVEL_forWipro;

public class IMPque1_find_sumSubArray_Indexpositions {
    public static void main(String[] args) {
        int [] arr=  {4, -2, -3, 4, -1, -2, 1, 5, -3};

        int s = 0; int end =0; int start =0;

        int maxvalue = Integer.MIN_VALUE;
                int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i] ;

            if (maxvalue < currSum){
                maxvalue = currSum ;
                start = s;
                end = i;
            }

            if (currSum < 0){
                currSum = 0;
                s =i + 1; // this is for identify starting position of subArray
            }
        }
        System.out.println(maxvalue);
        System.out.print("starting index position : " + start );
        System.out.println();
        System.out.print("ending index position : " + end);
    }
}
