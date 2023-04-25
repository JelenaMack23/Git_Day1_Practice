package day08_ternary_switch;

public class TernariesIntro {

    public static void main(String[] args) {

        int score = 85;

        String result = ""; // its in gray color because is only asingded so we can delete it and use String result; only

        if (score >= 60) {
            result = "Passed";
        } else {
            result = "Failed";
        }

        System.out.println(result);

        System.out.println("________________________________________________");

        // above writen with ternaries:

        String result2 = (score >= 60) ? "Passed" : "Failed";

        System.out.println(result2);

        System.out.println("________________________________________________");


        int age = 34;
        /*
        String r;

        if (age >= 21){
        r = "Eligible";
        }else {
            r = "Not eligible";
        }
       */

        String result3 = (age >= 21) ? "eligible" : "not eligible";

        System.out.println(result3);
















    }
}
