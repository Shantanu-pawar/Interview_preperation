package Interview_Preperation.CommonQues;

public class WAP_for_NonRepetative_Element {
    public static void main(String[] args) {
        /*
        associative laws
        WAP_for_NonRepetative_Element follows associative property

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

        int []arr = {5, 3, 4, 5, 2, 3, 4};

        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
        result = result ^ arr[i] ;
        }
        System.out.println( "single element is : " + result);
    }
}
