package com.java8.features.streams;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

/**
 * Use case - How many number of note books each and every student has.
 */
public class StreamMapReduceDemo {

    public static int noOfNoteBooks(){

        int numOfNoteBooks = StudentDataBase.getAllStudents().stream()
                //no.of students who has grade level as 3 and above
                .filter((student -> student.getGradeLevel() >= 3))
                //filter out whose gender is female
                .filter(student -> student.getGender().equals("female"))
                /*
                create stream of integers."::" is the method reference syntax.
                We are trying to access no. of note books i.e. notebook value.

                 */
                .map(Student::getNoteBooks)
                /*
                the reduce operation is going to perform the summation of all the values in the stream.
                Here, we are passing 0 as the initial value because we are performing the summation.
                 */
                //.reduce(0,(a,b) -> a+b);
                .reduce(0, Integer::sum); //alternate approach to above reduce statement

        return numOfNoteBooks;
    }

    public static void main(String[] args){

        System.out.println("numOfNoteBooks :-" +noOfNoteBooks());

    }
}
