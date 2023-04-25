package day13_CustomMethods;

import java.util.Scanner;

public class ReturnStatementPractice {

    public static void main(String[] args) {

        char grade = new Scanner(System.in).next().charAt(0); // user input a or be or c .....

        boolean  isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'D';

        if(!isValid){  // if grade is not valid
            System.err.println("Invalid grade");
            return;
        }

        System.out.println( (grade == 'A')? "Excellent " :(grade == 'B')? "great Job" : (grade == 'C')? "Good" :(grade == 'D')? "passed" : "Failed");



    }
}
