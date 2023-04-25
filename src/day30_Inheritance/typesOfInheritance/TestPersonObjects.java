package day30_Inheritance.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {

    public static void main(String[] args) {

        Student student = new Student("Lucy", 'F', LocalDate.of(1999,2,4), 'C', "A4"  );

        President president = new President("Daniel", 'M', LocalDate.of(1980, 3,6), LocalDate.of(2020,3,2));

        Teacher teacher = new Teacher("Emily", 'F', LocalDate.of(2002, 2,2), "Math", "c4", 80000);

        System.out.println(student);
        System.out.println(president);
        System.out.println(teacher);

        student.study();
        teacher.teach();
        president.lie();

        System.out.println("--------------------------------------------------------");

        student.eat("Baklava");
        teacher.eat("Kebab");
        president.eat("Donut");

        student.drink("Milk");
        teacher.drink("Tea");
        president.drink("Coffee");




    }


}
