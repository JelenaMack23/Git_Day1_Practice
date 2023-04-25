package day06_IfStatements;

public class IdentiffyNumber {

    public static void main(String[] args) {

        int number = 100;

        boolean isPositive = number > 0; // if the number is greater than 0, then it's a positive number
        boolean isNegative = number < 0; // if the number is less than 0, than it's a negative number
        // boolean isZero = number == 0; // if number is equal to zero, then is zero

        boolean isZero = !isPositive && !isNegative; // if the number is not positive and NOT negative,                                                  then it's zero

        System.out.println(number + " is positive number: " + isPositive);
        System.out.println(number + " is negative number: " + isNegative);
        System.out.println(number + " is zero: " + isZero);






        /*
        Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
         */

    }
  }
