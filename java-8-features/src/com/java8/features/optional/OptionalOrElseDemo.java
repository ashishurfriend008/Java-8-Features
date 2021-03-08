package com.java8.features.optional;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.Optional;

/**
 * The only difference between orElse() and orElseGet() is orElse() accepts string
 * and orElseGet() accepts supplier. If there is no data available then i want to
 * throw the exception back to the caller.In those kind of use cases use orElseThrow.
 */
public class OptionalOrElseDemo {

    //or Else
    public static String optionalOrElse(){

      /*  Optional<Student> studentOptional =
              Optional.ofNullable(StudentDataBase.studentSupplier.get()); */
        Optional<Student> studentOptional =
                Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }

    //orElseGet
    public static String optionalOrElseGet(){

        Optional<Student> studentOptional =
              Optional.ofNullable(StudentDataBase.studentSupplier.get());
       /* Optional<Student> studentOptional =
                Optional.ofNullable(null); */
        String name = studentOptional.map(Student::getName).orElseGet(() -> "Default");
        return name;
    }

    //orElseThrow
    public static String optionalOrElseThrow(){

      /*  Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get()); */
        Optional<Student> studentOptional =
                Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName)
                .orElseThrow(() -> new RuntimeException("No Data Available"));
        return name;
    }

    public static void main(String[] args){

        System.out.println("orElse :- "+optionalOrElse());
        System.out.println("orElseGet :- "+optionalOrElseGet());
        System.out.println("orElseThrow :- "+optionalOrElseThrow());

    }
}
