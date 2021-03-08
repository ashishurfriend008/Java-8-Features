package com.java8.features.streams;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Use Case - print all the activities in a list of StudentDataBase class
 */
public class StreamsFlatMapDemo {

    public static List<String> printStudentActivities(){
        //flatmap can be used in those scenarios where each and every element in the Stream
        // i.e. it represents a List
        List<String> studentList = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .collect(Collectors.toList());
        return studentList;
    }

    public static void main(String[] args) {

        //print all the activities that students are participating
        System.out.println("Print Student Activities :- " +printStudentActivities());


    }

}
