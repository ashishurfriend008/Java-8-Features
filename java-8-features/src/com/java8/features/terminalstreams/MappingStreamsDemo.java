package com.java8.features.terminalstreams;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;



public class MappingStreamsDemo {

    public static void main(String[] args){

        List<String> nameList = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toList()));
        System.out.println("nameList :- " +nameList);

        Set<String> nameSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toSet()));
        System.out.println("nameSet :- " +nameSet);
    }



}
