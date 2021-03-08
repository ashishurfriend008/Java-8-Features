package com.java8.features.defaults;


import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Default Methods
 * Use Case - Sort students by name.
 */

public class DefaultMethodsComparatorDemo {

    static Consumer<Student> studentConsumer = (student -> System.out.println(student));

    //sorted as per the students name
    public static void sortByName(List<Student> studentList){
        System.out.println("After Sort :- ");

        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    //sorted as per the students GPA
    public static void sortByGPA(List<Student> studentList){
        System.out.println("After Sort student by gpa:- ");

        Comparator<Student> nameComparator = Comparator.comparingDouble(Student::getGpa);
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    public static void main(String [] args){

        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Before Sort :- ");
        studentList.forEach(studentConsumer);

        sortByName(studentList);

        sortByGPA(studentList);

    }
}
