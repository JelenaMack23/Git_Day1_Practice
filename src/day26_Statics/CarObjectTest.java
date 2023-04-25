package day26_Statics;

public class CarObjectTest {

    public static void main(String[] args) {


            Car car1 = new Car("BMW");

            System.out.println(car1);

            Car car2 = new Car("Audi", "Q4");

            System.out.println(car2);

            Car car3 = new Car("Toyota", "Camry", 2021);

            System.out.println(car3);

            Car car4 = new Car("Honda", "Accord", 2020, 30000);

            System.out.println(car4);

            Car car5 = new Car("Lexus", "RX345", 2020, 25000,"black");

           System.out.println(car5);
    }
}
