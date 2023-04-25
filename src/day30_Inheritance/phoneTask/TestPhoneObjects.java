package day30_Inheritance.phoneTask;

public class TestPhoneObjects {


    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "White", 1000.5);

        Samsung samsung = new Samsung("Galaxy, S22", "Black", 1100);

        Nokia nokia = new Nokia("Brick", "Pink", 50);


        iphone.call(911);
        samsung.call(911);
        nokia.call(911);

        iphone.text(123456789);
        samsung.text(123456789);
        nokia.text(123456789);

        System.out.println("-----------------------------------------------");

        iphone.facetime(123456789);

        samsung.freeze();

        nokia.selfDefense();

        System.out.println("------------------------------------");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);



    }
}
