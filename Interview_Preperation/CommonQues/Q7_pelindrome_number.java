package Interview_Preperation.CommonQues;

public class Q7_pelindrome_number {
    public static void main(String[] args) {

        int num = 141 ;

        int temp  = num ;
        int rev = 0 , rem;

        while (temp != 0)
        {
            rem = temp % 10;
            rev = rev * 10 + rem ;
            temp = temp / 10;
        }
        if (num == rev)
        {
            System.out.println(num + " : is palindrome number");
        }else{
            System.out.println(num + " : is not palindrome number");
        }

    }
}
