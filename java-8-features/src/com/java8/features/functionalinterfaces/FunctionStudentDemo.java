package com.java8.features.functionalinterfaces;

/**
 * Use Case -  Going to create map of students and there respective grades.
 */

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentDemo {

    //input is going to be list of students and output is going to be hashmap with students and gpa.
    //input is student
    //implemented whole functionality and assigned this to studentFunction object
    static Function<List<Student>, Map<String,Double>> studentFunction = (students -> {

        //Define a Map
        Map<String,Double> studentGradeMap = new HashMap<>();
        //iterate each and every student and populate each student and their grades
        students.forEach(student -> {
            studentGradeMap.put(student.getName(),student.getGpa());
        });
            return studentGradeMap;
    });

    static Function<List<Student>, Map<String,Double>> studentFunctionGradeLevel = (students -> {

        //Define a Map
        Map<String,Double> studentGradeLevelMap = new HashMap<>();
        //iterate each and every student and populate each student and their grades
        students.forEach(student -> {
            //filter all students who are greater than grade 3 level
            if(PredicateStudentDemo.p1.test(student)){
                studentGradeLevelMap.put(student.getName(),student.getGpa());
            }
        });
        return studentGradeLevelMap;
    });
    public static void main(String[] args) {

        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));

        System.out.println(studentFunctionGradeLevel.apply(StudentDataBase.getAllStudents()));


    }
}
