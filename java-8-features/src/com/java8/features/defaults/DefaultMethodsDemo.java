package com.java8.features.defaults;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Default Methods
 * Use Case - Sort the list of names in alphabetical order
 */

public class DefaultMethodsDemo {

    public static void main(String [] args){

        List<String> stringList = Arrays.asList("Adam", "James", "Alex", "Mike", "Disc");

        /**
         *  Prior java 8 - The whole input list is sorted in ascending order
         */
        Collections.sort(stringList);

        System.out.println("Sorted list using Collections.sort() :- " +stringList);

        /**
         * Java 8 - We are using the sort() method as part of list interface and this
         * sort() method is the default method that is part of list interface.
         */
        stringList.sort(Comparator.naturalOrder());

        System.out.println("Sorted list using List.sort() :- " +stringList);

        /**
         * Reverse the result
         */
        stringList.sort(Comparator.reverseOrder());

        System.out.println("Sorted list using List.sort() reverse :- " +stringList);


    }
}
