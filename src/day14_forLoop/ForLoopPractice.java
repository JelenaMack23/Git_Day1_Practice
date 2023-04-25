package day14_forLoop;

public class ForLoopPractice {

    public static void main(String[] args) {


        for (int i=10; i >= 5; i-- ){   // i : 10,9,8,7,6,5,4  decreasing 10 by 1 and when it reached decreasing after 5 it will make condition false,
            // and when condition is false the execution will stop

            System.out.println("Hello Cydeo"); // 1,2,3,4,5,6
        }

        System.out.println("-------------------------------------------------------");

        // sum of all the numbers 1 ~ 100

        int sum = 0;

        for (int i = 1; i <= 100; i++ ){
            sum += i;  //  used to increase sum by 1
        }

        System.out.println(sum);   // after the {

        // print all the alphabet letters A ~ Z

        for ( char i = 'A';  i <= 'Z'; i++ ){
            System.out.print(i + " ");           // print in one line  // println printing in separate line  // " " space icluded " "
        }

        System.out.println();           // print the new line to start printing from the new line
        System.out.println("Hello");


        System.out.println("-------------------------------------------------------------");
        for (char i = 'Z'; i >= 'A'; i--){
            System.out.print( i + " ");
        // print all the alphabet letters in backwards Z ~ A


        }

        System.out.println();
        System.out.println("Cydeo");












    }
}
