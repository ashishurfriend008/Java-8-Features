package com.java8.features.terminalstreams;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.averagingInt;

public class SumAvgStreamsDemo {

    //summation of all the notebooks
    public static int sum(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(summingInt(Student::getNoteBooks));
    }

    //Average no. of notebooks
    public static double average(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args){

        System.out.println("Total no.of notebooks :- "+sum());

        System.out.println("Average no.of notebooks :- "+average());

    }
}
