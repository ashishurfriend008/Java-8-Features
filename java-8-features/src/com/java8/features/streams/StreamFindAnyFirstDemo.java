package com.java8.features.streams;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.Optional;

/**
 *
 */

public class StreamFindAnyFirstDemo {

    public static Optional<Student> findAnyStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >=3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >=3.9)
                .findFirst();
    }

    public static void main(String[] args){

        Optional<Student> optionalStudentFindAny = findAnyStudent();
        if(optionalStudentFindAny.isPresent()){
            System.out.println("Found the student " +optionalStudentFindAny.get());
        }else{
            System.out.println("Student not found");
        }

        Optional<Student> optionalStudentFindFirst = findFirstStudent();
        if(optionalStudentFindFirst.isPresent()){
            System.out.println("Found the student " +optionalStudentFindFirst.get());
        }else{
            System.out.println("Student not found");
        }

    }
}
