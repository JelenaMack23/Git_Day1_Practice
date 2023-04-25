package day16_nestedLoop;

public class NestedLoopPractice {


    public static void main(String[] args) {

        String str = "aaaaaaabbcccccddeeeeeff";
        String result = ""; // "bdf"

        for (int j = 0; j < str.length(); j++) {

        char ch = str.charAt(j); // find the frequency of second character (b) == add 1 in (), c add 2 in ()
        int count = 0;
        for (int i = 0; i < str.length(); i++) {  // responsible for comparing ch to each characters of str and
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        if(count == 2 && !result.contains(""+ch)){
            result += ch;
        }

    }

        System.out.println(result);














    }







}
