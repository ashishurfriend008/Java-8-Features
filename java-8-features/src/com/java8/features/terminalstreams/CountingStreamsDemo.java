package com.java8.features.terminalstreams;

import com.java8.features.data.StudentDataBase;

import static java.util.stream.Collectors.counting;

public class CountingStreamsDemo {

    public static long count(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(counting());
    }

    public static long countAndFilterGPA(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() >= 3.9)
                .collect(counting());
    }


    public static void main(String[] args){

        System.out.println("Counting :- " +count());

        System.out.println("Counting And Filtering Out GPA :- " +countAndFilterGPA());


    }
}
