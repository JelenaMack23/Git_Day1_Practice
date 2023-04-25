package day16_nestedLoop;

public class FrequencyOfTheChar {

    public static void main(String[] args) {


        String str = "ccaaabbbbccccc";
        char ch = 'c';

        int count = 0;

        for (int i = 0; i < str.length(); i++) {   // i : index numbers of str,

            if (str.charAt(i) == ch) {  // if the given character is equal with the string then it will be count,
                                           // it means it has appeared in the String (a is in the string and it will be count by count++)
                count++;
            }

        }

        System.out.println(count);
    }
/*write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'

		     output:
		     	5*/
}