package day21_MultDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {

        String[] group1 = {"Jelena", "Marija", "Ana", "Ivo"}; //4 names
        String[] group2 = {"Marvin", "Samuel", "Rahvan"}; //3
        String[] group3 = {"Zeljko", "Nikola", "Kristijan", "Arainna", "David"};  //5
        String[] group4 = {"Vesna", "Mariana"};  //2

        String[][] groups = {group1, group2, group3, group4};
        //                    0         1       2        3

        for (int i = 0; i < groups.length; i++) {     // getting each group // shortcut groups fori
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (int j = 0; j < eachGroup.length; j++) {   // shortcut groups fori
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }

        }

        System.out.println("-------------------------------------------------------------------------");


        for (String[] each : groups) {
            System.out.println(Arrays.toString(each));
            for (String Student : each) {
                System.out.println(Student);

            }

        }

        System.out.println("_________________________________________________________________________________");

        for (int i = groups.length - 1; i >= 0; i--) {   // shortcut groups.forr    reversed order

            String[] eachGroup = groups[i];

            System.out.println(Arrays.toString(eachGroup));

            for (String eachStudent : eachGroup) {
                System.out.println(eachStudent);
            }

        }

        System.out.println( Arrays.toString(groups)); // toString () ==> for single dimensional Arrays
        System.out.println( Arrays.deepToString(groups)); // deeptoString () ==> for multi dimensional Arrays


    }
}



