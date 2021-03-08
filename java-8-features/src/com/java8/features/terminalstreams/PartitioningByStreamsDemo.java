package com.java8.features.terminalstreams;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class PartitioningByStreamsDemo {

    //Partitioning by one argument
    public static void partitioningBy_1(){
        Predicate<Student> gpaPredicate = student -> student.getGpa() >=3.8;
        Map<Boolean, List<Student>> partitioningMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPredicate));
        System.out.println("Partitioning Map :- "+partitioningMap);
    }

    //partitioning by two argument
    public static void partitioningBy_2(){
        Predicate<Student> gpaPredicate = student -> student.getGpa() >=3.8;
        Map<Boolean, Set<Student>> partitioningMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(gpaPredicate,toSet()));
        System.out.println("Partitioning Map :- "+partitioningMap);
    }

    public static void main(String[] args){

       // partitioningBy_1();

        partitioningBy_2();

    }
}
