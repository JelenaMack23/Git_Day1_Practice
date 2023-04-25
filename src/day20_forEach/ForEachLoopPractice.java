package day20_forEach;

import java.util.Arrays;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int each : numbers) {
            System.out.print(each);

            if(each % 2 != 0){       // print all even numbers
                System.out.print(each);
            }
        }

        System.out.println("----------------------------------------------------------");

        int[] nums = {100, 20, 30, 40, 5, 4, 3, 1, 2, 1000, 300, 500 };

        int max = nums[0];
        int min = nums[0];

        for (int each : nums){
            if(each > max){  // each is number in the array
                max = each;  //  assign each to variable max
            }

            if(each < min){
                min = each;
            }

        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("--------------------------------------------------------------");

        int[] a1 = {10, 20, 30, 40, 50};
        int[] a2 = {60, 70, 80, 90, 100, 110, 120};

        int[] a3 = new int [a1.length + a2.length];

        int k = 0;   // index number of first array to be used

        for (int each : a1) {  // calling for each loop from the a1
            a3[k++] = each;
        }
        for (int each : a2) {      // calling for each loop from the a2
            a3[k++] = each;
        }

        System.out.println(Arrays.toString(a3));

        System.out.println("------------------------------------------------");

        String[] names = {"Jelena Mackovic", "Zeljko Davidovic", "Nikola Lucic", "Ana Mackovic"};

        for (String each : names) {
            System.out.println(each.charAt(0) + "." + each.charAt(each.lastIndexOf(" ") + 1 ));
                                                       // + 1 will return first character after space " "
        }
    }
}
