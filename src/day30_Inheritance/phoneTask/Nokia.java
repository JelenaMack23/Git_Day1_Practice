package day30_Inheritance.phoneTask;

public class Nokia extends Phone{

    public Nokia( String model, String color, double price) {
        super("Nokia", model, color, price);
    }

    public void selfDefense(){
        System.out.println(getBrand() + " " + getModel() + " can be used for self defense");
    }
}





/*2.3 Nokia:
					Extra methods:
						selfDefense()*/