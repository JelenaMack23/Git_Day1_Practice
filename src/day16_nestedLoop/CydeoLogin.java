package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogin {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = input.next();

        System.out.println("Enter your password:");
        String p = input.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) { //if the credentials are correct
            System.out.println("Logged in");
        } else {  // otherwise

            for (int i = 0; i < 3; i++) {  // when i : 0, 1, 2 then these conditions under will be printed (when i is true)
                if(i != 2) {    // when the 2 is not true the print this:
                    System.err.println("Incorrect username or password, please re-enter");
                }else{
                    System.err.println("This your last chance, please re-enter your username nad password");
                }
                System.out.println("Enter your username");
                u = input.next();

                System.out.println("Enter your password:");
                p = input.next();

                if(u.equals("Cydeo") && p.equals("WoodenSpoon")){  // if the user enters valid credentials
                    System.out.println("You are logged in");
                    break;  // exits the loop
                }
            }

              // if non of above is true then print this:  (after all three attempts, if the u and p are still incorrect)
            if ( ! (u.equals("Cydeo") && p.equals("WoodenSpoon"))) {
                System.out.println("Your account is now locked, please contact with the support team.");
            }
        }
           input.close();

    }

    public static void cydeoLogIn(String username, String password){
        if(username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("Logged In");
        }else {
            System.out.println("Invalid username");
        }
    }







/*Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                   password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is lucked."

*/
}