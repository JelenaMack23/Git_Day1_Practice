package day09_scanner;

import java.util.Scanner;

public class NextLineVSNext {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Enter

        System.out.println("Enter your age: ");
        int age = input.nextInt(); //45+Enter

        input.nextLine(); // Enter

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName " + fullName);


    }
}
