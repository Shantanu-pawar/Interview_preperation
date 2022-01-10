package Interview_Preperation.CommonQues;


//    palindrome string means after reverse the string it gives same out put
//    like dad = dad (after reverse the string)
//    101  = 101

public class Q6_Palindrome_String {
    public static void main(String[] args) {

        String name = "dad";

        String rev  = "";

        for (int i = name.length()-1 ; i >= 0 ; i--) {
            rev = rev + name.charAt(i);

        }
        if (name.equals(rev))
        {
            System.out.println(name +" : is palindrome String");
        }else{
            System.out.println(name + " : not a palindrome string ");
        }
    }
}
