package com.java8.features.streams;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctCountSortedDemo {

    //print distinct student activities
    public static List<String> printDistinctStudentActivities(){
        //flatmap can be used in those scenarios where each and every element in the Stream
        // i.e. it represents a List
        List<String> studentDistinctList = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        return studentDistinctList;
    }

    //count will give the total number of elements in Stream
    public static long printStudentActivitiesCount(){
        //flatmap can be used in those scenarios where each and every element in the Stream
        // i.e. it represents a List
        Long countStudentActivities = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct()
                .count();
        return countStudentActivities;
    }

    public static void main(String[] args) {

        //print unique set of activities that students are participating
        System.out.println("Print Distinct Student Activities :- " +printDistinctStudentActivities());

        System.out.println("Count No. Of Student Activities :- " +printStudentActivitiesCount());

    }
}
