package week05Package;

public class CurrencyConverter {

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


    }/*Multiplication Table [methods, loops]

	create a method that will accept a number. Print the multiplication table for the give number up until 10

	print the results in this format:
		$number x 1 = result
		$number x 2 = result
		...
		$number x 10 = result

		ex:
			number = 4
			4 x 1 = 4
			4 x 2 = 8
			...

	--------------------------------------------------------------------*/






    }




/*
Currency Converter [methods, conditional, operators]

	create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type. return the converted number

	Use the following sample rates for currency conversions
		1 dollar = 0.91 euro
		1 dollar = 121.03 yen
		1 dollar = 14.85 lira
		1 dollar = 1,217.52 won
		1 dollar = 181.45 rupee

	Note: Don't worry about decimal formats, focus on the code to create these conversions

		Ex:
			Input: euro, 100
			Output: 91

		Ex:
			Input: yen, 50
			Output: 6051.5

 */