package day30_Inheritance.phoneTask;

public class Samsung extends Phone {


    public Samsung( String model, String color, double price) {
        super("Samsung", model, color, price);

    }

    public void freeze(){
        System.out.println(getBrand() + " " + getBrand() + " freezes a lot");
    }


}
/*2.2 Samsung:
					Extra methods:
						freeze()
*/