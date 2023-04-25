package day17_customClass;

public class UniqueCharacters1 {

    public static void main(String[] args) {

        /*Warmup Tasks:
	1. Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"

				output:
					bd*/


        String str = "aabcccd";
        String unique = "";

        for (int i = 0; i < str.length(); i++) { // i: index number of the str
            char each = str.charAt(i);

            if(str.indexOf(each) == str.lastIndexOf(each) ){
                unique += each;
            }
        }

        System.out.println(unique);

    }
}
