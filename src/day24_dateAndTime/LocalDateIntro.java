package day24_dateAndTime;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class LocalDateIntro {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();  // for today's date ... now 2023-4-3
        System.out.println(today);

        LocalDate birthDay = LocalDate.of(2000, 5, 25); // for a specific day

        System.out.println(birthDay);

        System.out.println("---------------------------------------------------");

        System.out.println( today.getYear() );

        System.out.println(today.getMonth());  // April

        System.out.println(today.getMonthValue());  // number of month 4.......

        System.out.println(today.getDayOfWeek());  // Monday

        System.out.println(birthDay.getDayOfWeek()); // Sunday for a birth day


        System.out.println(today.getDayOfMonth());  // 3 (today is April 3rd

        System.out.println(today.getDayOfYear()); // 93 (today is day 93 in the year)


        System.out.println("--------------------------------------------------------");

       today =  today.plusYears(1); // 2023 + 1 = 2024

        System.out.println(today);

        LocalDate graduationDate = LocalDate.of(2025,6,4);

        graduationDate = graduationDate.plusYears(2); // 2027

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusMonths(7);

        System.out.println(graduationDate);

       graduationDate = graduationDate.plusWeeks(7);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusDays(100);

        System.out.println(graduationDate);

        System.out.println("-----------------------------------------------------");

        LocalDate yourBirthday = LocalDate.of(2005,4,1);
        LocalDate yourBrotherBirthday = yourBirthday.minusYears(2).minusMonths(3);

        System.out.println(yourBirthday);
        System.out.println(yourBrotherBirthday);

        System.out.println("-------------------------------------------------------");

        LocalDate birthday1 = LocalDate.of(1994,7,7);
        LocalDate birthday2 = LocalDate.of(1995,6, 7);

        boolean r1 = birthday1.isEqual(birthday2);
        System.out.println(r1);           // false

        System.out.println("------------------------------------------------");

        LocalDate grad_date = LocalDate.of(2023,1,1 );

        System.out.println(grad_date.isBefore( LocalDate.of(2022,12,31)));
        System.out.println( grad_date.isAfter( LocalDate.of(2022, 12, 31)));

        System.out.println("---------------------------------------------------------");

        System.out.println( LocalDate.of(2022,6,16).isLeapYear()); // true or false






    }
}
