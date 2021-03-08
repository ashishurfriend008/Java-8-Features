package com.java8.features.methodreference;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceDemo {

    // input it is accepted as Student and if getGradeLevel() returns true if it is >=3
    //static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;

    static Predicate<Student> p2 = RefactorMethodReferenceDemo::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel(Student s){
        return s.getGradeLevel() >= 3;
    }

    public static void main(String[] args) {

        System.out.println(p2.test(StudentDataBase.studentSupplier.get()));

    }
}
