package com.java8.features.functionalinterfaces;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 *Use Case - It accepts two inputs. First one is going to be the list of students and second one
 * we pass predicate of students(this is the functional interface which we are passing as input to
 * that BiFunction functional interface) as input and output is going to be map of students and
 * their respective
 * GPAs.
 */
public class BiFunctionDemo {

    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction = ((students, studentPredicate) -> {
            Map<String,Double> studentGradeMap = new HashMap<>();
            students.forEach(student -> {
                if(studentPredicate.test(student)) {
                    studentGradeMap.put(student.getName(),student.getGpa());
                }
            });
            return studentGradeMap;
    });

    public static void main(String[] args) {

        //It gives all students who grade level is greater than or equal to 3.
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),PredicateStudentDemo.p1));

        //It gives all students who grade level is greater than or equal to 3.9
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),PredicateStudentDemo.p2));

    }
}
