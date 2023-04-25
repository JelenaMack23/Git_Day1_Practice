package day17_customClass;

public class UniqueCharacters2 {

    public static void main(String[] args) {




       /* 1. Write a program that can find the unique characters from a String
        Ex:
        str = "aabcccd"

        output:
        bd  */


        String str = "aabcccd";

        String unique = "";

        for (int j = 0; j < str.length() ; j++) {  // second loop checks 1st character


            char ch = str.charAt(j); // finding 1st character --- a     (instead of j was 0 first, for checking index 0 )
            int frequency = 0;
                                                     // i is the index number of every single character of the string
            for (int i = 0; i < str.length(); i++) {   // checks how many times the variable ch appears in the str
                if (str.charAt(i) == ch) {                  // if the ch has appeared in the string:
                    frequency++;                         // increase the frequency by 1
                }

            }
                                // if we are looking for a character which appears 3 times i a string we will put If(frequency == 3)
            if (frequency == 1) {   // if the frequency is one , then is unique
                unique += ch;
            }
        }
        System.out.println(unique);
    }
}
