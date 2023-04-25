package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cydeo School";

        char[] ch = str.replace(" ","").toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("--------------------------------------------------------");

        String str2 = "Today is a great day to learn Java";

        String[] words = str2.split(" great "); // word great is splitting point so it will not be printed, it will split sentence in two elements dividet by comma
                                                      // if we use " " (space) it will give us all words printed so it will be 8 elements
        System.out.println(Arrays.toString(words));


        System.out.println("-------------------------------------------------------");

        String sentence = "I love Java";

        String[] arr =  ArraysUtility.reverse(sentence.split(" ") ); // [I, love, Java]

        System.out.println(Arrays.toString(arr));

        String reversedSentence = "";// "Java love I"

        for (int i = 0; i < arr.length; i++) {
            reversedSentence += arr[i] + " ";
        }

        System.out.println(reversedSentence);
    }


}
