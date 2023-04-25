package utilities;

public class CoolClass {

    public static double convertFromDollar(String currency, double dollar){

    double result= 0;

        switch (currency.toLowerCase().trim()){
        case "euro":
            result = dollar * 0.91;
            break;
        // instead: return dollars * 0.91;
        case "yen":
            result = dollar * 121.03;
            break;
        case "lira":
            result = dollar * 14.85;
            break;
        case "won":
            result = dollar * 1_217.52;
            break;
        case "rupee":
            result = dollar * 181.45;
            break;
    }

        return  result;


}


}
