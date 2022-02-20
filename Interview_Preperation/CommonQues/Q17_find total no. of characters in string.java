package Interview_Preperation.CommonQues;

public class Q17_count_Total_No_In_Char_inString {
//    program-to-count-the-total-number-of-characters-in-a-string:
    

    /*
    steps : 1. take 1 string
            2. for loop ghetla
            3. name charAt(i) check kela  != ' '
            4. print the count
     */

    public static void main(String[] args) {

        String name = " The12345  ";
        // note : the output don't count the spaces
        int count = 0;

        //Counts each character except space
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != ' ')
                count++;
        }

        //Displays the total number of characters present in the given string
        System.out.println("Total number of characters in a string: " + count);

    }
}
