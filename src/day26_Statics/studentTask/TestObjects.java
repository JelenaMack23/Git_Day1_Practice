package day26_Statics.studentTask;

public class TestObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Yusuf", 21, 'M', "A16");
        Student student2 = new Student("Glenio", 24, 'M', "B34");
        Student student3 = new Student("Sumvaye", 22, 'M', "C56");   // these are 5 students objects
        Student student4 = new Student("Mehmet", 25, 'M', "D43");
        Student student5 = new Student("Sebastian", 23, 'M', "E27");

        Student[] students = {student2, student3,student4,student5}; // 4 students added to this Array

        StudentGroup group1 = new StudentGroup("Java Turtles", 1); // we created StudentsGroup object with group name and number because that the only Contractor we have in student custom class

        group1.addStudent(student1); // one student added by using addStudent method

        group1.addStudent(students); // prints all students from the array

        group1.addStudent("Jelena", 34, 'M', "F35"); //its adding new student by creating student object

        System.out.println(group1);

        group1.removeStudents("D43");
        group1.removeStudents("E27");

        System.out.println(group1);

        for (Student each  : group1.students) { // shortcut group1.students.for
            System.out.println(each.name + " : " + each.id);
        }

        System.out.println("---------------------------------------------");

        Student student7 = new Student("Iva", 23, 'M', "A16");
        Student student8 = new Student("Mato", 33, 'M', "B34");
        Student student9 = new Student("Jack", 34, 'M', "C56");   // these are 5 students objects
        Student student10 = new Student("Matt", 55, 'M', "D43");
        Student student11 = new Student("Selina", 33, 'M', "E27");

        Student[] students1 = {student7,student8,student9,student10,student11};


        StudentGroup group2 = new StudentGroup("Java Crocks", 2);

        group2.addStudent(student7);
        group2.addStudent(students);

        for ( Student each : group2.students){
            System.out.println(each.name + each.age);
        }


        StudentGroup group3 = new StudentGroup("Java Bears", 3);

        StudentGroup group4 = new StudentGroup("Java Ninjas", 4);

        StudentGroup[] group5 = {group1,group2,group3,group4 }; // store all in Array at the end

        // create those groups and store all students objects in those groups
        // iterate and display all names of all groups // for each loop


    }

}


/*Create a class named TestObjects
	            3.1 Create 5 Student objects
                        3.2 Create a StudentGroup object
                        3.3 Add all the student objets to the StudentsGroup object' students list
                        */