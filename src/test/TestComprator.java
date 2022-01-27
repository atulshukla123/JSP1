package test;

import java.util.*;

public class TestComprator {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Amit", 59);
        Employee emp2 = new Employee("Yash", 9);
        Employee emp3 = new Employee("Krishna", 159);
        Employee emp4 = new Employee("Raj", 592);
        Employee emp5 = new Employee("R1aj", 1);
        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        Comparator<Employee> comparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        Collections.sort(list, comparator);

        for (Employee emp:
             list) {
            System.out.println(emp.name);
        }

    }
}


class Employee{

    String name;
    int age;

    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }


}
