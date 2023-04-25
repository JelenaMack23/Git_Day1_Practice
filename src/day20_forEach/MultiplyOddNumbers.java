package day20_forEach;

import java.util.Arrays;

public class MultiplyOddNumbers {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,}; // size of this object is 10, it has 10 elements

        for (int i = 0; i < numbers.length; i++) { // iteration started from index 0 till last index of the array (length)

            if(numbers[i] % 2 == 0){
                continue; // skip the even numbers
            }

          numbers[i] = numbers[i] * 2; // assign it back to the index

        }

        System.out.println(Arrays.toString(numbers));
    }
}
/*1. write a program that can multiply each odd number of an integer array by 2
        ex:
        array = [1,2,3,4,5];

        output:
        array =[2,2,6,4,10]

 */