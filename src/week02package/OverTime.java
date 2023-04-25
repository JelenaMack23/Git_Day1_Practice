package week02package;

public class OverTime {

    public static void main(String[] args) {

        double hourlyRate = 50.0;
        int hoursWorked = 46;
        double netPay;
        String message;

        if(hoursWorked > 40){

            int overtimeHours = hoursWorked - 40;
            netPay = hourlyRate * 40; // your normal pay from 40 hours
            netPay += hourlyRate * 1.5 * overtimeHours; // your overtime you get paid 1.5 times your rate
            message = " wow you worked " + hoursWorked + " so you will get  " + overtimeHours + " hours overtime. Your net pay us $" + netPay;

        }else { // worked less than 40 hours
            netPay = hourlyRate * hoursWorked;
            message = "you worked " + hoursWorked + " hours, so your total net pay is $" + netPay;
        }

        System.out.println(message);

    }
}
