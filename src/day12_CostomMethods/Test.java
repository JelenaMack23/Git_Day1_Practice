package day12_CostomMethods;

public class Test {

    public static void main(String[] args) {


     int number = 300;


     CustomMethodsWithParameter.oddOrEven(number);



        initial("Mohammed", "Karim"); // M.K

        System.out.println("---------------------------------------------------------");

        initial("Java", "Programming"); // J.P

        System.out.println("------------------------------------------------------");

        maxNum(10000, 5000);

        System.out.println("___________________________________________________");

        maxNum(-200, -20);

        System.out.println("____________________________________________________________");




    }



    public static void maxNum ( double num1, double num2){

        if (num1 > num2) {
            System.out.println(num1 + " is the maximum number");
        } else if (num2 < num1) {
            System.out.println(num2 + " is the maximum number");
        } else {
            System.out.println("Equal");
        }


    }

// create a method that can display the initials of a person (firstName, lastName)

    /*firstname = "Cydeo"
     lastName = "School"

     initial ==>  C.S */
    public static void initial (String firstName, String lastName){

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);

        System.out.println("initial is: " + initial);

    }



}
