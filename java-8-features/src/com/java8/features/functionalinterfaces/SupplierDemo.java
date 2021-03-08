package com.java8.features.functionalinterfaces;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    //create instance of supplier and going to return a student
    static Supplier<Student> studentSupplier = () -> {
            return new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
    };

    //list of students
    static Supplier<List<Student>> allStudent = () -> StudentDataBase.getAllStudents();

    public static void main(String[] args) {

        System.out.println("Student :- " +studentSupplier.get());

        System.out.println("All Student :- " +allStudent.get());

    }
}
