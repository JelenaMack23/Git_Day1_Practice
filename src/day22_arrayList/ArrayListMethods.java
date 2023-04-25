package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10); // 0 index
        list.add(20); // 1 index
        list.add(30); // 2
        list.add(10); // 3

        list.add(1,15);  // index 1
        System.out.println(list);

        list.add(2,25);
        System.out.println(list);

        System.out.println("-------------------------------------------------------");

        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Mohammad");
        studentList.add("Abdurasul");
        studentList.add("Abidulah");
        studentList.add("Tatiana");

        System.out.println(studentList.size());
        System.out.println(studentList);

        String firstStudent = studentList.get(0);

        String lastStudent = studentList.get( studentList.size() -1 );
        System.out.println(firstStudent);
        System.out.println(lastStudent);




    }
}
