package com.java8.features.streams;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

/**
 * Use Case - Collect all the names of student in a list and print that list in the console.
 */
public class StreamsMapDemo {

    //going to return list of strings i.e. student names
    public static List<String> nameList(){
        // main objective here is map() method is converting one type to another type(converting the whole type)
        List<String> studentList = StudentDataBase.getAllStudents().stream() //here, it gives stream of students
                //map() method accept a function. Going to take in a type and return type
                //student object is coming as an input to the map() method and we are transforming
                //map() method is converting student object to a name which is of type string
                .map(Student::getName) // here, input is Student and output is just student names
                .map(String::toUpperCase) //here,this map() method is performing uppercase operation  on each input
                .collect(toList()); //here, it is collecting whole stream of string to a list
        return studentList;
    }

    //going to return set of strings i.e. student names
    public static Set<String> nameSet(){
        Set<String> studentSet = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(toSet());
        return studentSet;
    }

    public static void main(String[] args) {

        //both the output is giving the same result but the collection type is different
        System.out.println(nameList());
        System.out.println(nameSet());





    }
}
