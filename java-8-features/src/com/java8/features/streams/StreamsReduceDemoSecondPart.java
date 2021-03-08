package com.java8.features.streams;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;
import java.util.Optional;

/**
 * Use case - We are going to elaborate student database and then we are going
 * to find out how to reduce the student who has the highest gpa in this whole
 * collection that we have.
 */

public class StreamsReduceDemoSecondPart extends Object{


    public static  Optional<Student> getHighestGPAStudent() {

        return StudentDataBase.getAllStudents().stream()
                // reduce operation is going to get the students one by one
                .reduce((s1, s2) -> {
                    /*
                    this condition determines which student has the highest gpa.
                    And, then compares that with every value that is being passed
                    over the stream and maintains the highest student with the highest
                    grade and that student returns towards the end.
                     */
                    if (s1.getGpa() > s2.getGpa()) {
                        return s1;
                    } else {
                        return s2;
                    }
                });
    }

    //same implemented method i.e. getHighestGPAStudent() but logic more readable
    public static Optional<Student> getHighestGPAStudent_DifferentLogic(){

        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2);
    }


    public static void main(String[] args) {

        Optional<Student> optionalStudent1 = getHighestGPAStudent();
        if(optionalStudent1.isPresent()){
            System.out.println(optionalStudent1.get());
        }

        Optional<Student> optionalStudent2 = getHighestGPAStudent_DifferentLogic();
        if(optionalStudent2.isPresent()){
            System.out.println(optionalStudent2.get());
        }

    }

    }
