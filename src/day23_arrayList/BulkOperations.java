package day23_arrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(1, numbers); // inserts elements from another array from index 1
                                 // output [1, 10, 20, 30, 40, 2, 3]
        System.out.println(list1);

        System.out.println("--------------------------------------------------------");

        ArrayList<Integer> scores = new ArrayList<>();

        scores.addAll(Arrays.asList(75,85,85,70,80));  // addAll elements can be used only as a Colletion type with adding Arrays.asList

        System.out.println(scores);

        System.out.println("_---------------------------------------------------------");

        ArrayList<String > students = new ArrayList<>();

        students.addAll(Arrays.asList("Gadir", "Hasan", "Abdilah", "Bilal"));

        System.out.println(students);

        students.addAll(2, Arrays.asList("Shukur", "Sumeve", "Tatiana"));  // add those 3 names starting from index 2
                                                      // output [Gadir, Hasan, Shukur, Sumeve, Tatiana, Abdilah, Bilal]
        System.out.println(students);

        System.out.println("----------------------------------------------");

        Integer[] nums = {1,2,3,4,5,6,7,8}; // this array has to be primitive

        ArrayList<Integer> l1 = new ArrayList<>( Arrays.asList(nums));

      //  l1.addAll( Arrays.asList(nums) );

        System.out.println(l1);

        System.out.println("----------------------------------------------------");

        ArrayList<String> employeeList = new ArrayList<String>();
        employeeList.addAll( Arrays.asList("Alena", "Muhtar", "Gadir", "Ali"));

        System.out.println(employeeList);

        boolean hasAlenaGadir = employeeList.containsAll( Arrays.asList("Alena", "Gadir"));

        boolean hasAlena = employeeList.contains("Alena");

        boolean hasMuhtarAliKuzzat = employeeList.containsAll( Arrays.asList("Muhtar", "Ali", "Kuzzat"));

        System.out.println("HasAlena = " + hasAlena);

        System.out.println("hasAlenaGadir = " + hasAlenaGadir);

        System.out.println("hasMuhtarAliKuzzat = " + hasMuhtarAliKuzzat);

        System.out.println("------------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll( Arrays.asList(10,10,20,30,40,50,60,70,10,10,10,10,20,20,20,20));

        list.removeAll( Arrays.asList(10,20)); // output [30, 40, 50, 60, 70]

        System.out.println(list);

        System.out.println("------------------------------------------------------");

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll( Arrays.asList("Alena", "Muhtar", "Gadir", "Ali", "Kashvahar", "Madivar", "Muhtar", "Muhtar"));

        developers.retainAll( Arrays.asList("Alena", "Kashvahar"));  // output: keep [Alena, Kashvahar]

        System.out.println(developers);

       ArrayList<String> groceriesList = new ArrayList<>();
       groceriesList.addAll(Arrays.asList("Eggs", "Potato", "Milk", "Tomato", "Rice", "Orange", "Strawberry", "Blueberry", "Paper Towel"));

     //  groceriesList.retainAll( Arrays.asList("Eggs", "Potato", "Milk", "Tomato"));

        groceriesList.removeAll( Arrays.asList("Rice", "Orange", "Strawberry", "Blueberry", "Paper Towel"));
        System.out.println(groceriesList);


    }

}
