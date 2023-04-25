package day15_whileLoop;

public class ContinueStatement {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {

          if (i == 2){    // SKIPS number 2,  from 1 to 5 numbers it's not printing only num 2
              continue;
          }
            System.out.println(i);
        }

        System.out.println("------------------------------------------------------");


        for (int i = 10; i < 21 ; i++) {

            if( i % 2 == 0){  // if i is even
                continue;     // it skips current iteration  ==   it will print only odd numbers
            }

            System.out.println(i);

        }
        
        // ----------------------------------------------------------------------------------------

        for (char i = 'A'; i <= 'G'; i++) {  // i: A, B, C, D, E, F, G

            if(i == 'B' || i == 'E') {
                continue;
            }


            System.out.println(i);
        }


        System.out.println("-------------------------------------------------------");

    /*    for (int i = 0; i < 10; i++)
            System.out.println("Hello World");  // only if we have one code fragment we can skip the curley braces
            System.out.println("Hello Cydeo");// and this code can be repeat one statement only
     */


        // find the sum of all the even numbers between 50 ~ 100

        for (int i = 50; i < 101; i++) {
            if (i % 2 == 0){
                System.out.print(i + " "); // space added

            }
        }

        System.out.println();   // used to get in the new line after previous printing

         // 50, 52, 54, 56 ......... 100    // number is increasing by 2, so we can use i += to get all even numbers
        for (int i = 50; i < 101 ; i += 2) {
            System.out.print(i + " ");


        }

        System.out.println();   // used to get in the new line after previous printing

        for (int i = 50; i < 101; i++) {
            if(i % 2 != 0){   // skip all add numbers by using continue ( if the i's value is odd number
                continue; // skip it
            }

            System.out.print(i + " ");

        }

        System.out.println();
    }
}
