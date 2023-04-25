package day11_Practice;

public class StringMethods3 {

    public static void main(String[] args) {

        String word = "";

        boolean r1 = word.isEmpty();  // true

        System.out.println(r1);

        //--------------------------------------------------------------------

        String str = "                  ";

        boolean r2 = str.isEmpty();   // false  => contains character space
        boolean r3 = str.isBlank();   // true

        System.out.println();

        //---------------------------------------------------------------------------

        String str1 = "Cydeo";

        String str2 = new String("Cydeo");  // str1 and str2 are 2 different objects

        System.out.println(str1.equals(str2));  //true

        // "------------------------------------------------------------"

        String students = "Hasan Naran Sumve Natalia";
        boolean hasAhmed = students.contains("Ahmed");
        System.out.println("hasAhmed = " + hasAhmed);




    }
}
