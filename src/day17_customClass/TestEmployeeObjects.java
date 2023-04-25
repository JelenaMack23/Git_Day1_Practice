package day17_customClass;

public class TestEmployeeObjects {

     public static void main(String[] args) {


          Employee employee1 = new Employee();

          employee1.setInfo("Jelena", 23, 'F', "Full Stack Tester", 170000, "A12");

          Employee employee2 = new Employee();
          employee2.setInfo("Zeljko", 24, 'M', "CEO", 200000, "B16");

          Employee employee3 = new Employee();
          employee3.setInfo("Nikola", 30, 'M', "Java Developer", 150000,"C23");

          employee2.age = 39;

          employee3.name = "Lucy";
          employee3.gender= 'F';

          System.out.println(employee1);
          System.out.println(employee2);
          System.out.println(employee3);

          employee3.work();










     }
}