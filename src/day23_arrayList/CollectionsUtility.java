package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7,8));

       int max =  Collections.max(list);
       int min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("-------------------------------------------------------------------");

        ArrayList<String> items = new ArrayList<>();

        items.addAll(Arrays.asList("Eggs", "Potato", "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper Towel"));

        Collections.sort(items);   // sorts in ascending order [Bluberry, Eggs, Milk, Orange, Paper Towel, Potato, Rice, Strawberry, Tomato]

        System.out.println(items);

        System.out.println("-------------------------------------------------------------------");

        Collections.reverse(items);

        System.out.println(items);  // [Tomato, Strawberry, Rice, Potato, Paper Towel, Orange, Milk, Eggs, Blueberry]

        System.out.println("-------------------------------------------------------------------------------------");

        ArrayList<String > students = new ArrayList<>();

        System.out.println(students);

        students.addAll(Arrays.asList("Gadir", "Hasan", "Abdilah", "Bilal"));

        Collections.swap(students,0,1);

        System.out.println(students);

        Collections.swap(students, 0, students.size() - 1);

        System.out.println(students);

        System.out.println("-------------------------------------------------------------");



    }
}
