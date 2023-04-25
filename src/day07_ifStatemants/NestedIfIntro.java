package day07_ifStatemants;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 95;

        if (score >= 0 && score <= 100) {

            if (score >= 60) {
                System.out.println("Passed");
            } else {  // if the score is less then 60
                System.out.println("Failed");
            }

        } else {
            System.out.println("Invalid Score");
        }

        System.out.println("-------------------------------------");

        int age = -200; // 1 ~ 150 precondition

        if (age >= 1 && age <= 150) {

            if (age >= 21) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not Eligible");
            }

        } else {
            System.out.println("Invalid age");
        }


    }
}
