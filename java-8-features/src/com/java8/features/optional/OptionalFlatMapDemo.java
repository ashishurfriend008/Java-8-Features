package com.java8.features.optional;

import com.java8.features.data.Bike;
import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.Optional;

/**
 * Want bike name and print that bike name as output.
 * FlatMap is used to get an Optional object inside another Optional object
 */
public class OptionalFlatMapDemo {

    public static void optionalFlatMap(){
        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        //Optional<Student  <Optional<Bike>>
        Optional<String> name = studentOptional.filter(student -> student.getGpa() >=3.5)
                .flatMap(Student::getBike) //returns Optional<Bike>
                .map(Bike::getName);

        name.ifPresent(s -> System.out.println("name :- " + s));

    }

    public static void main(String[] args){

        optionalFlatMap();
    }
}
