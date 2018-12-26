package br.com.devdojo.awesome.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

/**
 * Created by Leonardo Sartori on 26/12/2018.
 */

public class Student {
    private int id;
    private String name;
    public static List<Student> studentList;
    static{
        studentRepository();
    }

    public Student(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {

    }

    private static void studentRepository(){
        studentList = new ArrayList<>(asList(
                new Student(1, "Leo"),
                new Student(2, "Joao"),
                new Student(3, "Maria")
        ));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    public static void setStudentList(List<Student> studentList) {
        Student.studentList = studentList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
