package com.java8.features.methodreference;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceDemo {


      //static Consumer<Student> p1 = (s) -> System.out.println(s);
      //classname::methodName
      static Consumer<Student> p1 = System.out::println;

      //classname::instanceMethodName
      static Consumer<Student> c2 = Student::printListOfActivities;


    public static void main(String[] args) {

        StudentDataBase.getAllStudents().forEach(p1);
        StudentDataBase.getAllStudents().forEach(c2);


    }
}
