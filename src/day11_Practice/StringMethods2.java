package day11_Practice;

public class StringMethods2 {

    public static void main(String[] args) {

        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        sentence = sentence.replace("Python", "Java");

        System.out.println(sentence);

        // ----------------------------------------------------------------------

        String word = "java";

        // word = word.replace('a', 'e'); // "jeve"  replaced all the character a with character e

         word = word.replace("a", "e"); // same just a string

        System.out.println(word);

        // ----------------------------------------------------------------------------------------

        String sentence2 = "I love Java, Java is cool";

        sentence2 = sentence2.replaceFirst("Java", "Python");

        System.out.println(sentence2);

        // ------------------------------------------------------------------------------------

        String sentence3 = "Java is fun, Java is cool, Java is amazing";

        sentence3 = sentence3.replaceFirst(", Java", ", Phython"); // it can be used for a second Java word in a sentence as long as we make it uniq

        // ------------------------------------------------------------------------------------

        String sentence4 = "I love Java Programming";

        String languageName = sentence4.substring(7, 10 + 1);

        System.out.println(languageName);

        // -------------------------------------------------------------------------------------

        String sentence5 = "Today is Sunday, Tomorrow is Monday";
        //                   0123456789...

        String today = sentence5.substring(9, 14+1);

        System.out.println(today);

        //---------------------------------------------------------------------------------------------

        String email = "CydeoSchoolJavaProgramming@gmail.com";

        int beginning = email.indexOf('@') + 1; //
        int ending = email.lastIndexOf('.');   // it will print l because there is no + 1 so it means last index is excluded

          String domain = email.substring(beginning, ending);

        System.out.println(domain);



    }
}

