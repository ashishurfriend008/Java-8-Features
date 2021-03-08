package com.java8.features.streams;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Use Case - Want student names and their list of activities in a map.
 *
 */
public class StreamsDemo {

    public static void main(String[] args) {

        Predicate<Student> studentPredicate  = (student -> student.getGradeLevel() >= 3);
        Predicate<Student> studentGPAPredicate  = (student -> student.getGpa() >= 3.9);

        //student and their activities in a map
        Map<String, List<String>> studentMap =  StudentDataBase.getAllStudents().stream()
                .collect(Collectors.toMap(Student::getName,Student::getActivities));

        //student and their activities in a map
        Map<String, List<String>> studentPredicateMap =  StudentDataBase.getAllStudents().stream()
                .filter(studentPredicate) //stream of students
                .filter(studentGPAPredicate) //stream of students
                .collect(Collectors.toMap(Student::getName,Student::getActivities)); //desired output

        //what is being passed to stream method to filter method i.e.peek() method which accepts a consumer
        //consumer accepts input and doesn't return any output.
        //Here, stream is parsing the elements from the top to the bottom one by one and it is applying the filter
        //on the elements one by one.This process we can debug and see what is being passed from one operation to other.
        Map<String, List<String>> studentPredicateMapDebugOperation =  StudentDataBase.getAllStudents().stream()
                .peek((student -> {
                    System.out.println(student);
                }))
                .filter(studentPredicate) //stream of students
                //how many students passed from studentPredicate filter to studentGPAPredicate filter
                .peek((student -> {
                    System.out.println("After the 1st Filter :- " +student);
                }))
                .filter(studentGPAPredicate) //stream of students
                .peek((student -> {
                    System.out.println("After the 2nd Filter :- " +student);
                }))
                .collect(Collectors.toMap(Student::getName,Student::getActivities));



        System.out.println(studentMap);

        System.out.println(studentPredicateMap);

        System.out.println(studentPredicateMapDebugOperation);

    }
}
