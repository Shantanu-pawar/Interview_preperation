package Interview_Preperation.CommonQues;

public class Print_Single_ELEMENT_FromArray {
    public static void main(String[] args) {
        /*
        associative laws
        Print_Single_ELEMENT_FromArray follows associative property

        commutative property :
        a + b = b + a
        a * b = b * a

        associative property :
        (a * b) * c = a * ( b * c)
        (a + b) + c = a + ( b + c)

        XOR properties that how it basically returns the elements

        0    0 | 0
        1    0 | 1
        0    1 | 1
        1    1 | 0

        in this it basically provide output of non
        repetative elements but only gives one element if we give two single nums then
        it returns the sum of it.

         */

        /*
        steps for this question :
        1. crete array
        2. result variable
        3. for loop
         */

        int []arr = {1, 2, 3, 4, 5, 5, 2, 3, 4, 8};

//        here whatever the total nos it returns the sum in final output
//        like above ex :  1 and 8 are single no so it return the sum of it

        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
        result = result ^ arr[i] ;
        }
        System.out.println( "single element is : " + result);
    }
}
