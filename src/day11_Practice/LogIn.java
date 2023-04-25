package day11_Practice;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {


        String correctUserName = "Cydeo", // literal
               correctPassword = "WoodenSpoon"; // literal

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the user name:");
        String username = input.nextLine();  // new

        System.out.println("Enter your password:");
        String password = input.nextLine();

        input.close();


        if(username.equals(correctUserName) && password.equals(correctPassword)){
            System.out.println("You are logged in");
        }else{
            System.out.println("Incorrect username or password. Please try again. ");
        }


    }
}
 /*
 Create a class named LogIn
			2.1 Ask the user to enter the username & password
			2.2 print "You are now logged in" If user entered valid username and password
				otherwise print the error message "Incorrect username or password. Please try again"

			Note: Assume that the valid credentials are:
						username: Cydeo
						password: WoodenSpoon

  */