package week02package;

public class CastingExample {

    public static void main(String[] args) {

        int i = 30;
        long l = i;

        long l2 = 100; // 100 is int by default, int is smaller them long, so mo problems, it will automatically go to long for the variable
        byte b2 = (byte) l2;

        double d3 = 15.99;
        int i3 = (int) d3;

        System.out.println(i3);

        int i4 = 1_000_000;
        byte b4 = (byte)i4; // the byte can not hold this number there is a data lost
        System.out.println(b4); // the result is based on some calculation

       // float f5 = 10.23; // trying to store a double into a float
        float f5 = 10.23F;
        int i5 = (int)f5;
        System.out.println((double)i5); // outcome is 10.0 we are losing data

        char letter = 'A';
        System.out.println((int)letter);

        double d6 = 12.99;
        long l7 = (long)d6;
        System.out.println(l7);















    }
}
