package day23_arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};

        array[0] = 100;

       System.out.println(Arrays.toString(array));

        System.out.println("----------------------------------------------------------------");

        ArrayList <String> groceriesList = new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");

        System.out.println(groceriesList);

       // groceriesList[2] = "Oranges";

        groceriesList.set(2, "Oranges");

        System.out.println(groceriesList);

        groceriesList.add(2, "Chicken");

        System.out.println(groceriesList);

        groceriesList.remove(0);

        System.out.println(groceriesList);

        groceriesList.remove("paper Towels");

        System.out.println(groceriesList);

        System.out.println("___________________________________________________________");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // 0
        numbers.add(20); // 1
        numbers.add(30); // 2
        numbers.add(40); // 3
        numbers.add(50); // 4

       boolean r1 =  numbers.remove( Integer.valueOf(10));  // we removed element 10

        System.out.println(numbers);

     System.out.println(r1);

     numbers.clear();

     System.out.println(numbers);
     System.out.println(numbers.size());



     System.out.println("-------------------------------------------------------");

     ArrayList<String> names = new ArrayList<>();

     names.add("Vasyl");   // 0
     names.add("Vasyl");   // 1
     names.add("Sumeye");  // 2
     names.add("Sumeye");
     names.add("Ali");
     names.add("Sumeye");
     names.add("Shukir");
     names.add("Marika");
     names.add("Marika");

     /* System.out.println( names.indexOf("Vasyl") );  // returns index 0
     System.out.println( names.lastIndexOf("Vasyl"));  // returns index 1

     System.out.println( names.lastIndexOf("Sumeye")); // returns 5   */

     for (String each : names){
      if(names.indexOf(each) == names.lastIndexOf(each)){  // if first and last occurance of element is equal
       System.out.println(each);
       break;
      }
     }

     boolean hasMuhtar = names.contains( "Muhtar" ); // false
     boolean hasAli = names.contains("Ali"); // true

     System.out.println("hasMuhtar = " + hasMuhtar);
     System.out.println("hasAli = " + hasAli);

    }
}
