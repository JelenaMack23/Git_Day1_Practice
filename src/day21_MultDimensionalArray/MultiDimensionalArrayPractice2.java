package day21_MultDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice2 {

    public static void main(String[] args) {

        int[][] arr2D1 = {{1, 2}, {3, 4, 5}};
        int[][] arr2D2 = {{6, 7, 8, 9}, {10, 11}, {12, 13, 14}};
        int[][] arr2D3 = {{15, 16, 17, 18}};


        // index of  single dA        0          1            0            1            2                  0
        int[][][] arr3d = { {{1, 2}, {3, 4, 5}} , {{6, 7, 8, 9}, {10, 11}, {12, 13, 14}} , {{15, 16, 17, 18}} }; //index: 0~2
        //  index of 2dA:                   0                               1                               2

        // [index of 2nd array][index of 1d array][index of elements]

        System.out.println(Arrays.deepToString(arr3d));

        System.out.println( Arrays.deepToString( arr3d[1] ));  // [[6, 7, 8, 9], [10, 11], [12, 13, 14]]

        System.out.println(Arrays.toString( arr3d[0][1] ) );  //  [3, 4, 5]

        System.out.println( Arrays.toString(arr3d[1] [0]));   // [6, 7, 8, 9]

        System.out.println( arr3d [1] [2] [2] );  // 14

        System.out.println( arr3d [2] [0] [2]); // 17


        System.out.println("----------------------------------------------------------------------");

        // we need 3 lops to print the elements from 1 dim.array, step by step

        for (int i = 0; i < arr3d.length; i++) { // i: index of  each 2 dimensional array  //  shortcut arr3d.fori
            int [] [] each2DArray = arr3d[i];
            System.out.println(Arrays.deepToString(each2DArray));     // print 2dA from 3dA

            for (int j = 0; j < each2DArray.length; j++) {  // j: index number of each 1 dim. array  // shortcut each2DArray
                int[] each1DArray = each2DArray[j];
                System.out.println( Arrays.toString(each1DArray));  // print single dimen. array from 2Da


                for (int k = 0; k < each1DArray.length; k++) {  // k: index num of each element
                    int eachElement = each1DArray[k];
                    System.out.println(eachElement);

                }




                
            }

        }


    }

    }
