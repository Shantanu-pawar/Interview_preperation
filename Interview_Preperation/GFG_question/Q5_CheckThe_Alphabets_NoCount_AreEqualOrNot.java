package Interview_Preperation.GFG_question;

/*
question : Check if count of Alphabets and count of Numbers are equal in the given String

Examples:

Input: str = “GeeKs01234”
Output: Yes
Explanation:
The count of alphabets and numbers are equal to 5.

Input: str = “Gfg01234”
Output: No
Explanation:
The count of the alphabet is 3, whereas the count of numbers is 5.

Approach: The idea is to use the ASCII values of the characters to distinguish
 between a number and an alphabet. After distinguishing the characters, two counters
 are maintained to count the number of alphabets and numbers respectively. Finally,
 both the counters are checked for equality.

The ASCII ranges of the characters are as follows:

Lowercase characters: 97 to 122
Uppercase characters: 65 to 90
Digits: 48 to 57

 */

public class Q5_CheckThe_Alphabets_NoCount_AreEqualOrNot {
    // Function to count the
// number of alphabets
    static int countOfLetters(String str)
    {
        // Counter to store the number
        // of alphabets in the String
        int letter = 0;

        // Every character in the String
        // is iterated
        for (int i = 0; i < str.length(); i++)
        {

            // To check if the character is
            // an alphabet or not
            if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                    || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
                letter++;
        }

        return letter;
    }

    // Function to count the number of numbers
    static int countOfNumbers(String str)
    {
        // Counter to store the number
        // of alphabets in the String
        int number = 0;

        // Every character in the String is iterated
        for (int i = 0; i < str.length(); i++)
        {

            // To check if the character is
            // a digit or not
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
                number++;
        }

        return number;
    }

    // Function to check if the
// count of alphabets is equal to
// the count of numbers or not
    static void check(String str)
    {
        if (countOfLetters(str)
                == countOfNumbers(str))
            System.out.print("Yes\n");
        else
            System.out.print("No\n");
    }

    // Driver code
    public static void main(String[] args)
    {
        String str = "GeeKs01324";
        check(str);
    }
}
