package day12_CostomMethods;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String first = input.nextLine().trim().replace(" ", "");

        System.out.println("Enter your last name:");
        String last = input.nextLine().trim().replace(" ", "");
        // trim ( 0 & replace () methods will make sure that the white spaces & additional spaces between the characters will be removed

        input.close();


    first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
         // "c"   // getting first character of the first name + the remaining characters of the first name

      last = last.substring(0, 1).toUpperCase()   + last.substring(1).toLowerCase();
        System.out.println(first);
        System.out.println(last);

        String full_name = first + " " + last;
        System.out.println(full_name);





    }

}

/*1. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

        input:
        firstName = "cyDEo"
        lastName = "SCHOOL";

        output:
        Cydeo School

        */
