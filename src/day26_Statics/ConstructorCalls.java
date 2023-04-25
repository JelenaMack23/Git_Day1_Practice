package day26_Statics;

public class ConstructorCalls {

    public ConstructorCalls(){
        System.out.println("Default constructors");

    }

    public  ConstructorCalls(int a){
        System.out.println("Constructor with int argument");

        // this(); // constructor call has to be at the first step

    }

    public  ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }

    public  ConstructorCalls(String c){
        this(2.5);
       // this();
        System.out.println("Constructor with string argument");
    }


    public static void main(String[] args) {

        method1();

        System.out.println("-----------------------------------------------------------------------");

        method2();
    }

    public static void method1(){
        System.out.println("Method1");
    }

    public static void method2(){
        method1();
        System.out.println("Method2");
    }

}
