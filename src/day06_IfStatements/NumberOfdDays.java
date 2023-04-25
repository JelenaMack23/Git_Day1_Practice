package day06_IfStatements;

public class NumberOfdDays {

    public static void main(String[] args) {

        double n1 = 10,
                n2 = 1;
        char mathOperator = '#';

        if (mathOperator == '+') {
            System.out.println(n1 + n2);
        }
        if (mathOperator == '-') {
            System.out.println(n1 - n2);
        }
        if (mathOperator == '*') {
            System.out.println(n1 * n2);
        }
        if (mathOperator == '/') {
            System.out.println(n1 / n2);
        }
        if (mathOperator != '+' && mathOperator != '-' && mathOperator != '*' && mathOperator != '/') {
            System.out.println("Invalid operator!");
        }






        /*
        1. Create a class named NumberOfDays.java
2. An integer variable named month is declared and given, Write a
program that can print the number of days in the given month
Ex:
Given:
number = 1
output:
31 days
Hints:
Months that has 31 days are: 1, 3, 5, 7, 8, 10, 12
Months that has 30 days are: 4, 6, 9, 11
Month that has 28 days: 2
         */
    }
}
