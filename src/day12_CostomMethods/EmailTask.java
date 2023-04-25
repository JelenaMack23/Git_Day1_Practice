package day12_CostomMethods;

public class EmailTask {

    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";

        String firstName = email.substring(0, email.indexOf("_")); // it will not include the _ , but it will the character before _

        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@")); // it will return the character next to _

        String rest = email.substring(email.indexOf("@")); // it will print everything after @ and the @

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(rest);

        email = lastName + "_" + firstName + rest;

        System.out.println(email);

    }
}







/*Create a class calledEmailTask1.
       Assume that email address is constructed by person's first name and followed by an underscore and last name.

        Write a program that can swap first name with last name in the email (Seperated by an underscore).
        If the email doesn't contain an underscore print the given input email.

            Ex:
                input: mike_tyson@gmail.com
                output: tyson_mike@gmail.com
*/