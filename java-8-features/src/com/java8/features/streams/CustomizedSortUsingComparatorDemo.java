package com.java8.features.streams;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Use Case - Customized sort using comparator - students sorted by name
 */

public class CustomizedSortUsingComparatorDemo {

    public static List<Student> sortStudentsByName(){
         return StudentDataBase.getAllStudents().stream()
                 //creating instance of comparator and calling the comparing method
                 //which accepts Function as input
                .sorted(Comparator.comparing(Student::getName))
                 .collect(toList());
    }

    public static List<Student> sortStudentsByGpa(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());
    }

    public static List<Student> sortStudentsByGpaDesc(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());
    }

    public static void main(String[] args) {

        //result sorted in alphabetical order
        System.out.println("Students sorted by Name :- ");
        sortStudentsByName().forEach(System.out::println);

        System.out.println("Students sorted by Gpa :- ");
        sortStudentsByGpa().forEach(System.out::println);

        System.out.println("Students sorted by Gpa Desc :- ");
        sortStudentsByGpaDesc().forEach(System.out::println);
    }
}
