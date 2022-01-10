package Interview_Preperation.CommonQues;

public class Q13_Swaping_withTemp {
    public static void main(String[] args) {


        int a = 100;
        int b = 200;


        int temp  = b;
        b = a ;
        a = temp    ;
        System.out.println("a = "+a + ", b = "+b);
    }
}
