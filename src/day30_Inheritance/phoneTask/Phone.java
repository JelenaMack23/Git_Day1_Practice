package day30_Inheritance.phoneTask;

import java.util.Arrays;

public class Phone {

    private String brand, model, color;
    private double price;

    public Phone(String brand, String model, String color, double price) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String[] colors = {"Black","White", "Silver", "Gold", "Pink" };
        if(Arrays.asList(color).contains(color) ) {
            this.color = color;
        }else{
            System.err.println("Invalid color: " + color + "\n color can only be: " + Arrays.toString(colors) );
            System.exit(1);
        }

    }

    public double getPrice() {
        if( price <= 0 ){
            System.err.println("Onvalid price: " + price);
            System.exit(1);
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println(getModel() + " is calling " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(getModel() + " is texting " + phoneNumber);
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*1. Create a named Phone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. price can not be zero or negative
						2. color can only be set to:
								{"Black", "White", "Silver", "Gold", "Pink"}

				Add a constructor that can set all the fields

				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

	2. Create the following sub classes of Phone:

			2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)

			2.2 Samsung:
					Extra methods:
						freeze()

			2.3 Nokia:
					Extra methods:
						selfDefense()*/