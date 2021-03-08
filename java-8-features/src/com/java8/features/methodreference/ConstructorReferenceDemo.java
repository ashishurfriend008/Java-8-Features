package com.java8.features.methodreference;

/**
 * We can only use constructor reference in the contex of functional interfaces
 */

import com.java8.features.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceDemo {

    static Supplier<Student> studentSupplier = Student::new;

    static Function<String,Student> studentFunction = Student::new;

    public static void main(String[] args) {

        //populated all attributes as null
        System.out.println(studentSupplier.get());

        //print name as ABC instead of null
        System.out.println(studentFunction.apply("ABC"));

    }
}
