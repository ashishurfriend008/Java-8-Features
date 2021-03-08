package com.java8.features.functionalinterfaces;

/**
 * Author
 * Ashish Kumar Dey
 */

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

/**
 * Use case - This is going to accept String as an input and then it is going
 * to perform an upper case operation and print value in console.
 */
public class ConsumerDemo {

    static Consumer<Student> c2 = (student) -> System.out.println(student); // Consumer interface accepts type as Student
    //Here, Consumer implementation take the Student as input and print that value in the console.
    static Consumer<Student> c3 =(student) -> System.out.print(student.getName());
    static Consumer<Student> c4 =(student) -> System.out.println(student.getActivities());

    public static void printStudentNames(){
        System.out.println("---Print Student Names---");
        List<Student> studentList = StudentDataBase.getAllStudents(); // return list of student from StudentDataBase class
        studentList.forEach(c2); // iterate and print all student which are part of this list -
        // Here forEach loop does that same which accepts consumer implementation i.e. c2 as input
        }

        //print the name and list of activities that particular student performs
        public static void printNameAndActivities(){
            System.out.println("---Print Name & Activities---");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c3.andThen(c4)); // consumer chaining
        }

        //print the name and list of activities that particular student performs
        public static void printNameAndActivitiesUsingCondition(){
            System.out.println("---Print Name & Activities Using Condition---");
            List<Student> studentList = StudentDataBase.getAllStudents();
            //inline lambda consumer interface implementation
            // - forEach loop gives access to students to perform filtering operations
            studentList.forEach((student -> {
                if(student.getGradeLevel() >= 3 && student.getGpa() >= 3.9){
                    c3.andThen(c4).accept(student);
                }
            })); // consumer chaining
        }





    public static void main(String[] args) {

        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase()); //s is the reference variable
        c1.accept("ashish");

        printStudentNames();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();


    }
}

/**
 * Here, lambda embraces the code reusability
 */
