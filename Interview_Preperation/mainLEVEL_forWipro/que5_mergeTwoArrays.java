package Interview_Preperation.mainLEVEL_forWipro;

public class que5_mergeTwoArrays {
    public static void main(String[] args) {

//      Merge two arrays in third array continuously

        int[] a = {10, 20, 30};
        int[] b = { 40, 50, 60, 70, 80};

//        int [] result = [10 20 30 40 50 60 70 80]

        int len1 = a.length;
        int len2 = b.length;

        int len3 = len1 + len2;

        int[] c = new int[len3];

        for (int i = 0; i < len1; i++) {
            c[i] = a[i];
        }

            for (int i = 0; i < len2; i++) {
                c[len1 + i] = b[i];
            }

        for (int i = 0; i <len3 ; i++) {
            System.out.print(c[i] + " ");

        }



    }
}

