package week04package;

import java.util.Scanner;

public class MiddleCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = input.next();
        input.close();

        word = word.toLowerCase();
        int middleIndex = word.length()/2;

        if(word.length() % 2 == 0){
            // even length - 2 middle characters
        }else {
            // odd length 1 middle characters
            String firstPart = word.substring(0, middleIndex);
            String middlePart ="" + word.charAt(middleIndex);
            middlePart = middlePart.toUpperCase();
                    String lastPart = word.substring(middleIndex + 1);
            System.out.println(firstPart + middlePart + lastPart);
        }













         /*
    MiddleCharacters [indexes, cases, length]

    Create a program that will ask the user to enter a word. Return the word in lowercase expect for the middle character/s in uppercase

    Note: based on if the word is even or odd there will be either two middle characters(even length) or one middle character (odd length)

    Ex:
        input:
            apple
        output:
            apPle

        input:
            JavA
        output:
            jAVa
     */

    }
}
