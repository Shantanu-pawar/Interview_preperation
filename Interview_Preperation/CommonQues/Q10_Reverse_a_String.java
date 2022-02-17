package Interview_Preperation.CommonQues;

public class Q10_Reverse_a_String {
    public static void main(String[] args) {

        String name = "shantanu";
        String rev = "" ;

        for (int i = name.length()-1 ; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println("Reverse of "+ name + " is " + rev);


    }
}
