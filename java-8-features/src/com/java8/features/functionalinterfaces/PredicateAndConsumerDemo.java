package com.java8.features.functionalinterfaces;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerDemo {

    /**
     *We are going to create instance method because lambda behaves the same irrespective of
     * instance method or a static method.
     * Advantage of using Predicate and Consumer both as it gives the code base modularized.
     *
     */

    //create instance of predicate of grade and gpa levels
    Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

    //Once evaluated if this is true than true boolean
    // result will be return and if it is false than false boolean result will return
    BiPredicate<Integer,Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name +" : " +activities);

    // Accept student and perform filtering operation
    Consumer<Student> studentConsumer = (student -> {
        //print the name and list of activities. For that, created BiConsumer
        if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    });

    /*
    // Accept student and perform filtering operation
    Consumer<Student> studentConsumer = (student -> {
            //print the name and list of activities. For that, created BiConsumer
            if(p1.and(p2).test(student)){
                studentBiConsumer.accept(student.getName(), student.getActivities());
            }
    });
    */
    public void printNameAndActivities(List<Student> students){
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerDemo().printNameAndActivities(studentList);

    }
}
