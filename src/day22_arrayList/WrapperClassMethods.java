package day22_arrayList;

public class WrapperClassMethods {

    public static void main(String[] args) {


           String str = "20";

        System.out.println(str + 1);

       int num1 =  Integer.parseInt(str); // unboxing

        System.out.println(num1 + 1);

        Integer num2 = Integer.valueOf(str);

        System.out.println(num2);

        System.out.println("-------------------------------------------------------------");

        String s = "20.5";

       double num3 = Double.parseDouble(s);

       Double num4 = Double.valueOf(s);

        System.out.println(num3);
        System.out.println(num4);

        System.out.println("--------------------------------------------------");

        String x = "Maybe"; // it has to written true or false

        boolean r1 = Boolean.parseBoolean(x);  // boolean can only be true or false not a word like maybe

        Boolean r2 = Boolean.valueOf(x);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("--------------------------------------------------------------------");

        char ch = '$';

        boolean isDigit = Character.isDigit(ch);

        boolean isLetter = Character.isLetter(ch);

        boolean isLowerCaseLetter = Character.isLowerCase(ch);

        boolean isUpperCaseLetter = Character.isUpperCase(ch);

        boolean isSpecialChar = !Character.isLetterOrDigit(ch); // special character

        System.out.println("is digit = " + isDigit);

        System.out.println(" is letter = " + isLetter);

        System.out.println(" isLoweCaseLetter = " + isLowerCaseLetter); // the given character is A upper case so it will be false

        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);

        System.out.println("isSpecialChar = " + isSpecialChar);

        System.out.println("------------------------------------------------------");

        String string = "a1b2c3d4e5";   // print a sum of chars

        int sum = 0;

        for (char each : string.toCharArray()){

            if(Character.isDigit(each)){
                    sum += Integer.parseInt(("" + each));

            }
        }

        System.out.println("sum is = " + sum);



        }
}
