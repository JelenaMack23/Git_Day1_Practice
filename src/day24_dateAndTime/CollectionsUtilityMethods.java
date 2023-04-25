package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        System.out.println(names);

      /*  for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals("Java")){  // get the index from
                names.set(i, "Python");   // index to replace
            }

        }  */

        Collections.replaceAll(names, "Java", "Python");

        System.out.println(names);


        System.out.println("---------------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20,20, 30, 40, 40, 50, 50, 50, 50, 50, 60, 60, 50, 50));

      int num =   Collections.frequency(list, 50); // every time 50 is matching it will print the frequency count of 50
        System.out.println(num);

        System.out.println("-----------------------------------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        int countWord = Collections.frequency(words, "Java");

        System.out.println(countWord);

        System.out.println("----------------------------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 20,20, 30, 40, 40, 50, 50, 50, 50, 50, 60, 60, 50, 50));

        for (Integer each : numbers) {
            if (Collections.frequency(numbers, each) == 1) {   // task: Print unique numbers
                System.out.println(each);
            }

        }





    }
}
