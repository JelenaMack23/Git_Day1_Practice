package week11_practice.access.b;

import week11_practice.access.a.Computer;

public class Mac extends Computer {

    public static void main(String[] args) {

        Mac obj = new Mac();
        System.out.println(obj.os);
        System.out.println(obj.memory);
       // System.out.println(obj.brand); this was default in different package
      //  System.out.println(obj.hasWifi); this was private, only within class


    }


}
