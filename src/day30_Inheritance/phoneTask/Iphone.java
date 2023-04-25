package day30_Inheritance.phoneTask;

public class Iphone extends  Phone {  // Iphone Is A Phone



    public static boolean hasApplePay = true;  // unique for Iphone only

  public Iphone( String model, String color, double price) {
    super("Apple", model, color, price);
  }


  public void facetime(long phoneNumber){
    System.out.println(getModel() + " is face timing with " + phoneNumber);

    }

  public void facetime(String email){
    System.out.println(getModel() + " is face timing with " + email);

  }


}
/*2.1 Iphone:
        Extra methods:
        faceTime(phoneNumber)
        faceTile(email)

 */