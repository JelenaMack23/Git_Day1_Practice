package day05_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int x = 10;

        System.out.println( ++x ); //11
        System.out.println(x);

        int y  = 100;

        System.out.println( --y);
        System.out.println(y);

        System.out.println("------------------------------------------------");

        // post increment/decrement

        int a = 50;

        System.out.println( a++ );
        System.out.println(a);

        int b = 25;

        System.out.println(b--);
        System.out.println(b);

        System.out.println("-----------------------------------------------");

        int n = 30;
        int m = n++;  // m = 30, n=31
        System.out.println("n =" + n);
        System.out.println("m = " + m);

        int z = 60;
        int q = z-- ; // q=60, z=59

        System.out.println("z = " + z);
        System.out.println("q = " + q);

        int i = 0;
        int j = i++ + ++i;

        System.out.println(j);














    }
}
