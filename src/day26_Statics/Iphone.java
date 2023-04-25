package day26_Statics;

public class Iphone {


   public static String brand = "Apple";  // static: "Apple" is the brand of all the Iphone objects

   public String model; // instance: different models for iphone objects

   public String color;

   public double price;

   public static String OS = "iOS"; // static = operating system is same for all iphone objects

    public static  String  madeIn = "China";

    public static boolean hasBattery = true;

    public static boolean isTouchScreen = true;

    public static boolean isExpensiveToFix = true;

    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    /* public static void printPhoneInfo(){  // static only accepts statics
        System.out.println("Model: " + model);
    }
          */

    public void printPhoneInfo(){
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    public static void printOperatingSystem(){
        System.out.println("Operating System: " + OS);
    }


}
/*    Attributes :
       brand, model, color, price, OS, madeIn





 */