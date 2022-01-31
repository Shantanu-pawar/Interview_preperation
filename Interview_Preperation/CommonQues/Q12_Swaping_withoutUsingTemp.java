package Interview_Preperation.CommonQues;

public class Q12_Swaping_withoutUsingTemp {


    public static void main(String[] args) {

        int x = 10;

        int y = 5;

        x = x + y;

        y = x - y;

        x = x - y;

        System.out.println("After swaping:"

                + " x = " + x + ", y = " + y);

    }
}
