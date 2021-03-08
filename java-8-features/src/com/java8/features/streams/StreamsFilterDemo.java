package com.java8.features.streams;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterDemo {

    public static List<Student> filterStudents(){
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                //filter and send only students whose gender is female
                .filter(student -> student.getGender().equals("female")) //Stream<Student>
                .collect(Collectors.toList());
    }

    public static List<Student> filterStudentsGPA(){
        return StudentDataBase.getAllStudents().stream()
                //filter and send only students whose gender is female
                .filter(student -> student.getGender().equals("female"))
                .filter(student -> student.getGpa() >= 3.9)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("Filter Students Whose Gender is Female :- ");
        filterStudents().forEach(System.out::println);

        System.out.println("Filter Students Whose Gender is Female and GPA >= 3.9 :- ");
        filterStudentsGPA().forEach(System.out::println);

    }
}
