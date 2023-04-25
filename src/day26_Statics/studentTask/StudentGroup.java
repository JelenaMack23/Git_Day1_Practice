package day26_Statics.studentTask;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentGroup {  // students group HAS a student

    public  String groupName;
    public int groupId;
    public ArrayList<Student> students = new ArrayList<>();

    public StudentGroup(String groupName, int groupId) {  // creates the student group object by setting the groupName and groupId
        this.groupName = groupName;
        this.groupId = groupId;
        // students = new ArrayList<>(); // size : 0
    }

    public void addStudent(Student student){ // Takes one student object and adds it to ArrayList of students
        students.add(student);
    }

    public void addStudent(String name, int age, char gender, String id){
      //  Student student = new Student(name, age, gender, id);
        students.add(new Student(name, age, gender, id) );
    }// takes name, age, gender, id of students info, creates student object by using the given info, then adds the student object to ArrayList of student

    public void addStudent(Student[] students){
        this.students.addAll( Arrays.asList(students) );
        // Takes one array of students, and adds the array of students to the arraylist of students
    }


    public void removeStudents(String id){
        students.removeIf( p -> p.id.equals(id));
    }// Takes the id and then removes student object with the specified id from arrayList of students


    public String toString() {
        return "StudentGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students =" + students.size() + // add the size to students, to get the number of students
                '}';
    }
}
/*Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constructor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement
*/