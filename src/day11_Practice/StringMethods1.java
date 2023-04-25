package day11_Practice;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "CYDEO SCHOOL";

       str1 = str1.toLowerCase(); // "cydeo school"

        System.out.println(str1);

        // _____________________________________________________________________________________

        String str2 = "java programming";

      // str2 = str2.toUpperCase(); // "JAVA PROGRAMMING"

        String str3 = str2.toUpperCase();

        System.out.println(str2);

        // ------------------------------------------------------------------------------------

        String word = "Wooden Spoon";

        word =  word.toUpperCase(); // "WOODEN SPOON"

         word = word.toLowerCase(); // "wooden spoon"

        System.out.println(word);


        // ------------------------------------------------------------------------------------------

        String str4 = "                       Cydeo School"; // white space

        str4 = str4.trim(); // "Cydeo school"

        System.out.println(str4);

        //----------------------------------------------------------------------------

        String sentence1 = "Today is Sunday. and we have Java Class";

        int index1 = sentence1.indexOf('w');

        System.out.println('w');  // prints 21 because w is 21st character in sentence


        String s1 = "I love java Programming";

        int firstA = s1.indexOf('a'); // prints number of first latter a in a sentence

        System.out.println(firstA);

        int secondA = s1.indexOf("a "); // prints number of first letter a which is near space (second a in sentence here)

        String s2 = "Java Python JavaScript Cydeo Python";

        int a1 = s2.indexOf('a');
        System.out.println(a1);

        int a2 = s2.indexOf("a Python");

        System.out.println(a2);

        int a3 = s2.indexOf("avaS");

        System.out.println(a3);

        int a4 = s2.indexOf("sS");

        System.out.println(a4);

        //------------------------------------------------------------------------------------

        String w = "Java";

     System.out.println( w.indexOf('a')); //1

     System.out.println(w.lastIndexOf('a')); // 3


     String w2 = "Java Python JavaScript Cydeo Python";

     System.out.println(w2.lastIndexOf('a'));
     System.out.println(w2.lastIndexOf('P'));

     //------------------------------------------------------------------------

     String sentence6 = "I love Java programming";

    // String r1 = sentence6.substring(7, sentence6.length());

     String r1 = sentence6.substring(7);

     System.out.println(r1);



     // ----------------------------------------------------------------------------

     String sentence7 = "Today is Sunday, Tomorrow is Monday";

     String tomorrow = sentence7.substring( sentence7.lastIndexOf(' ') + 1);

     System.out.println(tomorrow);

     // --------------------------------------------------------------------------------

     String sentence8 = "I study at Cydeo School";

     String school = sentence8.substring(11); // from begining of index 11 till end

     System.out.println(school);

     System.out.println("------------------------------------------------------------------");

     String str = "Python";
     String result = (str + "\n").repeat(10);
     System.out.println(result);




    }
}
