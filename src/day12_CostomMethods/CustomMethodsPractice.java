package day12_CostomMethods;

import java.sql.SQLOutput;

public class CustomMethodsPractice {

    public static void main(String[] args) {


        eligibleToBuyAlcohol(13);

        System.out.println("-------------------------------------------------------------");

        oddOrEvenNumber(0);

        System.out.println("---------------------------------------------------------");

        score(50);

    }
// create a method that can check if a person is eligible to buy alcohol (age)

    public static void eligibleToBuyAlcohol(int age) {

        if (age >= 21) {
            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("Not eligible to buy alcohol");
        }

    }


// create a method that can check if a number is odd, or even or zero (number)

    public static void oddOrEvenNumber(int number) {

        if (number % 2 == 0 && number > 0) {
            System.out.println("Number is even");
        } else if (number % 2 != 0 && number > 0) {
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is zero");

        }
    }


// create a method that can calculate the grade of the student (score)

    public static void score(int grade) {

        if (grade >= 0 && grade <= 100) {
            if (grade <= 100 && grade >= 85) {
                System.out.println("A");
            } else if (grade < 85 && grade >= 70) {
                System.out.println("B");
            } else if (grade < 70 && grade >= 55) {
                System.out.println("C");
            } else if (grade < 55 && grade >= 45) {
                System.out.println("D");
            } else if (grade < 45 && grade >= 30) {
                System.out.println("E");
            } else {
                System.out.println("F");
            }


        } else {
            System.out.println("Not a valid result");
        }





    }
}