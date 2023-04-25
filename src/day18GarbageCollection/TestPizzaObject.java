package day18GarbageCollection;

public class TestPizzaObject {

    public static void main(String[] args) {

       Pizza pizza1 = new Pizza();

       pizza1.size = 'L';

       pizza1.setInfo('L', 3, 4);

       Pizza pizza2 = new Pizza();

       pizza2.size = 'M';

       pizza2.setInfo('s', 2,5 );

        System.out.println(pizza1);
        System.out.println(pizza2);

        System.out.println("-----------------------------------------");

        double total = 0;

        for (int i = 0; i < 20; i++) {

            Pizza small = new Pizza();
            small.setInfo('s', 2, 2);
            total += small.calcCost();
            Pizza medium = new Pizza();
            medium.setInfo('m', 3,4);
            total += medium.calcCost();
            Pizza large = new Pizza();
            large.setInfo('l',4,5);
            total += large.calcCost();


        }

        System.out.println("total = " + total);


    }
}
