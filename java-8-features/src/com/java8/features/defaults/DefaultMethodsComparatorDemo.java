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
    static Comparator<Student> nameComparator =  Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComparator =  Comparator.comparing(Student::getGradeLevel);

    //sorted as per the students name
    public static void sortByName(List<Student> studentList){
        System.out.println("After Sort :- ");

        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    //sorted as per the students GPA - highest gpa at the top and least gpa at the bottom
    public static void sortByGPA(List<Student> studentList){
        System.out.println("After Sort student by gpa:- ");
        Comparator<Student> nameComparator = Comparator.comparingDouble(Student::getGpa);
        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    /*
    comparator chaining - thenComparing() method it is basically used in comparator chaining i.e. we can chain
    multiple comparators.Here, we are going to chain two different comparator operations and then consolidate the
    result and print
     */
    public static void comparatorChaining(List<Student> studentList){
        System.out.println("After comparator chaining :- ");
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);
    }

    /*
        Null First
     */
    public static void sortWithNullValuesFirst(List<Student> studentList){
        System.out.println("After Sort With Null Values First:- ");
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }

    //null last
    public static void sortWithNullValuesLast(List<Student> studentList){
        System.out.println("After Sort With Null Values Last:- ");
        Comparator<Student> studentComparator = Comparator.nullsLast(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }

    public static void main(String [] args){

        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Before Sort :- ");
        studentList.forEach(studentConsumer);

//        sortByName(studentList);
//
//        sortByGPA(studentList);
//
//        comparatorChaining(studentList);

        sortWithNullValuesFirst(studentList);

        sortWithNullValuesLast(studentList);

    }
}
