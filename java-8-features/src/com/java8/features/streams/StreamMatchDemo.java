package com.java8.features.streams;

import com.java8.features.data.StudentDataBase;

public class StreamMatchDemo {

    public static Boolean allMatch(){

        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa() >= 3.5);
    }

    public static Boolean anyMatch(){

        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa() >= 4.0);
    }

    public static Boolean noneMatch(){

        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa() >= 4.1);
    }

    public static void main(String[] args){

        System.out.println("Result of all Match :- " +allMatch());
        System.out.println("Result of any Match :- " +anyMatch());
        System.out.println("Result of none Match :- " +noneMatch());

    }
}
