package day18GarbageCollection;

public class GarbageCollection {

    public static void main(String[] args) {

        String s1 = "Java";
        s1 = null;   // will be eligible for garbage collection

        System.out.println(s1);

     //    System.out.println(s1.toLowerCase());   not possible

      //  System.out.println(s1.replace(null, "Python"));

        String a = "";
        String b = null;

        System.out.println("--------------------------------------------------");

        String str1 = "Python";
          str1 = "CYDEO";

        System.out.println(str1);








    }




}
