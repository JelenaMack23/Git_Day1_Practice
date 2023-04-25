package day21_MultDimensionalArray;

public class MultiDimensionalArraysPractice3 {

    public static void main(String[] args) {

        int[][][] arr3d1 = { {{1, 2}, {3, 4, 5}} , {{6, 7, 8, 9}, {10, 11}, {12, 13, 14}} };
        int[][][] arr3d2 = { {{1, 2}, {3, 4, 5}} , {{6, 7, 8, 9}, {10, 11}, {12, 13, 14}} };
        int[][][] arr3d3 = { {{1, 2}, {3, 4, 5}} , {{6, 7, 8, 9}, {10, 11}, {12, 13, 14}} };

        int [][][][] arr4D = {  arr3d1 , arr3d2 , arr3d3   };

        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int eachElement : each1D) {
                        System.out.println(eachElement);

                    }
                }

            }
            
        }






        }
}
