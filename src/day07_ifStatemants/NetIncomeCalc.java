package day07_ifStatemants;

public class NetIncomeCalc {

    public static void main(String[] args) {

        int salary = 115000;
        boolean isMarried = true;


       double  taxRate = 0; // temporary value which will be replaced soon, we assign it just to be usable

        if(salary >= 130000){
            taxRate = 0.35;
        }
        if(salary >= 100000 && salary < 130000) {
            taxRate = 0.3;          // if the salary is between 100K to 130K then the tax rate should be 30%
        }
        if(salary >= 80000 && salary <= 100000){
            taxRate = 0.25;           // if the salary is between 80K to 100K then the tax rate should be 25%
        }
        if (salary >= 80000){
            taxRate = 0.2;
        }

        if(isMarried){ // if the person is married
            taxRate -= 0.05; // tax is reduced by 5%
        }

        double totalTax = salary * taxRate;
        double netIncome = salary - totalTax;

        System.out.println("netIncome = " + salary);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);









        /*
         3. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129,999k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition:
                	if the person is married, he/she will pay 5% less tax
         */
    }
}
