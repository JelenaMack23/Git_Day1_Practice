package day14_forLoop;

public class WarmUpTasks {

    public static void main(String[] args) {

       String str3 = combine("one", "eight");

        System.out.println(str3);

        // ---------------------------------------------------------------------------

        System.out.println(sumOf2IntegerNumbers(10, 20));

        System.out.println( sumOd3Integers(10, 20, 30));

        System.out.println( sumOf4IntegerNumbers( 10, 20, 30 , 40));

    }




                                  // one          eight

    public static String combine(String str1, String str2) {

        String result;

      /* if( str1.endsWith( "" + str2.charAt(0))){     // if the first string ends with the first character of second string
           result = str1  + str2.substring(1);
       }else{
           result = str1 + str2;
       } */


        if(str1.charAt(str1.length() - 1) == str2.charAt(0)){ // if the last character of the string is equal to the first character of secon string
             result = str1 + str2.substring(1);  // first character of the second string should be exclude in the second string
        }else{
            result = str1 + str2;
        }


        return result;


    }

      public static int sumOf2IntegerNumbers(int n1, int n2){
           return n1 + n2;
    }


      public static int sumOd3Integers(int n1, int n2, int n3){
       // return  n1 + n2 + n2;

          return sumOf2IntegerNumbers(n1, n2) + n3;
      }

      public  static  int sumOf4IntegerNumbers(int n1, int n2, int n3, int n4){
        //return  n1 + n2 + n3 + n4;
        //  return sumOd3Integers(n1, n2, n3) + n4;
         // return sumOf2IntegerNumbers(n1,n2) + sumOf2IntegerNumbers(n3,n4);
        // return sumOf2IntegerNumbers(sumOd3Integers(n1, n2, n3) , n4);
          return  sumOd3Integers( sumOf2IntegerNumbers(n1, n2), n3, n4);

      }










}



















/*Task1:
	    Create a method named combine that can take two string and then add them together and returns it.
        	But if the last letter of the first word and the first letter of the last letter are the same, return that character once.

	        combine("one", "eight")  ==> oneight

	Task 2:
	    1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers

	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers

	    3. create a method that can find the sum of four integer numbers
	                method name: sumOf4Numbers

	                */