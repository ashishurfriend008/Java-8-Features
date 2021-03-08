package com.java8.features.functionalinterfaces;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerDemo {

    public static void nameAndActivities(){
        //name stands for type string and activities stand for type list of string
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name +" : " +activities);
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> biConsumer.accept(student.getName(),student.getActivities()));
    }

    public static void main(String[] args) {

        BiConsumer<String,String> biConsumer = (a, b) -> {
            System.out.println("a :- "+ a + ", b :- " +b);
        };

        biConsumer.accept("Ashish" , "Swati");

        //Use Case - multiplication and division operations on numbers
        BiConsumer<Integer,Integer>  multiply = (a,b) -> {
            System.out.println("Multiplication is "+ (a*b));
        };

        BiConsumer<Integer, Integer> division = (a,b) -> {
            System.out.println("Division is "+(a/b));
        };

        multiply.andThen(division).accept(10, 5);

        nameAndActivities();
    }
}
