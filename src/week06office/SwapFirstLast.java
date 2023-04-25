package week06office;

public class SwapFirstLast {

    /*/*
    T2SwapFirstLast [methods, String]

    Create a method that has a String parameter and returns a String with the first and last character swapped

    Ex:
        code -> eodc
        ab -> ba
        fa -> a
     */

    public static String swapFirstLastChar(String str){
        int lastIndex = str.length() - 1;
        char first = str.charAt(0);
        char last = str.charAt(lastIndex);
        return last + str.substring(1, lastIndex) +  first;
    }

    public static void main(String[] args) {
        System.out.println(swapFirstLastChar("java"));
        System.out.println(swapFirstLastChar("abcde"));
        System.out.println("az");
        System.out.println("Hello Word");

    }

}
