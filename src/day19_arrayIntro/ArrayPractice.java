package day19_arrayIntro;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0] = "Gulcin";
        myGroup[myGroup.length-1] = "Aseel"; // last element of the Array is index 4
        myGroup[2] = "Sumeve";
        myGroup[1] = "Abidullah";
        myGroup[3] = "Kashavar";

        System.out.println(Arrays.toString(myGroup));

        myGroup[1] = "Kuzzat";
        //myGroup[5] = "Muhtar"; not possible because there is no index num 5

        System.out.println(Arrays.toString(myGroup));

        System.out.println("--------------------------------------------------");

        for(int i = myGroup.length-1; i >= 0; i--){  // printing from last index to first
            System.out.println(myGroup[i]);
        }

        System.out.println("--------------------------------------------");

        for (int i = myGroup.length - 1; i >= 0; i--) {
            
        }


    }

}
