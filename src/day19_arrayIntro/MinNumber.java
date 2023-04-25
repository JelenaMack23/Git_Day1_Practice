package day19_arrayIntro;

public class MinNumber {

    public static void main(String[] args) {

        int[] numbers = {100, 20, 500, 40, -10, 30};

        int min = numbers[0]; // 100  // we assumed that first element is the minimum number

        for (int i = 1; i < numbers.length; i++) { // i: 1, 2, 3, 4, 5

            if(numbers[i] < min){  // compares the element of the array with current minimum number
                min = numbers[i];  // replace the current minimum number
            }
        }

        System.out.println("max = " + min);





    }
}
