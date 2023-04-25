package day20_forEach;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

      int[] array = {1,2,3,4,5};

      int[] reverse = new int[array.length]; // {5,4,3,2,1}  // j is first index number of this new array (reversed)

        for (int i = array.length - 1, j = 0; i >= 0; i--,j++ ) {
           reverse[j] = array[i];          // i is in a reversed(backward direction) order, j is in a forward direction
        }              // when we assign i to j, i will give the arrays elements from first to last element
                       // new array (reverse) will start from index 0 to last index
        System.out.println(Arrays.toString(reverse));


        System.out.println("---------------------------------------------");

        int[] nums = {100, 200, 300, 400, 500};
        nums = ArraysUtility.reverse(nums);

        for (int i = nums.length - 1; i >= 0; i--) {
            
        }

        System.out.println(Arrays.toString(nums));

        System.out.println("--------------------------------------------");



        double[] a1 = {1.5, 2.5, 3.5, 4.5};
        a1 = ArraysUtility.reverse(a1);

        System.out.println(Arrays.toString(a1));

      System.out.println("---------------------------------------------------");

      String[] str1 = {"a", "b", "c"};
       str1 = ArraysUtility.reverse(str1);

      System.out.println(Arrays.toString(str1));

    }
}
/*Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};

	        output:
	            reversedArray = {5,4,3,2,1};

*/