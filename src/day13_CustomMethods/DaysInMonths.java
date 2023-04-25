package day13_CustomMethods;

import java.util.Scanner;

public class DaysInMonths {

    public static void main(String[] args) {

        int month = new Scanner(System.in).nextInt();

        if (month <  1 || month > 12 ){    // if the month is invalid
            System.err.println("Invalid number");
            return; // terminates teh main method
            // what ever code you have after this line will never get executed
        }
         switch (month){   // 1 ~ 12
             case 2:
                 System.out.println("28 days");

             case 4: case 6: case 9: case 11:
                 System.out.println("30 days");
                break;

             default:
                 System.out.println("31 days");





         }



    }
}
