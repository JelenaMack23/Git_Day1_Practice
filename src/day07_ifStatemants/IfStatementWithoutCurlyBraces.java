package day07_ifStatemants;

public class IfStatementWithoutCurlyBraces {

    public static void main(String[] args) {

        int age = 32;

        if(age >= 21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }

        System.out.println("----------------------------------------------");

        if(age >= 21) System.out.println("Eligible");
        else System.out.println("Not Eligible");

        System.out.println("----------------------------------------------");

        // it is not a good practice but its possible








    }
}
