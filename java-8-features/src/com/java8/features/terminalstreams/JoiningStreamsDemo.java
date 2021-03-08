package com.java8.features.terminalstreams;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.stream.Collectors;

public class JoiningStreamsDemo {

    public static String joining_1(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    //Create delimiter String values
    public static String joining_2(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }

    //whole String have prefix and suffix
    public static String joining_3(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining("-","(",")"));
    }


    public static void main(String[] args){

        System.out.println("joining_1 :- " +joining_1());

        System.out.println("joining_2 :- " +joining_2());

        System.out.println("joining_3 :- " +joining_3());

    }
}
