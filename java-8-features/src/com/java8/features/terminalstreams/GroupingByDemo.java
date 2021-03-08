package com.java8.features.terminalstreams;

import com.java8.features.data.Student;
import com.java8.features.data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;
import static java.util.stream.Collectors.collectingAndThen;

public class GroupingByDemo {

    //group the students based on their gender
    public static void groupStudentsByGender(){
     Map<String, List<Student>> stringListMap =  StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));
        System.out.println(stringListMap);
    }

    //Grouping the students based on customized implementation of groupingBy.
    public static void customizedGroupingBy(){
        Map<String, List<Student>> studentMap =  StudentDataBase.getAllStudents()
                .stream() //Stream<Student>
                .collect(groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
        System.out.println(studentMap);
    }

    //two level grouping part 1
    public static void twoLevelGrouping_1(){
            Map<Integer, Map<String, List<Student>>> studentMapTwoLevelGrouping1 = StudentDataBase.getAllStudents()
                    .stream()
                    .collect(groupingBy(Student::getGradeLevel,
                            groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
        System.out.println(studentMapTwoLevelGrouping1);
    }

    //two level grouping part 2
    public static void twoLevelGrouping_2(){
        Map<String, Integer> studentMapTwoLevelGrouping2 = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,
                        summingInt(Student::getNoteBooks)));
        System.out.println(studentMapTwoLevelGrouping2);
    }

    public static void threeLevelGroupingBy(){
        LinkedHashMap<String, Set<Student>> studentLinkedHashMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName,
                        LinkedHashMap::new,toSet()));
        System.out.println(studentLinkedHashMap);
    }

    /*
    two argument version of groupingBy.It is used to calculate the top Gpa
    student in each grade.
     */
    public static  void calculateTopGpa(){
        Map<Integer, Optional<Student>> studentMapOptional =  StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(studentMapOptional);
    }

    /*
    Instead of wrapping the student inside Optional CollectingAndThen get the student
    if it is avilable and assign that as an value.
     */
    public static  void calculateTopGpaWithoutOptional(){
        Map<Integer, Student> studentMapOptional1 =  StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));
        System.out.println(studentMapOptional1);
    }

    //Calculate the least Gpa student in each grade
    public static  void calculateLeastGpa(){
        Map<Integer, Optional<Student>> studentMapOptionalLeastGpa =  StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        minBy(Comparator.comparing(Student::getGpa))));
        System.out.println(studentMapOptionalLeastGpa);
    }

    public static  void calculateLeastGpaWithoutOptional(){
        Map<Integer, Student> studentMapOptional1LeastGpa =  StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(minBy(Comparator.comparing(Student::getGpa)),Optional::get)));
        System.out.println(studentMapOptional1LeastGpa);
    }





    public static void main(String[] args){

        //groupStudentsByGender();

        //customizedGroupingBy();

      //  twoLevelGrouping_1();

        // twoLevelGrouping_2();

        //threeLevelGroupingBy();

        //calculateTopGpa();

        //calculateTopGpaWithoutOptional();

        //calculateLeastGpa();

        calculateLeastGpaWithoutOptional();


    }
}
