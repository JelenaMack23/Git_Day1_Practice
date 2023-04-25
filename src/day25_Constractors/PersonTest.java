package day25_Constractors;

import java.time.LocalDate;

public class PersonTest {

    public static void main(String[] args) {

     Person person1 = new Person("Jelena", 39, 'F', LocalDate.of(1984,02,23), false, true);
     Person person2 = new Person("Marko", 34, 'F', LocalDate.of(1989,01,30), false, true);
     Person person3 = new Person("Biljana", 35, 'F', LocalDate.of(1988,12,01), false, true);
     Person person4 = new Person("Ana", 24, 'F', LocalDate.of(1988,11,18), false, true);
     Person person5 = new Person("Josip", 26, 'F', LocalDate.of(1996,02,24), false, true);

     person1.eat("apple");
     person2.sleeping();
     person4.drink("orange juice");

        System.out.println(person2);
    }
}
