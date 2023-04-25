package day24_dateAndTime;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;

public class TestPeronObjects {

    public static void main(String[] args) {

        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person()};

        people[0].setInfo("Daniel", 'M', LocalDate.of(1989,2,25));
        people[1].setInfo("Jelena", 'F', LocalDate.of(1984,2,23));
        people[2].setInfo("Zeljko", 'M', LocalDate.of(1982, 3, 26));
        people[3].setInfo("Mary", 'F', LocalDate.of(1964, 12, 14));
        people[4].setInfo("John", 'M', LocalDate.of(1988, 5, 18));

        ArrayList<Person> studentList = new ArrayList<>();

        studentList.addAll( Arrays.asList(people) );


        for (Person each : people) {
            System.out.println(each.name  + " " + each.dateOfBirth );

        }

        studentList.removeIf( p -> p.age > 55);

        System.out.println(studentList);



// print name and date of birth of each person object
// remove all the person objects that has the age > 55
    }

}
