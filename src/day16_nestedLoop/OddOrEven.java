package day16_nestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       /* String answer = "yes";
        while(answer.equals("yes")){ */ //another way of doing it -- without if block then


        while(true) {


            System.out.println("enter a number:");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is even number");
            } else {
                System.out.println(number + " is odd number");
            }

            System.out.println("Would you like to enter another number? Yes/No");
            String answer = input.next().toLowerCase();

            while ( !(answer.equals("yes") || answer.equals("no")) ){ // while the user provides invalid answer
                System.err.println("Invalid Entry! Would you like to enter another number Yes/ No");
               answer =  input.next().toLowerCase();
            }

            if(answer.equals("no")){
                break;
            }

        }



    }
}
