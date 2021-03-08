package com.java8.features.functionalinterfaces;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;
import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentDemo {
    /**
     * Defining the conditions where you can use these conditions throughout your project
     * and not only these conditions confined to this class.
     * This is done in order to avoid code duplication and reuse the code as much as you can.
     */

    // input it is accepted as Student and if getGradeLevel() returns true if it is >=3
    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;

    static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

    public static void filterStudentsByGradeLevel(){
        System.out.println("--- Filter Students By Grade Level ---");
        //student collection
        List<Student> studentList =  StudentDataBase.getAllStudents();
        //iterate each and every student and forEach() method takes in consumer interface
        studentList.forEach((student -> {
            //lambda body as per the required lambda expression
            //inline lambda consumer interface that uses the predicate functional interface
            if(p1.test(student)){
                System.out.println(student);
            }
        }));
    }

    public static void filterStudentsByGpa(){
        System.out.println("--- Filter Students By GPA ---");
        //student collection
        List<Student> studentList =  StudentDataBase.getAllStudents();
        //iterate each and every student and forEach() method takes in consumer interface
        studentList.forEach((student -> {
            //lambda body as per the required lambda expression
            //inline lambda consumer interface that uses the predicate functional interface
            if(p2.test(student)){
                System.out.println(student);
            }
        }));
    }

    public static void filterStudentsByAndOperation(){
        System.out.println("--- Filter Students By And Operation ---");
        //student collection
        List<Student> studentList =  StudentDataBase.getAllStudents();
        //iterate each and every student and forEach() method takes in consumer interface
        studentList.forEach((student -> {
            //lambda body as per the required lambda expression
            //inline lambda consumer interface that uses the predicate functional interface
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }
        }));
    }

    public static void filterStudentsByOrOperation(){
        System.out.println("--- Filter Students By Or Operation ---");
        //student collection
        List<Student> studentList =  StudentDataBase.getAllStudents();
        //iterate each and every student and forEach() method takes in consumer interface
        studentList.forEach((student -> {
            //lambda body as per the required lambda expression
            //inline lambda consumer interface that uses the predicate functional interface
            if(p1.or(p2).test(student)){
                System.out.println(student);
            }
        }));
    }

    public static void filterStudentsByNegateOperation(){
        System.out.println("--- Filter Students By Negate Operation ---");
        //student collection
        List<Student> studentList =  StudentDataBase.getAllStudents();
        //iterate each and every student and forEach() method takes in consumer interface
        studentList.forEach((student -> {
            //lambda body as per the required lambda expression
            //inline lambda consumer interface that uses the predicate functional interface
            if(p1.or(p2).negate().test(student)){
                System.out.println(student);
            }else{
                System.out.println(student);
            }
        }));
    }

    public static void main(String[] args) {

        filterStudentsByGradeLevel();

        filterStudentsByGpa();

        filterStudentsByAndOperation();

        filterStudentsByOrOperation();

        filterStudentsByNegateOperation();

    }
}
