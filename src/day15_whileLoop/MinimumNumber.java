package day15_whileLoop;

import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 2147483647;

        for (int i = 0; i < 5 ; i++) {

            System.out.println("Enter a number");
            int num = input.nextInt();    // user will enter the number which will be minimum number

            if(num < min){    //if the user entered entry is greater than the current maximum number then we have
                min = num;    // then user entered number should be the min number

            }

        }
        System.out.println("Minimum nuber is: " + min);

        input.close();
    }
}
/*Write a program that can ask the user to enter a number for 5 times and returns the minimum number
 */