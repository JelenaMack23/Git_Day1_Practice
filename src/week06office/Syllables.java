package week06office;

public class Syllables {


    /*T3Syllables [methods, String, loops]

    Create a method that has a String parameter and returns how many syllables the given word has
        > the String given will have a "-" to separate the different syllables

    Ex:
        ja-va -> 2
        apple -> 1
        ham-bur-ger -> 3
        de-li-ve-ry -> 4
        ball - 1*/

    public static int countSyllables(String str){
        int syllables = str.isEmpty() ? 0 : 1;

        for (int i = 0; i < str.length(); i++) {  // i <= str.length() -1
            if (str.charAt(i) == '-'){  // each dash - is second syllable
                syllables++;  // increment
            }
        }

        return syllables;
    }

    public static void main(String[] args) {

        System.out.println("java " +countSyllables("ham-bur-ger"));
        System.out.println("hamburger " + countSyllables("ja-va"));
        System.out.println("delivery " + countSyllables("de-li-ve-ry"));
        System.out.println("ball " + countSyllables("ball"));
        System.out.println("empty " + countSyllables(""));
    }


}
