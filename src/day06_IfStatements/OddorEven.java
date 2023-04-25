package day06_IfStatements;

public class OddorEven {

    public static void main(String[] args) {

        int number = 75;

        boolean isEven = number % 2 == 0; // When we divide a number by 2, if the remainder is 0 it                                         means that the number is even
        // boolean isOdd = number % 2 != 0 // When we divide number by 2, if the remainder is NOT 0,                                         means number is odd

        boolean isOdd = !isEven; // if the number is not even, then its odd

        System.out.println(number + " is an even number: " + isEven );
        System.out.println(number + " is an odd number: " + isOdd);





    }
}
