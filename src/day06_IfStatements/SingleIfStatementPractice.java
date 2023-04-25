package day06_IfStatements;

public class SingleIfStatementPractice {

    public static void main(String[] args) {

        int number = 100;

        boolean isEven = number % 2 == 0;

        if(isEven){
            System.out.println("Even number");
        }

        if (!isEven){
            System.out.println("Odd number"); // true, so this one is printed
        }

        System.out.println("-----------------------------------------------------");

        if(number % 2 == 0){

            System.out.println("Even number"); // true so this will be printed in statement
        }

        if(number % 2 != 0){

            System.out.println("Odd number");
        }












    }
}
