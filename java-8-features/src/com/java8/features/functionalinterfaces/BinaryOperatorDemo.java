package com.java8.features.functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

    static BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;

    //instance of comparator. Comparator requires two inputs and
    // compare two integer and returns integer again
    static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);

    //create instance of BinaryOperator and name as maxBy and pass comparator
    static BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);

    static BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);

    public static void main(String[] args) {

        System.out.println("The result is " +binaryOperator.apply(3,4));

        System.out.println("Result of maxBy is "+maxBy.apply(4,5));

        System.out.println("Result of minBy is "+minBy.apply(4,5));

    }
}
