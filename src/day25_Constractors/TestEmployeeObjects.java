package day25_Constractors;

import java.time.LocalDate;

public class TestEmployeeObjects {

    public static void main(String[] args) {

        Employee e1 = new Employee("Jelena", 32, 'F',"Java Developer", 120000, LocalDate.of(2023, 12,2));

        Employee e2 = new Employee("Zeljko", 31, 'M', "SDET", 130000, LocalDate.of( 2023, 12,3));

        System.out.println(e1);
        System.out.println(e2);
    }
}
