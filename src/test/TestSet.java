package test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TestSet {

    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

        Student  st1 = new Student("A", 10);
        Student  st2 = new Student("As", 20);
        Student  st3 = new Student("Y", 100);
        Student  st4 = new Student("A", 9);

        set.add(st1);
        set.add(st2);
        set.add(st3);
        set.add(st4);

        for (Student st:
             set) {
            System.out.println(st.name);
        }


    }
}

class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}