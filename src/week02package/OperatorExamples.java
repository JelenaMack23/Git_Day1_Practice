package week02package;

public class OperatorExamples {

    public static void main(String[] args) {

        int age = 10;
        age++;            // 11
        System.out.println(age);
        System.out.println(age++); // it prints the value of age first, them it updates
        System.out.println(age);

        int num = 5;  //6
        System.out.println(++num);
        System.out.println(num++);

        int x= 15;
        int y = x++;
        System.out.println("x " + x); // x= 15 - > 16
        System.out.println("y " + y);  // 15

        int z = 90;
        int w = --z; // because this is a predecrement we subtract 1 right away
        System.out.println("z " + z); // z = 90 -> 89
        System.out.println("w " + w); // w = 89

        int a = 3; //a = 4
        int b = 5;
        a++;
        int c = a + b;
        System.out.println(c);

        /*
        a++
        int c = a + b

        is the same like
        int c = ++a + b;
         */

    }
}
