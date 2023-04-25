package day20_forEach;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {

        int[] score = {70, 100, 80, 90, 65};

        System.out.println(Arrays.toString(score));

        String result = Arrays.toString(score); // Array assigned to a String variable result

        System.out.println(result);

        System.out.println("---------------------------------------------------------------");

        int[] a1 = {1, 2, 3, 4, 5}; // true only if the elements are  in a same order....
        int[] a2 = {1, 2, 3, 4, 5};

        boolean r1 = Arrays.equals(a1, a2);

        System.out.println(r1);

        char[] ch1 = {'A', 'B', 'C'};  // false because they are in different order
        char[] ch2 = {'A', 'C', 'B'};

        Boolean r2 = Arrays.equals(ch1, ch2);

        System.out.println(r2);

        String[] s1 = {"A", "B", "C"}; // in this array elements are String object
        String[] s2 = {"A", "C", "B"};

        System.out.println(Arrays.equals(s1, s2));  // we are passing two array objects s1 and s2 to be checked if they are true

        System.out.println("--------------------------------------------------------");

        int[] nums = {100, 80, 90, 75, 88, 99, 0, 5, 4, 1000, 500 };

        System.out.println(Arrays.toString(nums)); // before sort
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));  // after sort

        System.out.println("Minimum number: " + nums[0]);
        System.out.println("Maximum number: " + nums[nums.length-1]);

        System.out.println("------------------------------------------------------------------");

        String[] b1 = {"A", "B", "C"};
        String[] b2 = {"A", "C", "B"};

        Arrays.sort(b1);   // put them inn the same order, ascending order    A, B, C
        Arrays.sort(b2);    // A, B, C

        System.out.println(Arrays.equals(b1, b2));

        System.out.println("_____________________________________________________________");

        String[] students = {"Yana","Jelena", "Marko", "Zeljko", "Nikola"};

        System.out.println(Arrays.toString(students));

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        int[] array = {10,20, 30, 40, 50 , 60 , 70 };

        int[] array2 = Arrays.copyOf(array ,4); // type number of elements from array or as many you need

        System.out.println(Arrays.toString(array2));

        System.out.println("--------------------------------------------------------------");

        int[] n1 = {1,2,3,4,5};
        int[] n2 = {6, 7, 8, 9, 10, 11, 12};

        int[] n3 = Arrays.copyOf(n1, n1.length + n2.length); // it will print only the empty number 0, of the n2 array


        for (int i = 0, j = n1.length; i < n2.length; i++, j++) {  // get the elements of 2nd array , i: is the index number of second array
             n3[j] = n2[i];
        }

        System.out.println(Arrays.toString(n3));

        System.out.println("-------------------------------------------------------------");

        char[] ch = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
          // index:   0    1    2    3    4    5    6

        char[] result1 = Arrays.copyOf(ch, 20);

        System.out.println(Arrays.toString(result1));

        char[] result2 = Arrays.copyOfRange(ch, 2,5); //excludes ending index

        System.out.println(Arrays.toString(result2));

        char[] result3 = Arrays.copyOfRange(ch, 2, ch.length);   // from index 2 till last index

        System.out.println(Arrays.toString(result3));





    }
}
