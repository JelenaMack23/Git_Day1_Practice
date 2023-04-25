package day17_customClass;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        /*Write a program that can find the frequency of the characters from a string

                Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
*/

        String str = "aabcccd";

        String result = "";  //a2b1c3d1
                             // a b c d
                             // 2 1 3 1

        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j);   // a // when ever this character is matching with the character of the str then the count should be increased by 1
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) { // every time ch is appeared in str we can increase by 1
                    count++;
                }

            }

            if(result.contains("" + ch)){ // if the character is already included in result
                continue;   // skip that character
            }
                                        // anything you concate to empty string will get you a string at the end
            result += ch + "" + count; // because ch is char and count in int we have to add "" empty string
        }

        System.out.println(result);













    }
}
