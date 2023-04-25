package day21_MultDimensionalArray;

import java.util.Arrays;

public class IteratingMultidimensionalArray {

    public static void main(String[] args) {

        // index of the elements:          0   1  2  3  4     0   1
        int [] []  arr2D = { {10,20,30} , {40,50,60,70,80} , {90,100} };
        // index od 1D array     0              1                2


        for (int i = 0; i < arr2D.length; i++) {  // i: index number of 1D array

            int[] each1d = arr2D[i];
            System.out.println( Arrays.toString( each1d ) );   // prints the whole array


            for (int j = 0; j < each1d.length; j++) { // j: index number of elements in each 1D array of arr2D

                int eachElement = each1d [j];

                System.out.println(eachElement);
            }
        }

        System.out.println("------------------------------------------------------------");

        for (int[] each1DArray : arr2D) {     // shortcut arr2D.for
            for (int eachElement : each1DArray) { // shortcut each1DArray.for
                System.out.println(eachElement);

            }


        }

    }
}
