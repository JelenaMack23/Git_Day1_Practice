package day15_whileLoop;

public class BreakStatement {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 6){        // if i's value reaches 6
                break;              // exits the loop
            }

            System.out.println(i);  // 6 is not printed because println is after the break statement, it will print till 5 (0,1,2,3,4,5)
        }

        // ---------------------------------------------------------

        for (char i = 'A'; i <= 'Z'; i++ ){

            System.out.println(i);

            if ( i == 'J'){
                break;           // break must be after println statement    so J is printed
            }
        }

        //-------------------------------------------------------

        for(;;){
            System.out.println("Hello");
            break;
        }



    }
}
