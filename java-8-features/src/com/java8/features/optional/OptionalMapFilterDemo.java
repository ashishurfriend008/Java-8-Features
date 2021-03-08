package com.java8.features.optional;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFilterDemo {

    //filter
    public static void optionalFilter(){
        Optional<Student> studentOptional = Optional.
                ofNullable(StudentDataBase.studentSupplier.get());
        studentOptional.
                filter(student -> student.getGpa() >= 3.5)
                        .ifPresent(student -> System.out.println(student));
    }

    //map
    public static void optionalMap(){
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        if(studentOptional.isPresent()){
            Optional<String> stringOptional =
                    studentOptional.filter(student -> student.getGpa() >= 3.5)
                    .map(Student::getName);
            System.out.println(stringOptional.get());
        }
    }

    public static void main(String[] args){
                optionalFilter();
                optionalMap();


    }
}
