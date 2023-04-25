package day20_forEach;

import java.util.Arrays;

import utilities.ArraysUtility;  // called the method for the package utilities, class ArraysUtility


public class MergeTwoArrays {

    public static void main(String[] args) {

   int[] arr1 = {1,2,3,4};
   int[] arr2 = {5,6,7};

   int[] arr3 = new int[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all the elements of arr1 and arr2

    int k = 0;

        for (int i = 0; i < arr1.length; i++, k++) {  // i is index number of first array
          arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { // i is for second array's  index number
        arr3[k] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));

        System.out.println("-----------------------------------------");

        int[] a1 = {10, 20, 30, 40, 50, 60};
        int[] a2 = {70, 80, 90};

       int[] a3 =  ArraysUtility.merge(a1,a2);   // name of the merge method from a ArraysUtility class

        System.out.println( Arrays.toString(a3));

        System.out.println("_-----------------------------------------------" );

       double[] b1 = {10.5, 5.5, 3.5, 6.5, 8.5 };
       double[] b2 = {20.5, 15.5, 13.5};

       double[] b3 = ArraysUtility.merge(  b1, b2 );

        System.out.println(Arrays.toString(b3));

        System.out.println("------------------------------------------------");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E'};
        char[] ch2 = {'X', 'Y', 'Z'};


        char[] ch3= ArraysUtility.merge(ch1,ch2);

        System.out.println(Arrays.toString(ch3));

        System.out.println("---------------------------------------");

        String[] str1 = {"A", "B", "C", "D", "E" };
        String[] str2 = {"F", "G", "H"};

        String[] str3 = ArraysUtility.merge(str1, str2);

        System.out.println(Arrays.toString(str3));

    }
}


/* write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}

	        output
	            arr3 = {1,2,3,4,5,6}
*/