package week06office;

public class CharacterOverloaded {

    /*T5CharacterOverloaded [methods, loops, overloading]

    Overload the previous Character Set method by having these parameters:
        char, char

    instead of a fixed set of characters this method will return a String of all the characters between the two defined char parameters

        the first char will determine the starting point and the second character will determine the ending point

    Note: Be careful, if you give characters that cannot be within a range based on the ascii table your method will not work

    Ex:
        ('7', 'P') -> 789:;<=>?@ABCDEFGHIJKLMNOP
        ('X', '}') -> XYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}*/

    public static String getCharacterSet(int start, int end){
        String result = "";
        for(; start <= end; start++){
            result +=(char)start;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getCharacterSet('7', 'P'));
        System.out.println(getCharacterSet(50, 100));
    }
}
