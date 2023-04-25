package day12_CostomMethods;

public class CustomMethodsWithParameter {

    public static void main(String[] args) {

     oddOrEven(100);

        System.out.println("--------------------------------------------");

        oddOrEven(10000);

    }

    // the method takes an argument number, and verifies if its short or even
    public static void oddOrEven(int number){


        if (number % 2 == 0) {  // if the number is evenly divisible by 2 then its even
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }

        int num1 = 100;
        oddOrEven(num1);

        int num2 = 35;
        oddOrEven(num2);

    }

}
