package day26_Statics;

public class TestIphoneObjects {

    public static void main(String[] args) {

        Iphone iPhone = new Iphone("Iphone12", "Black", 1000);

        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);

        iPhone.printPhoneInfo();

       /* System.out.println( iPhone.brand);
        System.out.println( iPhone.OS );
        iPhone.printOperatingSystem(); */

       System.out.println(Iphone.brand);  // instance methode accepts both static and non static
        System.out.println(iPhone.OS);
        Iphone.printOperatingSystem();

    }
}
