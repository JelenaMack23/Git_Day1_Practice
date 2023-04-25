package day28_encapsulation.encapsulation;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Person {

  private String name;
  private int age;
  private char gender;
  private LocalDate dateOfBirth;

  public String getName() {
    if(name == null){
      return  "Unknown";
    }
    return name;
  }

  public void setName(String name) {
    if(name == null || name.isEmpty() || name.isBlank()){
      System.err.println("Unknown");
      System.exit(1);
    }
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if ( age < 0 || age > 100){
      System.err.println("Unknown age");
      System.exit(1);
    }
    this.age = age;
  }

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    if( age != 'M' || age != 'F'){
      System.err.println("Unknown gender");
      System.exit(1);
    }
    this.gender = gender;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    if ( dateOfBirth.isAfter(LocalDate.now() ) ){
      System.err.println("DOB cant be after today's day");
      System.exit(1);
    }
    this.dateOfBirth = dateOfBirth;
  }

  public Person(String name, int age, char gender, LocalDate dateOfBirth) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.dateOfBirth = dateOfBirth;
  }


  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", gender=" + gender +
            ", dateOfBirth=" + dateOfBirth +
            '}';
  }
}
/*      Variables:
              name, age, gender, dateOfBirth

              name:
              Write: can not be null/empty/blank
              Read: if name is null, return "Unknown" instead

              age:
              Write: age can not be less than zero or greater then 120

              gender:
              Write: gender can only be 'M" or 'F'

              dateOfBirth:
              Write: can not be after today's date

              Add a constructor that can set all the fields

              Add toString()

 */