package com.java8.features.optional;


import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.Optional;

/**
 * Use - create a method which is going to return string i.e. name of students
 * and then we are going to print the length of that name.
 */
public class OptionalDemo {

    public static String getStudentName(){

        Student student = StudentDataBase.studentSupplier.get();

        if(student != null){
            return student.getName();
        }else {
            return  null;
        }
    }

    //Student name not available in database
    public static String getStudentNameNotAvailableInDB(){

        Student student = null;
        if(student != null){
            return student.getName();
        }else {
            return  null;
        }
    }

    public static Optional<String> getStudentNameOptional(){

        //basically we are wrapping the actual student object inside th optional
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());

        //return Optional.empty
        Optional<Student> studentOptionalEmpty = Optional.ofNullable(null);

        if(studentOptional.isPresent()){

                 //this is to get the student object
                 studentOptional.get();
                //We use map() method to get actual names of students
                return studentOptional.map(Student::getName);
        }else if(studentOptionalEmpty.isPresent()){
            return studentOptionalEmpty.map(Student::getName);
        }
                //represents optional object with no value
                return Optional.empty();
    }

    public static  void main(String[] args){

        String name1 = getStudentName();
        System.out.println("Length of the student name1 :- " +name1.length());

        String name2 = getStudentNameNotAvailableInDB();
        if(name2 != null){
            System.out.println("Length of the student name2 :- " +name2.length());
        }else{
            System.out.println("Name2 Not Found");
        }

        Optional<String> stringOptional = getStudentNameOptional();
        if(stringOptional.isPresent()){
            //return string which is student name
            System.out.println("The length of the student name with optional :- " +stringOptional.get().length() );
            System.out.println("The length of the student name with optional as empty :- " +stringOptional.get().length() );
        }else{
            System.out.println("The length of the student name with optional not found");
        }

    }

}
