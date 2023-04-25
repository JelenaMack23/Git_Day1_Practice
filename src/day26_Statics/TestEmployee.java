package day26_Statics;

public class TestEmployee {

    public static void main(String[] args) {


        Employee employee1 = new Employee("Jelena");

        System.out.println(employee1);

        Employee employee2 = new Employee("Zeljko", 'M');

        System.out.println(employee2);

        Employee employee3 = new Employee("Ivan", "SDET", 'M');

        System.out.println(employee3);

        Employee employee4 = new Employee("Jasna", "Java Dev", 'F', 100000);

        System.out.println(employee4);

        Employee employee5 = new Employee("Kristian", "CEO");

        System.out.println(employee5);

        Employee employee6 = new Employee("Josko", "Scrum Master", 150000);

        System.out.println(employee6);

    }

}
