package com.java8.features.terminalstreams;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;
import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.maxBy;
import java.util.Comparator;
import java.util.Optional;

public class MinByMaxByStreamsDemo {

    public static Optional<Student> minByStudent(){
       return StudentDataBase.getAllStudents()
                .stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    //highest grade of all the students
    public static Optional<Student> maxByStudent(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args){

        System.out.println("minBy Student :- " +minByStudent());
        System.out.println("maxBy Student :- " +maxByStudent());



    }
}
